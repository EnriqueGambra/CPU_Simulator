import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JComboBox;
import javax.swing.*;
import java.util.Random;

public class Processes extends JPanel//This class creates all the components for the GUI
{
    // Creating global variables related to the components in this class
    
    // the drop down menu for choosing algorithms
    private String[] schedulingAlgo = {"Please Choose", "1. FCFS", "2. SJF", "3. Priority"};
    private JComboBox algoCombo = new JComboBox(schedulingAlgo);
    private String algoSelected = "1. FCFS";
    
    // the drop down menu for choosing the number of processes
    private Integer[] processList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
    private JComboBox<Integer> processCombo = new JComboBox(processList);
    private int numOfProcesses = 0;
    
    private JButton buttonExecute = new JButton("Execute");
    
    private int[] burstValues; // an array holding burst values for each process
    private HashMap<Integer, Integer> mapBurst = new HashMap<Integer, Integer>();
    private HashMap<Integer, Integer[]> priorityBurst = new HashMap <Integer, Integer[]>();
    
    // text fields to appear based on the number of processes selected
    private JTextField text1 = new JTextField("0");
    private JTextField text2 = new JTextField("0");
    private JTextField text3 = new JTextField("0");
    private JTextField text4 = new JTextField("0");
    private JTextField text5 = new JTextField("0");
    private JTextField text6 = new JTextField("0");
    private JTextField text7 = new JTextField("0");
    private JTextField text8 = new JTextField("0");
    private JTextField text9 = new JTextField("0");
    private JTextField text10 = new JTextField("0");
    private JTextField text11 = new JTextField("0");
    
    // labels to appear based on the number of processes selected
    private JLabel label1 = new JLabel("Process 1");
    private JLabel label2 = new JLabel("Process 2");
    private JLabel label3 = new JLabel("Process 3");
    private JLabel label4 = new JLabel("Process 4");
    private JLabel label5 = new JLabel("Process 5");
    private JLabel label6 = new JLabel("Process 6");
    private JLabel label7 = new JLabel("Process 7");
    private JLabel label8 = new JLabel("Process 8");
    private JLabel label9 = new JLabel("Process 9");
    private JLabel label10 = new JLabel("Process 10");
    private JLabel label11 = new JLabel("Process 11");
    
    private JTextField textP1 = new JTextField("0");
    private JTextField textP2 = new JTextField("0");
    private JTextField textP3 = new JTextField("0");
    private JTextField textP4 = new JTextField("0");
    private JTextField textP5 = new JTextField("0");
    private JTextField textP6 = new JTextField("0");
    private JTextField textP7 = new JTextField("0");
    private JTextField textP8 = new JTextField("0");
    private JTextField textP9 = new JTextField("0");
    private JTextField textP10 = new JTextField("0");
    private JTextField textP11 = new JTextField("0");
    
    private JLabel labelPriority = new JLabel("Set Priorities");
    
    private JTextField[] text;
    private JLabel[] label;
    private JTextField[] textP;
            
    private JLabel[] labelGantt;
    
    private JLabel comboLabel = new JLabel("Select number of Processes");
    private JLabel scheduleLabel = new JLabel("Select the algorithm you'd like to use");
    private JButton buttonReset = new JButton("Reset");
    private JButton buttonRandom = new JButton("Random");
    private JButton buttonMoreInfo = new JButton("More Info");
    
    private FCFS obj1;
    
    private Priority[] object;
    private Priority priorityArray = new Priority();
   
    
    private AlgoSJF[] ObjectSJFArray;
    private AlgoSJF ObjectSJF = new AlgoSJF();
    
    public Processes()//Calls methods to draw components
    {
        super();
        setLayout(null);
        setBounds(0, 0, 900, 600);
        
        
        drawComboBox();
        drawExecuteButton();
        drawSchedulingAlgos();
        drawResetButton();
        drawRandomizeButton();
        drawMoreInfoButton();
        repaint();
        
        JOptionPane.showMessageDialog(null, "Welcome! Please press the more info"
                  + " button to get information about how this program works.");
         
    }

    public void drawMoreInfoButton()
    {
        buttonMoreInfo.setBounds(280, 350, 90, 30);
        handleEvent handler = new handleEvent();
        buttonMoreInfo.addActionListener(handler);
        add(buttonMoreInfo);
    }
    
    // this function places the reset button on the jpanel
    // reset button causes simulation to return to its original state
    public void drawResetButton()
    {
        buttonReset.setBounds(280, 290, 90, 30);
        handleEvent handler = new handleEvent();
        buttonReset.addActionListener(handler);
        add(buttonReset);
    }
    
    // placing the randomize button on the jpanel
    // the randomize button is used to enter random values for burst times
    public void drawRandomizeButton()
    {
        buttonRandom.setBounds(280, 170, 90, 30);
        handleEvent handler = new handleEvent();
        buttonRandom.addActionListener(handler);
        add(buttonRandom);   
    }
    
    // this combo box represents the process options
    public void drawComboBox()
    {
        comboLabel.setBounds(15, 15, 180, 20);
        processCombo.setBounds(50, 40, 80, 30);
        add(processCombo);
        add(comboLabel);
        handleEvent handler = new handleEvent();
        processCombo.addActionListener(handler);
    }
    
    // we want to set the global variable of number of processes
    // with the specified number that the user asks for 
    public void setNumOfProcess(int numOfProcesses)
    {
        this.numOfProcesses = numOfProcesses;
        //System.out.println("In setNumOfProcess " + this.numOfProcesses);
    }
    
    // returns the number of processes that user specified
    public int getNumOfProcess()
    {
        //System.out.println("In getNumOfProcesses " + numOfProcesses);
        return numOfProcesses;
    }

    // the execute button is drawn onto the jpanel
    // the execute button will run the simulation
    public void drawExecuteButton() 
    {
       buttonExecute.setBounds(280, 230, 90, 30);
       handleEvent handler = new handleEvent();
       buttonExecute.addActionListener(handler);
       add(buttonExecute);
    }

    // this function draws the drop down menu with the algorithms
    public void drawSchedulingAlgos() 
    {
        scheduleLabel.setBounds(220, 15, 330, 20);
        algoCombo.setBounds(250, 40, 160, 30);
        handleEvent handler = new handleEvent();
        algoCombo.addActionListener(handler);
        add(algoCombo);
        add(scheduleLabel);
    }
    
    // setting the global variable algoSelected with the one the user selected
    // or default
    public void setAlgoSelected(String algoSelected)
    {
        this.algoSelected = algoSelected;
    }
    
    // returns the scheduling algorithm
    public String getAlgoSelected()
    {
        return algoSelected;
    }
 
    // this function draws every label and process according to the
    // number selected by the user
    public void drawTextAndLabels(int numOfProcesses)
    {
        // we are positioning all the labels on the jpanel
        // these labels represent the process #
        label1.setBounds(10, 90, 80, 20);
        label2.setBounds(10, 130, 80, 20);
        label3.setBounds(10, 170, 80, 20);
        label4.setBounds(10, 210, 80, 20);
        label5.setBounds(10, 250, 80, 20);
        label6.setBounds(10, 290, 80, 20);
        label7.setBounds(10, 330, 80, 20);
        label8.setBounds(10, 370, 80, 20);
        label9.setBounds(10, 410, 80, 20);
        label10.setBounds(10, 450, 80, 20);
        label11.setBounds(10, 490, 80, 20);
        
        // we are positioning all the text fields on the jpanel
        // these text fields allow the user to enter burst time for each process
        text1.setBounds(90, 90, 40, 20);
        text2.setBounds(90, 130, 40, 20);
        text3.setBounds(90, 170, 40, 20);
        text4.setBounds(90, 210, 40, 20);
        text5.setBounds(90, 250, 40, 20);
        text6.setBounds(90, 290, 40, 20);
        text7.setBounds(90, 330, 40, 20);
        text8.setBounds(90, 370, 40, 20);
        text9.setBounds(90, 410, 40, 20);
        text10.setBounds(90, 450, 40, 20);
        text11.setBounds(90, 490, 40, 20);
        
        add(text1);
        add(text2);
        add(text3);
        add(text4);
        add(text5);
        add(text6);
        add(text7);
        add(text8);
        add(text9);
        add(text10);
        add(text11);
        
        add(label1);
        add(label2);
        add(label3);
        add(label4);
        add(label5);
        add(label6);
        add(label7);
        add(label8);
        add(label9);
        add(label10);
        add(label11);
        
        // the following if statements will draw certain number of text fields
        // and labels given the number of processes selected
        if(numOfProcesses == 1)
        {
            text1.setVisible(true);
            text2.setVisible(false);
            text3.setVisible(false);
            text4.setVisible(false);
            text5.setVisible(false);
            text6.setVisible(false);
            text7.setVisible(false);
            text8.setVisible(false);
            text9.setVisible(false);
            text10.setVisible(false);
            text11.setVisible(false);
            
            label1.setVisible(true);
            label2.setVisible(false);
            label3.setVisible(false);
            label4.setVisible(false);
            label5.setVisible(false);
            label6.setVisible(false);
            label7.setVisible(false);
            label8.setVisible(false);
            label9.setVisible(false);
            label10.setVisible(false);
            label11.setVisible(false);
            
            repaint();
        }
        else if(numOfProcesses == 2)
        {
            text1.setVisible(true);
            text2.setVisible(true);
            text3.setVisible(false);
            text4.setVisible(false);
            text5.setVisible(false);
            text6.setVisible(false);
            text7.setVisible(false);
            text8.setVisible(false);
            text9.setVisible(false);
            text10.setVisible(false);
            text11.setVisible(false);
            
            
            label1.setVisible(true);
            label2.setVisible(true);
            label3.setVisible(false);
            label4.setVisible(false);
            label5.setVisible(false);
            label6.setVisible(false);
            label7.setVisible(false);
            label8.setVisible(false);
            label9.setVisible(false);
            label10.setVisible(false);
            label11.setVisible(false);
            
            repaint();
        }
        else if(numOfProcesses == 3)
        {
            text1.setVisible(true);
            text2.setVisible(true);
            text3.setVisible(true);
            text4.setVisible(false);
            text5.setVisible(false);
            text6.setVisible(false);
            text7.setVisible(false);
            text8.setVisible(false);
            text9.setVisible(false);
            text10.setVisible(false);
            text11.setVisible(false);
            
            label1.setVisible(true);
            label2.setVisible(true);
            label3.setVisible(true);
            label4.setVisible(false);
            label5.setVisible(false);
            label6.setVisible(false);
            label7.setVisible(false);
            label8.setVisible(false);
            label9.setVisible(false);
            label10.setVisible(false);
            label11.setVisible(false);
            
            repaint();
        }
        else if(numOfProcesses == 4)
        {
            text1.setVisible(true);
            text2.setVisible(true);
            text3.setVisible(true);
            text4.setVisible(true);
            text5.setVisible(false);
            text6.setVisible(false);
            text7.setVisible(false);
            text8.setVisible(false);
            text9.setVisible(false);
            text10.setVisible(false);
            text11.setVisible(false);
            
            label1.setVisible(true);
            label2.setVisible(true);
            label3.setVisible(true);
            label4.setVisible(true);
            label5.setVisible(false);
            label6.setVisible(false);
            label7.setVisible(false);
            label8.setVisible(false);
            label9.setVisible(false);
            label10.setVisible(false);
            label11.setVisible(false);
            
            
            repaint();
        }
        else if(numOfProcesses == 5)
        {
            text1.setVisible(true);
            text2.setVisible(true);
            text3.setVisible(true);
            text4.setVisible(true);
            text5.setVisible(true);
            text6.setVisible(false);
            text7.setVisible(false);
            text8.setVisible(false);
            text9.setVisible(false);
            text10.setVisible(false);
            text11.setVisible(false);
            
            label1.setVisible(true);
            label2.setVisible(true);
            label3.setVisible(true);
            label4.setVisible(true);
            label5.setVisible(true);
            label6.setVisible(false);
            label7.setVisible(false);
            label8.setVisible(false);
            label9.setVisible(false);
            label10.setVisible(false);
            label11.setVisible(false);
            
            repaint();
        }
        else if(numOfProcesses == 6)
        {
            text1.setVisible(true);
            text2.setVisible(true);
            text3.setVisible(true);
            text4.setVisible(true);
            text5.setVisible(true);
            text6.setVisible(true);
            text7.setVisible(false);
            text8.setVisible(false);
            text9.setVisible(false);
            text10.setVisible(false);
            text11.setVisible(false);
            
            label1.setVisible(true);
            label2.setVisible(true);
            label3.setVisible(true);
            label4.setVisible(true);
            label5.setVisible(true);
            label6.setVisible(true);
            label7.setVisible(false);
            label8.setVisible(false);
            label9.setVisible(false);
            label10.setVisible(false);
            label11.setVisible(false);
            
            repaint();
        }
        else if(numOfProcesses == 7)
        {
            text1.setVisible(true);
            text2.setVisible(true);
            text3.setVisible(true);
            text4.setVisible(true);
            text5.setVisible(true);
            text6.setVisible(true);
            text7.setVisible(true);
            text8.setVisible(false);
            text9.setVisible(false);
            text10.setVisible(false);
            text11.setVisible(false);
            
            label1.setVisible(true);
            label2.setVisible(true);
            label3.setVisible(true);
            label4.setVisible(true);
            label5.setVisible(true);
            label6.setVisible(true);
            label7.setVisible(true);
            label8.setVisible(false);
            label9.setVisible(false);
            label10.setVisible(false);
            label11.setVisible(false);
            
            repaint();
        }
        else if(numOfProcesses == 8)
        {
            text1.setVisible(true);
            text2.setVisible(true);
            text3.setVisible(true);
            text4.setVisible(true);
            text5.setVisible(true);
            text6.setVisible(true);
            text7.setVisible(true);
            text8.setVisible(true);
            text9.setVisible(false);
            text10.setVisible(false);
            text11.setVisible(false);
            
            label1.setVisible(true);
            label2.setVisible(true);
            label3.setVisible(true);
            label4.setVisible(true);
            label5.setVisible(true);
            label6.setVisible(true);
            label7.setVisible(true);
            label8.setVisible(true);
            label9.setVisible(false);
            label10.setVisible(false);
            label11.setVisible(false);
            
            repaint();
        }
        else if(numOfProcesses == 9)
        {
            text1.setVisible(true);
            text2.setVisible(true);
            text3.setVisible(true);
            text4.setVisible(true);
            text5.setVisible(true);
            text6.setVisible(true);
            text7.setVisible(true);
            text8.setVisible(true);
            text9.setVisible(true);
            text10.setVisible(false);
            text11.setVisible(false);
            
            label1.setVisible(true);
            label2.setVisible(true);
            label3.setVisible(true);
            label4.setVisible(true);
            label5.setVisible(true);
            label6.setVisible(true);
            label7.setVisible(true);
            label8.setVisible(true);
            label9.setVisible(true);
            label10.setVisible(false);
            label11.setVisible(false);
            
            repaint();
        }
        else if(numOfProcesses == 10)
        {
            text1.setVisible(true);
            text2.setVisible(true);
            text3.setVisible(true);
            text4.setVisible(true);
            text5.setVisible(true);
            text6.setVisible(true);
            text7.setVisible(true);
            text8.setVisible(true);
            text9.setVisible(true);
            text10.setVisible(true);
            text11.setVisible(false);
            
            label1.setVisible(true);
            label2.setVisible(true);
            label3.setVisible(true);
            label4.setVisible(true);
            label5.setVisible(true);
            label6.setVisible(true);
            label7.setVisible(true);
            label8.setVisible(true);
            label9.setVisible(true);
            label10.setVisible(true);
            label11.setVisible(false);
            
            repaint();
        }
        else if(numOfProcesses == 11)
        {
            text1.setVisible(true);
            text2.setVisible(true);
            text3.setVisible(true);
            text4.setVisible(true);
            text5.setVisible(true);
            text6.setVisible(true);
            text7.setVisible(true);
            text8.setVisible(true);
            text9.setVisible(true);
            text10.setVisible(true);
            text11.setVisible(true);
            
            label1.setVisible(true);
            label2.setVisible(true);
            label3.setVisible(true);
            label4.setVisible(true);
            label5.setVisible(true);
            label6.setVisible(true);
            label7.setVisible(true);
            label8.setVisible(true);
            label9.setVisible(true);
            label10.setVisible(true);
            label11.setVisible(true);
            
            repaint();
        }
        
    }
     
    public void erasePriority()
    {
            textP1.setVisible(false);
            textP2.setVisible(false);
            textP3.setVisible(false);
            textP4.setVisible(false);
            textP5.setVisible(false);
            textP6.setVisible(false);
            textP7.setVisible(false);
            textP8.setVisible(false);
            textP9.setVisible(false);
            textP10.setVisible(false);
            textP11.setVisible(false);
            
            labelPriority.setVisible(false);
    }
    
    public void drawPriority(int processNum)//Draws the textfields and label neccessary for the Priority algorithm
    {
        textP1.setBounds(170, 90, 40, 20);
        textP2.setBounds(170, 130, 40, 20);
        textP3.setBounds(170, 170, 40, 20);
        textP4.setBounds(170, 210, 40, 20);
        textP5.setBounds(170, 250, 40, 20);
        textP6.setBounds(170, 290, 40, 20);
        textP7.setBounds(170, 330, 40, 20);
        textP8.setBounds(170, 370, 40, 20);
        textP9.setBounds(170, 410, 40, 20);
        textP10.setBounds(170, 450, 40, 20);
        textP11.setBounds(170, 490, 40, 20);
        
        labelPriority.setBounds(170, 70, 80, 20);
        
        add(textP1);
        add(textP2);
        add(textP3);
        add(textP4);
        add(textP5);
        add(textP6);
        add(textP7);
        add(textP8);
        add(textP9);
        add(textP10);
        add(textP11);
        add(labelPriority);
        
        labelPriority.setVisible(true);
        
        if(processNum == 1)
        {
            textP1.setVisible(true);
            textP2.setVisible(false);
            textP3.setVisible(false);
            textP4.setVisible(false);
            textP5.setVisible(false);
            textP6.setVisible(false);
            textP7.setVisible(false);
            textP8.setVisible(false);
            textP9.setVisible(false);
            textP10.setVisible(false);
            textP11.setVisible(false);
        }
        
        else if(processNum == 2)
        {
            textP1.setVisible(true);
            textP2.setVisible(true);
            textP3.setVisible(false);
            textP4.setVisible(false);
            textP5.setVisible(false);
            textP6.setVisible(false);
            textP7.setVisible(false);
            textP8.setVisible(false);
            textP9.setVisible(false);
            textP10.setVisible(false);
            textP11.setVisible(false);
        }
        
        else if(processNum == 3)
        {
            textP1.setVisible(true);
            textP2.setVisible(true);
            textP3.setVisible(true);
            textP4.setVisible(false);
            textP5.setVisible(false);
            textP6.setVisible(false);
            textP7.setVisible(false);
            textP8.setVisible(false);
            textP9.setVisible(false);
            textP10.setVisible(false);
            textP11.setVisible(false);
        }
        
        else if(processNum == 4)
        {
            textP1.setVisible(true);
            textP2.setVisible(true);
            textP3.setVisible(true);
            textP4.setVisible(true);
            textP5.setVisible(false);
            textP6.setVisible(false);
            textP7.setVisible(false);
            textP8.setVisible(false);
            textP9.setVisible(false);
            textP10.setVisible(false);
            textP11.setVisible(false);
        }
        else if(processNum == 5)
        {
            textP1.setVisible(true);
            textP2.setVisible(true);
            textP3.setVisible(true);
            textP4.setVisible(true);
            textP5.setVisible(true);
            textP6.setVisible(false);
            textP7.setVisible(false);
            textP8.setVisible(false);
            textP9.setVisible(false);
            textP10.setVisible(false);
            textP11.setVisible(false);
        }
        else if(processNum == 6)
        {
            textP1.setVisible(true);
            textP2.setVisible(true);
            textP3.setVisible(true);
            textP4.setVisible(true);
            textP5.setVisible(true);
            textP6.setVisible(true);
            textP7.setVisible(false);
            textP8.setVisible(false);
            textP9.setVisible(false);
            textP10.setVisible(false);
            textP11.setVisible(false);
        }
        else if(processNum == 7)
        {
            textP1.setVisible(true);
            textP2.setVisible(true);
            textP3.setVisible(true);
            textP4.setVisible(true);
            textP5.setVisible(true);
            textP6.setVisible(true);
            textP7.setVisible(true);
            textP8.setVisible(false);
            textP9.setVisible(false);
            textP10.setVisible(false);
            textP11.setVisible(false);
        }
        else if(processNum == 8)
        {
            textP1.setVisible(true);
            textP2.setVisible(true);
            textP3.setVisible(true);
            textP4.setVisible(true);
            textP5.setVisible(true);
            textP6.setVisible(true);
            textP7.setVisible(true);
            textP8.setVisible(true);
            textP9.setVisible(true);
            textP10.setVisible(false);
            textP11.setVisible(false);
        }
        else if(processNum == 9)
        {
            textP1.setVisible(true);
            textP2.setVisible(true);
            textP3.setVisible(true);
            textP4.setVisible(true);
            textP5.setVisible(true);
            textP6.setVisible(true);
            textP7.setVisible(true);
            textP8.setVisible(true);
            textP9.setVisible(true);
            textP10.setVisible(false);
            textP11.setVisible(false);
        }
         else if(processNum == 10)
        {
            textP1.setVisible(true);
            textP2.setVisible(true);
            textP3.setVisible(true);
            textP4.setVisible(true);
            textP5.setVisible(true);
            textP6.setVisible(true);
            textP7.setVisible(true);
            textP8.setVisible(true);
            textP9.setVisible(true);
            textP10.setVisible(true);
            textP11.setVisible(false);
        }
        else if(processNum == 11)
        {
            textP1.setVisible(true);
            textP2.setVisible(true);
            textP3.setVisible(true);
            textP4.setVisible(true);
            textP5.setVisible(true);
            textP6.setVisible(true);
            textP7.setVisible(true);
            textP8.setVisible(true);
            textP9.setVisible(true);
            textP10.setVisible(true);
            textP11.setVisible(true);
        }
    }
    
    /*public void moreModular(int processNum)   Method in which we tried to draw all the textfields and labels shown on the GUI in an array...
    {                                           Would have made the program much more modular however the repaint(); method was not cooperating
        int x = 90;
        int y = 90;
        int w = 40;
        int h = 20;
        
        int xL = 10;
        int yL = 90;
        int wL = 80;
        int hL = 20;
        
        String labelString;
        label1.setBounds(10, 90, 80, 20);
        label2.setBounds(10, 130, 80, 20);
        
        // this positions the text fields and the labels on the jpanel according
        // to the number of processes selected
        label = new JLabel[11];
        text = new JTextField[11];
        for(int i = 0; i < text.length; i++)
        {
            labelString = String.format("Process %d", i+1);
            label[i] = new JLabel(labelString);
            text[i] = new JTextField("0");
            if(i == 0)
            {
                text[i].setBounds(x, y, w, h);
                label[i].setBounds(xL, yL, wL, hL);
            }
            else
            {
                text[i].setBounds(x, y + (40 * i), w, h);
                label[i].setBounds(xL, yL + (40 * i), wL, hL);
            }
            add(text[i]);
            text[i].setVisible(false);
            
            add(label[i]);
            label[i].setVisible(false);
            
            repaint();
        }
        
        // this sets visible the text fields in accordance to the # of processes
        for(int z= 0; z <= processNum; z++)
        {
            text[z].setVisible(true);
            label[z].setVisible(true);
        }
        
        // this for loop sets the visibility of the text fields not needed to 
        // false .. e.g. if 5 processes selected, text fields 6-11 not shown
        for(int a = processNum; a < text.length; a++)
        {
            text[a].setVisible(false);
            label[a].setVisible(false);
            System.out.println(a);    
        }
        repaint();    
    }*/
    
    //These methods get the text values from either the Priority text values or burst text values and also sets them if the random button was pushed
    public int getTextP1()
    {
        int x = Integer.parseInt(textP1.getText());
        return x;
    }
    
    public int getTextP2()
    {
        int x = Integer.parseInt(textP2.getText());
        return x;
    }
    
    public int getTextP3()
    {
        int x = Integer.parseInt(textP3.getText());
        return x;
    }
    
    public int getTextP4()
    {
        int x = Integer.parseInt(textP4.getText());
        return x;
    }
    
    public int getTextP5()
    {
        int x = Integer.parseInt(textP5.getText());
        return x;
    }
    
    public int getTextP6()
    {
        int x = Integer.parseInt(textP6.getText());
        return x;
    }
    
    public int getTextP7()
    {
        int x = Integer.parseInt(textP7.getText());
        return x;
    }
    
    public int getTextP8()
    {
        int x = Integer.parseInt(textP8.getText());
        return x;
    }
    
    public int getTextP9()
    {
        int x = Integer.parseInt(textP9.getText());
        return x;
    }
    
    public int getTextP10()
    {
        int x = Integer.parseInt(textP10.getText());
        return x;
    }
    
    public int getTextP11()
    {
        int x = Integer.parseInt(textP11.getText());
        return x;
    }
    
    public void setText1(int burstTime)
    {
        text1.setText(Integer.toString(burstTime));
        repaint();
    }
    
    public int getText1()
    {
        int x = Integer.parseInt(text1.getText());
        return x;
    }
    
    public void setText2(int burstTime)
    {
        text2.setText(Integer.toString(burstTime));
        repaint();
    }
    
    public int getText2()
    {
        int x = Integer.parseInt(text2.getText());
        return x;
    }
    
    public void setText3(int burstTime)
    {
        text3.setText(Integer.toString(burstTime));
        repaint();
    }
    
    public int getText3()
    {
        int x = Integer.parseInt(text3.getText());
        return x;
    }
    
    public void setText4(int burstTime)
    {
        text4.setText(Integer.toString(burstTime));
        repaint();
    }
    
    public int getText4()
    {
        int x = Integer.parseInt(text4.getText());
        return x;
    }
    
    public void setText5(int burstTime)
    {
        text5.setText(Integer.toString(burstTime));
        repaint();
    }
    
    public int getText5()
    {
        int x = Integer.parseInt(text5.getText());
        return x;
    }
    
    public void setText6(int burstTime)
    {
        text6.setText(Integer.toString(burstTime));
        repaint();
    }
    
    public int getText6()
    {
        int x = Integer.parseInt(text6.getText());
        return x;
    }
    
    public void setText7(int burstTime)
    {
        text7.setText(Integer.toString(burstTime));
        repaint();
    }
    
    public int getText7()
    {
        int x = Integer.parseInt(text7.getText());
        return x;
    }
    
    public void setText8(int burstTime)
    {
        text8.setText(Integer.toString(burstTime));
        repaint();
    }
    
    public int getText8()
    {
        int x = Integer.parseInt(text8.getText());
        return x;
    }
    
    public void setText9(int burstTime)
    {
        text9.setText(Integer.toString(burstTime));
        repaint();
    }
    
    public int getText9()
    {
        int x = Integer.parseInt(text9.getText());
        return x;
    }
    
    public void setText10(int burstTime)
    {
        text10.setText(Integer.toString(burstTime));
        repaint();
    }
    
    public int getText10()
    {
        int x = Integer.parseInt(text10.getText());
        return x;
    }
    
    public void setText11(int burstTime)
    {
        text11.setText(Integer.toString(burstTime));
        repaint();
    }
    
    public int getText11()
    {
        int x = Integer.parseInt(text11.getText());
        return x;
    }
    
    //For when the random button is pushed, sets the text of the burst times to random times
    public void randomizerButton()
    {
        int numOfProcesses = getNumOfProcess();
        int random;
        
        /*for(int i = 0; i < numOfProcesses; i++){
            random = (int)(Math.random() * 25) + 1;
            text[i].setText(Integer.toString(random));
        }*/
          
        setText1((int) (Math.random() * 25) + 1);
        setText2((int) (Math.random() * 25) + 1);
        setText3((int) (Math.random() * 25) + 1);
        setText4((int) (Math.random() * 25) + 1);
        setText5((int) (Math.random() * 25) + 1);
        setText6((int) (Math.random() * 25) + 1);
        setText7((int) (Math.random() * 25) + 1);
        setText8((int) (Math.random() * 25) + 1);
        setText9((int) (Math.random() * 25) + 1);
        setText10((int) (Math.random() * 25) + 1);
        setText11((int) (Math.random() * 25) + 1);
    }
    
    /*public void drawGanttChart(int numProcesses, HashMap<Integer,Integer> burstMap)
    {
        labelGantt = new JLabel[11];
        int x = 250;
        int y = 250;
        int w = 20;
        int h = 20;
        
        Integer[] processBurst = new Integer[11];
        
        for(int i = 0; i < numProcesses; i++)
        {
            int s = burstMap.get(i + 1);
            labelGantt[i] = new JLabel(Integer.toString(s));
            if(i == 0)
            {
            labelGantt[i].setBounds(x, y, w, h);
            }
            
            else
            {
                labelGantt[i].setBounds(x + (20*i), y, w, h);
            }
            
            add(labelGantt[i]);
            labelGantt[i].setVisible(true);
        }
        //System.out.println("Here");
        repaint();
    }
    
    protected void paintComponent(Graphics g, int numProcesses)
    {
        super.paintComponent(g);
    }*/

    private class handleEvent implements ActionListener
    {

        public handleEvent()
        {
            
        }

        @Override
        public void actionPerformed(ActionEvent e) //When a button is pushed it gets the source of which button was pushed and executes commands based
        {                                           //on which button was pushed
            Integer[] burstValues;
            
            HashMap<Integer, Integer[]> priorityEntry = new HashMap<Integer, Integer[]>();
            
            if(e.getSource() == processCombo)//If the algo combo box was changed
            {
                numOfProcesses =  (Integer) processCombo.getSelectedItem();
                setNumOfProcess(numOfProcesses);
                drawTextAndLabels(numOfProcesses);
                String algo = getAlgoSelected();
                if(algo == "3. Priority")//If the algo selected is priority it draws the priority boxes needed for the priority algorithm
                {
                    drawPriority(numOfProcesses);
                }
                //moreModular(numOfProcesses);
            }
            
            else if(e.getSource() == buttonMoreInfo)//If the more Info button is selected
            {
                JOptionPane.showMessageDialog(null, "Welcome!\nThis program assumes all processes arrived at the same time.\nYou can choose"
                                            + " the number of processes you want from the \nprocess combo box on the left. \nPlease make"
                                            + " sure you choose an algorithm from the \nalgorithm drop down menu on the left.","More Information", JOptionPane.INFORMATION_MESSAGE);
                
                
                JOptionPane.showMessageDialog(null, "The blank textfields that appear next to the process numbers \nare the areas where "
                                                + "if you'd like to enter manual burst times, \nyou can in there. \nAlso when choosing"
                                                + " the priority algorithm, \nplease ensure you are using different priority values.\nThe lower"
                                                + " the value of the priority,\n(e.g. 1) the higher priority it has.\nEnjoy!"
                                                , "More Information Part 2" , JOptionPane.INFORMATION_MESSAGE);
                
            }
            
            else if(e.getSource() == buttonExecute)//If the button execute is selected
            {
                int pro1 = 0;
                int pro2 = 0;
                int pro3 = 0;
                int pro4 = 0;
                int pro5 = 0;
                int pro6 = 0;
                int pro7 = 0;
                int pro8 = 0;
                int pro9 = 0;
                int pro10 = 0;
                int pro11 = 0;
                
                int p1 = 0;
                int p2 = 0;
                int p3 = 0;
                int p4 = 0;
                int p5 = 0;
                int p6 = 0;
                int p7 = 0;
                int p8 = 0;
                int p9 = 0;
                int p10 = 0;
                int p11 = 0;
                
                p1 = getTextP1();
                p2 = getTextP2();
                p3 = getTextP3();
                p4 = getTextP4();
                p5 = getTextP5();
                p6 = getTextP6();
                p7 = getTextP7();
                p8 = getTextP8();
                p9 = getTextP9();
                p10 = getTextP10();
                p11 = getTextP11();
                
               int numberProcess = getNumOfProcess();
               String algo = getAlgoSelected();
               ArrayList<Integer> priority = new ArrayList<Integer>();
               //Add object for new data and calculating class here
               
               if(numberProcess == 1)//Depending on the number of processes selected we get those values from those textfields... It also determines
               {                        //how big the hashmap is made as well as the specific object arrays for the AlgoSJF class as well as the
                pro1 = getText1();      //Priority class
                //burstValues = new Integer[] {pro1};
                mapBurst.put(1, pro1);
                                      
                    if(algo.equalsIgnoreCase("1. FCFS"))
                    {
                    obj1 = new FCFS(numberProcess, mapBurst);//Creates a new object for the FCFS class and sends it the number of processes as well
                    }                                       //as the hashmap mapBurst which has the process number and the burst value... Same for
                                                             //everytime FCFS is executed in this method
                    
                    else if(algo.equalsIgnoreCase("2. SJF"))//Creates an AlgoSJF object, puts it in an array, and operates on the correctOrder
                    {                                       //method of the AlgoSJF class. This is the same for everytime SJF is executed
                        //obj = new SJF(numberProcess, mapBurst);
                        ObjectSJFArray = new AlgoSJF[numberProcess];
                        
                        ObjectSJFArray[0] = new AlgoSJF(1, pro1);
                        
                        ObjectSJF.correctOrder(ObjectSJFArray);
                    }
                    else if(algo.equalsIgnoreCase("Please Choose"))//If Please Choose is shown, messagebox will appear saying Please Choose an Algo
                    {
                        JOptionPane.showMessageDialog(null, "Please choose an alogrithm!");
                    }
                    else if(algo.equalsIgnoreCase("3. Priority"))//Very Similar to SJF portion... creates an Priority object, put in an array, and
                    {                                              //operates on correctOrder method of the Priority class... Same for everytime Priority
                                                                    //is chosen
                      object = new Priority[numberProcess];     
                      
                      object[0] = new Priority(1, p1, pro1);
                      
                      priorityArray.correctOrder(object);
                    }
               
               }
               else if(numberProcess == 2)
               {
                   pro1 = getText1();
                   pro2 = getText2();
                   //burstValues = new Integer[] {pro1, pro2};
                   
                   mapBurst.put(1, pro1);
                   mapBurst.put(2, pro2);
                                      
                   if(algo.equalsIgnoreCase("1. FCFS"))
                    {
                    obj1 = new FCFS(numberProcess, mapBurst);
                    }
                    else if(algo.equalsIgnoreCase("2. SJF"))
                    {
                        ObjectSJFArray = new AlgoSJF[numberProcess];
                        
                        ObjectSJFArray[0] = new AlgoSJF(1, pro1);
                        ObjectSJFArray[1] = new AlgoSJF(2, pro2);
                        
                        ObjectSJF.correctOrder(ObjectSJFArray);
                        //obj = new SJF(numberProcess, mapBurst);
                    }
                     else if(algo.equalsIgnoreCase("Please Choose"))
                    {
                        JOptionPane.showMessageDialog(null, "Please choose an alogrithm!");
                    }
                   else if(algo.equalsIgnoreCase("3. Priority"))
                    {
                        object = new Priority[numberProcess];
                        
                        object[0] = new Priority(1, p1, pro1);
                        object[1] = new Priority(2, p2, pro2);
                        
                        priorityArray.correctOrder(object);
                    }
                
               }
               
               else if(numberProcess == 3)
               {
                   pro1 = getText1();
                   pro2 = getText2();
                   pro3 = getText3();
                   //burstValues = new Integer[] {pro1, pro2, pro3};
                   
                   mapBurst.put(1, pro1);
                   mapBurst.put(2, pro2);
                   mapBurst.put(3, pro3);
                   
                   if(algo.equalsIgnoreCase("1. FCFS"))
                    {
                    obj1 = new FCFS(numberProcess, mapBurst);
                    }
                    else if(algo.equalsIgnoreCase("2. SJF"))
                    {
                        //obj = new SJF(numberProcess, mapBurst);
                        ObjectSJFArray = new AlgoSJF[numberProcess];
                        
                        ObjectSJFArray[0] = new AlgoSJF(1, pro1);
                        ObjectSJFArray[1] = new AlgoSJF(2, pro2);
                        ObjectSJFArray[2] = new AlgoSJF(3, pro3);
                        
                        ObjectSJF.correctOrder(ObjectSJFArray);
                    }
                    else if(algo.equalsIgnoreCase("Please Choose"))
                    {
                        JOptionPane.showMessageDialog(null, "Please choose an alogrithm!");
                    }
                   else if(algo.equalsIgnoreCase("3. Priority"))
                    {
                        object = new Priority[numberProcess];
                        
                        object[0] = new Priority(1, p1, pro1);
                        object[1] = new Priority(2, p2, pro2);
                        object[2] = new Priority(3, p3, pro3);
                        
                        priorityArray.correctOrder(object);
                    }
                   
               }
               
               else if(numberProcess == 4)
               {
                   pro1 = getText1();
                   pro2 = getText2();
                   pro3 = getText3();
                   pro4 = getText4();
                   //burstValues = new Integer[] {pro1, pro2, pro3, pro4};
                   
                   mapBurst.put(1, pro1);
                   mapBurst.put(2, pro2);
                   mapBurst.put(3, pro3);
                   mapBurst.put(4, pro4);
                   
                   if(algo.equalsIgnoreCase("1. FCFS"))
                    {
                    obj1 = new FCFS(numberProcess, mapBurst);
                    }
                    else if(algo.equalsIgnoreCase("2. SJF"))
                    {
                        //obj = new SJF(numberProcess, mapBurst);
                        ObjectSJFArray = new AlgoSJF[numberProcess];
                        
                        ObjectSJFArray[0] = new AlgoSJF(1, pro1);
                        ObjectSJFArray[1] = new AlgoSJF(2, pro2);
                        ObjectSJFArray[2] = new AlgoSJF(3, pro3);
                        ObjectSJFArray[3] = new AlgoSJF(4, pro4);
                        
                        ObjectSJF.correctOrder(ObjectSJFArray);
                    }
                    else if(algo.equalsIgnoreCase("Please Choose"))
                    {
                        JOptionPane.showMessageDialog(null, "Please choose an alogrithm!");
                    }
                   else if(algo.equalsIgnoreCase("3. Priority"))
                    {
                         
                        object = new Priority[numberProcess];
                        
                        object[0] = new Priority(1, p1, pro1);
                        object[1] = new Priority(2, p2, pro2);
                        object[2] = new Priority(3, p3, pro3);
                        object[3] = new Priority(4, p4, pro4);
                        
                        priorityArray.correctOrder(object);
                    }
               }
               
               else if(numberProcess == 5)
               {
                   pro1 = getText1();
                   pro2 = getText2();
                   pro3 = getText3();
                   pro4 = getText4();
                   pro5 = getText5();
                   //burstValues = new Integer[] {pro1, pro2, pro3, pro4, pro5};
                   
                   mapBurst.put(1, pro1);
                   mapBurst.put(2, pro2);
                   mapBurst.put(3, pro3);
                   mapBurst.put(4, pro4);
                   mapBurst.put(5, pro5);
                   
                   if(algo.equalsIgnoreCase("1. FCFS"))
                    {
                    obj1 = new FCFS(numberProcess, mapBurst);
                    }
                    else if(algo.equalsIgnoreCase("2. SJF"))
                    {
                        //obj = new SJF(numberProcess, mapBurst);
                        
                        ObjectSJFArray = new AlgoSJF[numberProcess];
                        
                        ObjectSJFArray[0] = new AlgoSJF(1, pro1);
                        ObjectSJFArray[1] = new AlgoSJF(2, pro2);
                        ObjectSJFArray[2] = new AlgoSJF(3, pro3);
                        ObjectSJFArray[3] = new AlgoSJF(4, pro4);
                        ObjectSJFArray[4] = new AlgoSJF(5, pro5);
                        
                        ObjectSJF.correctOrder(ObjectSJFArray);
                    }
                    else if(algo.equalsIgnoreCase("Please Choose"))
                    {
                        JOptionPane.showMessageDialog(null, "Please choose an alogrithm!");
                    }
                   else if(algo.equalsIgnoreCase("3. Priority"))
                    {
                        object = new Priority[numberProcess];
                        
                        object[0] = new Priority(1, p1, pro1);
                        object[1] = new Priority(2, p2, pro2);
                        object[2] = new Priority(3, p3, pro3);
                        object[3] = new Priority(4, p4, pro4);
                        object[4] = new Priority(5, p5, pro5);
                        
                        priorityArray.correctOrder(object);
                    }
               }
               else if(numberProcess == 6)
               {
                   pro1 = getText1();
                   pro2 = getText2();
                   pro3 = getText3();
                   pro4 = getText4();
                   pro5 = getText5();
                   pro6 = getText6();
                   //burstValues = new Integer[] {pro1, pro2, pro3, pro4, pro5};
                   
                   mapBurst.put(1, pro1);
                   mapBurst.put(2, pro2);
                   mapBurst.put(3, pro3);
                   mapBurst.put(4, pro4);
                   mapBurst.put(5, pro5);
                   mapBurst.put(6, pro6);
                   
                   if(algo.equalsIgnoreCase("1. FCFS"))
                    {
                    obj1 = new FCFS(numberProcess, mapBurst);
                    }
                    else if(algo.equalsIgnoreCase("2. SJF"))
                    {
                        //obj = new SJF(numberProcess, mapBurst);
                        ObjectSJFArray = new AlgoSJF[numberProcess];
                        
                        ObjectSJFArray[0] = new AlgoSJF(1, pro1);
                        ObjectSJFArray[1] = new AlgoSJF(2, pro2);
                        ObjectSJFArray[2] = new AlgoSJF(3, pro3);
                        ObjectSJFArray[3] = new AlgoSJF(4, pro4);
                        ObjectSJFArray[4] = new AlgoSJF(5, pro5);
                        ObjectSJFArray[5] = new AlgoSJF(6, pro6);
                        
                        ObjectSJF.correctOrder(ObjectSJFArray);
                    }
                    else if(algo.equalsIgnoreCase("Please Choose"))
                    {
                        JOptionPane.showMessageDialog(null, "Please choose an alogrithm!");
                    }
                   else if(algo.equalsIgnoreCase("3. Priority"))
                    {
                        object = new Priority[numberProcess];
                        
                        object[0] = new Priority(1, p1, pro1);
                        object[1] = new Priority(2, p2, pro2);
                        object[2] = new Priority(3, p3, pro3);
                        object[3] = new Priority(4, p4, pro4);
                        object[4] = new Priority(5, p5, pro5);
                        object[5] = new Priority(6, p6, pro6);
                        
                        priorityArray.correctOrder(object);
                    }
               }
               else if(numberProcess == 7)
               {
                   pro1 = getText1();
                   pro2 = getText2();
                   pro3 = getText3();
                   pro4 = getText4();
                   pro5 = getText5();
                   pro6 = getText6();
                   pro7 = getText7();
                   //burstValues = new Integer[] {pro1, pro2, pro3, pro4, pro5};
                   
                   mapBurst.put(1, pro1);
                   mapBurst.put(2, pro2);
                   mapBurst.put(3, pro3);
                   mapBurst.put(4, pro4);
                   mapBurst.put(5, pro5);
                   mapBurst.put(6, pro6);
                   mapBurst.put(7, pro7);
                   
                   if(algo.equalsIgnoreCase("1. FCFS"))
                    {
                    obj1 = new FCFS(numberProcess, mapBurst);
                    }
                    else if(algo.equalsIgnoreCase("2. SJF"))
                    {
                        //obj = new SJF(numberProcess, mapBurst);
                        ObjectSJFArray = new AlgoSJF[numberProcess];
                        
                        ObjectSJFArray[0] = new AlgoSJF(1, pro1);
                        ObjectSJFArray[1] = new AlgoSJF(2, pro2);
                        ObjectSJFArray[2] = new AlgoSJF(3, pro3);
                        ObjectSJFArray[3] = new AlgoSJF(4, pro4);
                        ObjectSJFArray[4] = new AlgoSJF(5, pro5);
                        ObjectSJFArray[5] = new AlgoSJF(6, pro6);
                        ObjectSJFArray[6] = new AlgoSJF(7, pro7);
                        
                        ObjectSJF.correctOrder(ObjectSJFArray);
                    }
                    else if(algo.equalsIgnoreCase("Please Choose"))
                    {
                        JOptionPane.showMessageDialog(null, "Please choose an alogrithm!");
                    }
                   else if(algo.equalsIgnoreCase("3. Priority"))
                    {
                        object = new Priority[numberProcess];
                        
                        object[0] = new Priority(1, p1, pro1);
                        object[1] = new Priority(2, p2, pro2);
                        object[2] = new Priority(3, p3, pro3);
                        object[3] = new Priority(4, p4, pro4);
                        object[4] = new Priority(5, p5, pro5);
                        object[5] = new Priority(6, p6, pro6);
                        object[6] = new Priority(7, p7, pro7);
                        
                        priorityArray.correctOrder(object);
                    }
               }
               else if(numberProcess == 8)
               {
                   pro1 = getText1();
                   pro2 = getText2();
                   pro3 = getText3();
                   pro4 = getText4();
                   pro5 = getText5();
                   pro6 = getText6();
                   pro7 = getText7();
                   pro8 = getText8();
                   //burstValues = new Integer[] {pro1, pro2, pro3, pro4, pro5};
                   
                   mapBurst.put(1, pro1);
                   mapBurst.put(2, pro2);
                   mapBurst.put(3, pro3);
                   mapBurst.put(4, pro4);
                   mapBurst.put(5, pro5);
                   mapBurst.put(6, pro6);
                   mapBurst.put(7, pro7);
                   mapBurst.put(8, pro8);
                   
                   if(algo.equalsIgnoreCase("1. FCFS"))
                    {
                    obj1 = new FCFS(numberProcess, mapBurst);
                    }
                    else if(algo.equalsIgnoreCase("2. SJF"))
                    {
                        //obj = new SJF(numberProcess, mapBurst);
                        ObjectSJFArray = new AlgoSJF[numberProcess];
                        
                        ObjectSJFArray[0] = new AlgoSJF(1, pro1);
                        ObjectSJFArray[1] = new AlgoSJF(2, pro2);
                        ObjectSJFArray[2] = new AlgoSJF(3, pro3);
                        ObjectSJFArray[3] = new AlgoSJF(4, pro4);
                        ObjectSJFArray[4] = new AlgoSJF(5, pro5);
                        ObjectSJFArray[5] = new AlgoSJF(6, pro6);
                        ObjectSJFArray[6] = new AlgoSJF(7, pro7);
                        ObjectSJFArray[7] = new AlgoSJF(8, pro8);
                        
                        ObjectSJF.correctOrder(ObjectSJFArray);
                    }
                    else if(algo.equalsIgnoreCase("Please Choose"))
                    {
                        JOptionPane.showMessageDialog(null, "Please choose an alogrithm!");
                    }
                   else if(algo.equalsIgnoreCase("3. Priority"))
                    {
                        object = new Priority[numberProcess];
                        
                        object[0] = new Priority(1, p1, pro1);
                        object[1] = new Priority(2, p2, pro2);
                        object[2] = new Priority(3, p3, pro3);
                        object[3] = new Priority(4, p4, pro4);
                        object[4] = new Priority(5, p5, pro5);
                        object[5] = new Priority(6, p6, pro6);
                        object[6] = new Priority(7, p7, pro7);
                        object[7] = new Priority(8, p8, pro8);
                        
                        priorityArray.correctOrder(object);
                    }
               }
               else if(numberProcess == 9)
               {
                   pro1 = getText1();
                   pro2 = getText2();
                   pro3 = getText3();
                   pro4 = getText4();
                   pro5 = getText5();
                   pro6 = getText6();
                   pro7 = getText7();
                   pro8 = getText8();
                   pro9 = getText9();
                   //burstValues = new Integer[] {pro1, pro2, pro3, pro4, pro5};
                   
                   mapBurst.put(1, pro1);
                   mapBurst.put(2, pro2);
                   mapBurst.put(3, pro3);
                   mapBurst.put(4, pro4);
                   mapBurst.put(5, pro5);
                   mapBurst.put(6, pro6);
                   mapBurst.put(7, pro7);
                   mapBurst.put(8, pro8);
                   mapBurst.put(9, pro9);
                   
                   if(algo.equalsIgnoreCase("1. FCFS"))
                    {
                    obj1 = new FCFS(numberProcess, mapBurst);
                    }
                    else if(algo.equalsIgnoreCase("2. SJF"))
                    {
                        //obj = new SJF(numberProcess, mapBurst);
                        ObjectSJFArray = new AlgoSJF[numberProcess];
                        
                        ObjectSJFArray[0] = new AlgoSJF(1, pro1);
                        ObjectSJFArray[1] = new AlgoSJF(2, pro2);
                        ObjectSJFArray[2] = new AlgoSJF(3, pro3);
                        ObjectSJFArray[3] = new AlgoSJF(4, pro4);
                        ObjectSJFArray[4] = new AlgoSJF(5, pro5);
                        ObjectSJFArray[5] = new AlgoSJF(6, pro6);
                        ObjectSJFArray[6] = new AlgoSJF(7, pro7);
                        ObjectSJFArray[7] = new AlgoSJF(8, pro8);
                        ObjectSJFArray[8] = new AlgoSJF(9, pro9);
                        
                        ObjectSJF.correctOrder(ObjectSJFArray);
                    }
                    else if(algo.equalsIgnoreCase("Please Choose"))
                    {
                        JOptionPane.showMessageDialog(null, "Please choose an alogrithm!");
                    }
                   else if(algo.equalsIgnoreCase("3. Priority"))
                    {
                        object = new Priority[numberProcess];
                        
                        object[0] = new Priority(1, p1, pro1);
                        object[1] = new Priority(2, p2, pro2);
                        object[2] = new Priority(3, p3, pro3);
                        object[3] = new Priority(4, p4, pro4);
                        object[4] = new Priority(5, p5, pro5);
                        object[5] = new Priority(6, p6, pro6);
                        object[6] = new Priority(7, p7, pro7);
                        object[7] = new Priority(8, p8, pro8);
                        object[8] = new Priority(9, p9, pro9);
                        
                        priorityArray.correctOrder(object);
                    }
               }
               else if(numberProcess == 10)
               {
                   pro1 = getText1();
                   pro2 = getText2();
                   pro3 = getText3();
                   pro4 = getText4();
                   pro5 = getText5();
                   pro6 = getText6();
                   pro7 = getText7();
                   pro8 = getText8();
                   pro9 = getText9();
                   pro10 = getText10();
                   //burstValues = new Integer[] {pro1, pro2, pro3, pro4, pro5};
                   
                   mapBurst.put(1, pro1);
                   mapBurst.put(2, pro2);
                   mapBurst.put(3, pro3);
                   mapBurst.put(4, pro4);
                   mapBurst.put(5, pro5);
                   mapBurst.put(6, pro6);
                   mapBurst.put(7, pro7);
                   mapBurst.put(8, pro8);
                   mapBurst.put(9, pro9);
                   mapBurst.put(10, pro10);
                   
                   if(algo.equalsIgnoreCase("1. FCFS"))
                    {
                    obj1 = new FCFS(numberProcess, mapBurst);
                    }
                    else if(algo.equalsIgnoreCase("2. SJF"))
                    {
                        //obj = new SJF(numberProcess, mapBurst);
                        ObjectSJFArray = new AlgoSJF[numberProcess];
                        
                        ObjectSJFArray[0] = new AlgoSJF(1, pro1);
                        ObjectSJFArray[1] = new AlgoSJF(2, pro2);
                        ObjectSJFArray[2] = new AlgoSJF(3, pro3);
                        ObjectSJFArray[3] = new AlgoSJF(4, pro4);
                        ObjectSJFArray[4] = new AlgoSJF(5, pro5);
                        ObjectSJFArray[5] = new AlgoSJF(6, pro6);
                        ObjectSJFArray[6] = new AlgoSJF(7, pro7);
                        ObjectSJFArray[7] = new AlgoSJF(8, pro8);
                        ObjectSJFArray[8] = new AlgoSJF(9, pro9);
                        ObjectSJFArray[9] = new AlgoSJF(10, pro10);
                        
                        ObjectSJF.correctOrder(ObjectSJFArray);
                    }
                    else if(algo.equalsIgnoreCase("Please Choose"))
                    {
                        JOptionPane.showMessageDialog(null, "Please choose an alogrithm!");
                    }
                   else if(algo.equalsIgnoreCase("3. Priority"))
                    {
                        object = new Priority[numberProcess];
                        
                        object[0] = new Priority(1, p1, pro1);
                        object[1] = new Priority(2, p2, pro2);
                        object[2] = new Priority(3, p3, pro3);
                        object[3] = new Priority(4, p4, pro4);
                        object[4] = new Priority(5, p5, pro5);
                        object[5] = new Priority(6, p6, pro6);
                        object[6] = new Priority(7, p7, pro7);
                        object[7] = new Priority(8, p8, pro8);
                        object[8] = new Priority(9, p9, pro9);
                        object[9] = new Priority(10, p10, pro10);
                        
                        priorityArray.correctOrder(object);
                    }
               }
               else if(numberProcess == 11)
               {
                   pro1 = getText1();
                   pro2 = getText2();
                   pro3 = getText3();
                   pro4 = getText4();
                   pro5 = getText5();
                   pro6 = getText6();
                   pro7 = getText7();
                   pro8 = getText8();
                   pro9 = getText9();
                   pro10 = getText10();
                   pro11 = getText11();
                   //burstValues = new Integer[] {pro1, pro2, pro3, pro4, pro5};
                   
                   mapBurst.put(1, pro1);
                   mapBurst.put(2, pro2);
                   mapBurst.put(3, pro3);
                   mapBurst.put(4, pro4);
                   mapBurst.put(5, pro5);
                   mapBurst.put(6, pro6);
                   mapBurst.put(7, pro7);
                   mapBurst.put(8, pro8);
                   mapBurst.put(9, pro9);
                   mapBurst.put(10, pro10);
                   mapBurst.put(11, pro11);
                   
                   if(algo.equalsIgnoreCase("1. FCFS"))
                    {
                    obj1 = new FCFS(numberProcess, mapBurst);
                    }
                    else if(algo.equalsIgnoreCase("2. SJF"))
                    {
                        //obj = new SJF(numberProcess, mapBurst);
                        ObjectSJFArray = new AlgoSJF[numberProcess];
                        
                        ObjectSJFArray[0] = new AlgoSJF(1, pro1);
                        ObjectSJFArray[1] = new AlgoSJF(2, pro2);
                        ObjectSJFArray[2] = new AlgoSJF(3, pro3);
                        ObjectSJFArray[3] = new AlgoSJF(4, pro4);
                        ObjectSJFArray[4] = new AlgoSJF(5, pro5);
                        ObjectSJFArray[5] = new AlgoSJF(6, pro6);
                        ObjectSJFArray[6] = new AlgoSJF(7, pro7);
                        ObjectSJFArray[7] = new AlgoSJF(8, pro8);
                        ObjectSJFArray[8] = new AlgoSJF(9, pro9);
                        ObjectSJFArray[9] = new AlgoSJF(10, pro10);
                        ObjectSJFArray[10] = new AlgoSJF(11, pro11);
                        
                        ObjectSJF.correctOrder(ObjectSJFArray);
                    }
                    else if(algo.equalsIgnoreCase("Please Choose"))
                    {
                        JOptionPane.showMessageDialog(null, "Please choose an alogrithm!");
                    }
                   else if(algo.equalsIgnoreCase("3. Priority"))
                    {
                         object = new Priority[numberProcess];
                        
                        object[0] = new Priority(1, p1, pro1);
                        object[1] = new Priority(2, p2, pro2);
                        object[2] = new Priority(3, p3, pro3);
                        object[3] = new Priority(4, p4, pro4);
                        object[4] = new Priority(5, p5, pro5);
                        object[5] = new Priority(6, p6, pro6);
                        object[6] = new Priority(7, p7, pro7);
                        object[7] = new Priority(8, p8, pro8);
                        object[8] = new Priority(9, p9, pro9);
                        object[9] = new Priority(10, p10, pro10);
                        object[10] = new Priority(11, p11, pro11);
                        
                        priorityArray.correctOrder(object);
                    }
               }  
            }
            else if(e.getSource() == algoCombo)//Gets the selected algorithm from the comboBox and sets it as the selected algorithm by passing it
            {                                   //to the setAlgoSelected method
                String algoSelected =  (String) algoCombo.getSelectedItem();
                setAlgoSelected(algoSelected);
                
                if(algoSelected == "3. Priority")//If priority is chosen as the selected algorithm, the boxes for prioritym must be drawn so to do so
                {                               //we must get the number of processes and depending on the number of processes we then pass that to the
                    getNumOfProcess();          //drawPriority method which will draw the same amount of textboxes as there are processes selected
                    drawPriority(numOfProcesses);
                }
                else
                {
                    erasePriority();//If it isn't priority selected, there is no reason for the priority textfields to be shown so this calls the 
                }                   //erasePriority method which will erase the priority textfields
            }
            else if(e.getSource() == buttonReset)//Resets every textfield to 0 as well as makes them not visible as well as the labels for each process
            {
            processCombo.setSelectedIndex(0);    
            algoCombo.setSelectedIndex(0);
            
            text1.setVisible(false);
            text2.setVisible(false);
            text3.setVisible(false);
            text4.setVisible(false);
            text5.setVisible(false);
            text6.setVisible(false);
            text7.setVisible(false);
            text8.setVisible(false);
            text9.setVisible(false);
            text10.setVisible(false);
            text11.setVisible(false);
            
            label1.setVisible(false);
            label2.setVisible(false);
            label3.setVisible(false);
            label4.setVisible(false);
            label5.setVisible(false);
            label6.setVisible(false);
            label7.setVisible(false);
            label8.setVisible(false);
            label9.setVisible(false);
            label10.setVisible(false);
            label11.setVisible(false);
            
            erasePriority();
            
            repaint();
            
            text1.setText("0");
            text2.setText("0");
            text3.setText("0");
            text4.setText("0");
            text5.setText("0");
            text6.setText("0");
            text7.setText("0");
            text8.setText("0");
            text9.setText("0");
            text10.setText("0");
            text11.setText("0");
            }
            else if(e.getSource() == buttonRandom)//For the random button, if called it will execute the randomizerButton() method which will give every
            {                                       //burst text field a random number that can be used as a burst time.
                randomizerButton();
            }
        }    
    }
}
