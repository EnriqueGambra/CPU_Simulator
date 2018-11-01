
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JComboBox;
import javax.swing.*;


public class Processes extends JPanel
{
    private String[] schedulingAlgo = {"1. FCFS", "2. HPF"};
    private JComboBox algoCombo = new JComboBox(schedulingAlgo);
    private Integer[] processList = {1, 2, 3};
    private JComboBox<Integer> processCombo = new JComboBox(processList);
    private JButton buttonExecute = new JButton("Execute");
    private int numOfProcesses;
    private String algoSelected;
    
    private int[] burstValues;
    private HashMap<Integer, Integer> mapBurst = new HashMap<Integer, Integer>();
    
    private JTextField text1 = new JTextField("0");
    private JTextField text2 = new JTextField("0");
    private JTextField text3 = new JTextField("0");
    private JTextField text4 = new JTextField("0");
    private JTextField text5 = new JTextField("0");
    
    private JLabel label1 = new JLabel("Process 1");
    private JLabel label2 = new JLabel("Process 2");
    private JLabel label3 = new JLabel("Process 3");
    private JLabel label4 = new JLabel("Process 4");
    private JLabel label5 = new JLabel("Process 5");
    
    private JLabel comboLabel = new JLabel("Select number of Processes");
    private JLabel scheduleLabel = new JLabel("Select the algorithm you'd like to use");
    
    private Calculate obj1;
    public Processes()
    {
        super();
        setLayout(null);
        setBounds(0, 0, 900, 900);
        drawComboBox();
        drawExecuteButton();
        drawSchedulingAlgos();
        
      
        repaint();
    }
    
    public void drawComboBox()
    {
        comboLabel.setBounds(15, 15, 180, 20);
        processCombo.setBounds(50, 40, 80, 30);
        add(processCombo);
        add(comboLabel);
        handleEvent handler = new handleEvent();
        processCombo.addActionListener(handler);
    }
    
    public void setNumOfProcess(int numOfProcesses)
    {
        this.numOfProcesses = numOfProcesses;
        System.out.println("In setNumOfProcess " + this.numOfProcesses);
    }
    
    public int getNumOfProcess()
    {
        System.out.println("In getNumOfProcesses " + numOfProcesses);
        return numOfProcesses;
    }

    public void drawExecuteButton() 
    {
       buttonExecute.setBounds(700, 40, 80, 40);
       handleEvent handler = new handleEvent();
       buttonExecute.addActionListener(handler);
       add(buttonExecute);
    }

    public void drawSchedulingAlgos() 
    {
        scheduleLabel.setBounds(240, 15, 210, 20);
        algoCombo.setBounds(270, 40, 100, 30);
        handleEvent handler = new handleEvent();
        algoCombo.addActionListener(handler);
        add(algoCombo);
        add(scheduleLabel);
    }
    
    public void setAlgoSelected(String algoSelected)
    {
        this.algoSelected = algoSelected;
    }
    
    public String getAlgoSelected()
    {
        return algoSelected;
    }
 
    public void drawTextAndLabels(int numOfProcesses)
    {
        label1.setBounds(10, 90, 80, 20);
        label2.setBounds(10, 130, 80, 20);
        label3.setBounds(10, 170, 80, 20);
        label4.setBounds(10, 210, 80, 20);
        label5.setBounds(10, 250, 80, 20);
        
        text1.setBounds(90, 90, 40, 20);
        text2.setBounds(90, 130, 40, 20);
        text3.setBounds(90, 170, 40, 20);
        text4.setBounds(90, 210, 40, 20);
        text5.setBounds(90, 250, 40, 20);
        
        add(text1);
        add(text2);
        add(text3);
        add(text4);
        add(text5);
        
        add(label1);
        add(label2);
        add(label3);
        add(label4);
        add(label5);
        
        if(numOfProcesses == 1)
        {
            text1.setVisible(true);
            text2.setVisible(false);
            text3.setVisible(false);
            text4.setVisible(false);
            text5.setVisible(false);
            
            label1.setVisible(true);
            label2.setVisible(false);
            label3.setVisible(false);
            label4.setVisible(false);
            label5.setVisible(false);
            
            repaint();
        }
        
        else if(numOfProcesses == 2)
        {
            text1.setVisible(true);
            text2.setVisible(true);
            text3.setVisible(false);
            text4.setVisible(false);
            text5.setVisible(false);
            
            label1.setVisible(true);
            label2.setVisible(true);
            label3.setVisible(false);
            label4.setVisible(false);
            label5.setVisible(false);
            
            repaint();
        }
        
        else if(numOfProcesses == 3)
        {
            text1.setVisible(true);
            text2.setVisible(true);
            text3.setVisible(true);
            text4.setVisible(false);
            text5.setVisible(false);
            
            label1.setVisible(true);
            label2.setVisible(true);
            label3.setVisible(true);
            label4.setVisible(false);
            label5.setVisible(false);
            
            repaint();
        }
        
        else if(numOfProcesses == 4)
        {
            text1.setVisible(true);
            text2.setVisible(true);
            text3.setVisible(true);
            text4.setVisible(true);
            text5.setVisible(false);
            
            label1.setVisible(true);
            label2.setVisible(true);
            label3.setVisible(true);
            label4.setVisible(true);
            label5.setVisible(false);
            
            repaint();
        }
        
        else if(numOfProcesses == 5)
        {
            text1.setVisible(true);
            text2.setVisible(true);
            text3.setVisible(true);
            text4.setVisible(true);
            text5.setVisible(true);
            
            label1.setVisible(true);
            label2.setVisible(true);
            label3.setVisible(true);
            label4.setVisible(true);
            label5.setVisible(true);
            
            repaint();
        }
    }
    
    public int getText1()
    {
        int x = Integer.parseInt(text1.getText());
        return x;
    }
    
    public int getText2()
    {
        int x = Integer.parseInt(text2.getText());
        return x;
    }
    
    public int getText3()
    {
        int x = Integer.parseInt(text3.getText());
        return x;
    }
    
    public int getText4()
    {
        int x = Integer.parseInt(text4.getText());
        return x;
    }
    
    public int getText5()
    {
        int x = Integer.parseInt(text5.getText());
        return x;
    }

    private class handleEvent implements ActionListener
    {

        public handleEvent()
        {
            
        }

        @Override
        public void actionPerformed(ActionEvent e) 
        {
            Integer[] burstValues;
            if(e.getSource() == processCombo)
            {
                numOfProcesses =  (Integer) processCombo.getSelectedItem();
                setNumOfProcess(numOfProcesses);
                drawTextAndLabels(numOfProcesses);
            }
            
            else if(e.getSource() == buttonExecute)
            {
                int pro1 = 0;
                int pro2 = 0;
                int pro3 = 0;
                int pro4 = 0;
                int pro5 = 0;
                
               int numberProcess = getNumOfProcess();
               String algo = getAlgoSelected();
               
               //Add object for new data and calculating class here
               
               if(numberProcess == 1)
               {
                pro1 = getText1();
                //burstValues = new Integer[] {pro1};
                mapBurst.put(1, pro1);
                                      
                obj1 = new Calculate(algo, numberProcess, mapBurst);
                   
               }
               else if(numberProcess == 2)
               {
                   pro1 = getText1();
                   pro2 = getText2();
                   //burstValues = new Integer[] {pro1, pro2};
                   
                   mapBurst.put(1, pro1);
                   mapBurst.put(2, pro2);
                                      
                obj1 = new Calculate(algo, numberProcess, mapBurst);
                
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
                   obj1 = new Calculate(algo, numberProcess, mapBurst);
                   
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
                   obj1 = new Calculate(algo, numberProcess, mapBurst);
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
                   obj1 = new Calculate(algo, numberProcess, mapBurst);
               }
               
            }
            
            else if(e.getSource() == algoCombo)
            {
                String algoSelected =  (String) algoCombo.getSelectedItem();
                setAlgoSelected(algoSelected);
            }
        }

        
    }
}
