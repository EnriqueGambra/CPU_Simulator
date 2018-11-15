
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

// Computes the SJF algorithm as well as outputs the wait time, 
// order of processes, and turnaround time
public class AlgoSJF 
{
    private int burstTime;
    private int processNumber;
    private AlgoSJF[] setOrder;
    
    DecimalFormat fmt = new DecimalFormat("####################.##");
    
    public AlgoSJF()
    {
        
    }
    
    public AlgoSJF(int processNumber, int burstTime)
    {
        this.processNumber = processNumber;
        this.burstTime = burstTime;
    }
    
    /*
    Very similar to correctOrder method in Priority except it doesnt compare and
    order based on priority but by which process has the shortest burst value...
    see those notes in Priority
    */
    public void correctOrder(AlgoSJF[] notInOrder)             
    {
        AlgoSJF temp;
        setOrder = new AlgoSJF[notInOrder.length];
        
        for(int i = 0; i < notInOrder.length; i++)
        {
            setOrder[i] = notInOrder[i];
        }
        
        for(int i = 0; i < notInOrder.length; i++)
        {
            for(int j = i+1; j < notInOrder.length; j++)
            {
                if((setOrder[i].burstTime > setOrder[j].burstTime) && (i != j))
                {
                temp = setOrder[j];
                setOrder[j] = setOrder[i];
                setOrder[i] = temp;
                }
            }
            
        }
        outputOrder();   
    }

    //same as correctOrder method in Priority... see those notes
    private void outputOrder() 
    {
        int numProcesses = setOrder.length;
        
        if(numProcesses == 1)
        {
            JOptionPane.showMessageDialog(null, "The processes are scheduled as follows: "
        + "\nFirst is process " + setOrder[0].processNumber);
        }
        else if(numProcesses == 2)
        {
            JOptionPane.showMessageDialog(null, "The processes are scheduled as follows: "
        + "\nFirst is process " + setOrder[0].processNumber
        + "\nSecond is process " + setOrder[1].processNumber);
        }
        else if(numProcesses == 3)
        {
            JOptionPane.showMessageDialog(null, "The processes are scheduled as follows: "
        + "\nFirst is process " + setOrder[0].processNumber
        + "\nSecond is process " + setOrder[1].processNumber
        + "\nThird is process " + setOrder[2].processNumber);
        }
        else if(numProcesses == 4)
        {
            JOptionPane.showMessageDialog(null, "The processes are scheduled as follows: "
        + "\nFirst is process " + setOrder[0].processNumber
        + "\nSecond is process " + setOrder[1].processNumber
        + "\nThird is process " + setOrder[2].processNumber
        + "\nFourth is process " + setOrder[3].processNumber);
        }
        else if(numProcesses == 5)
        {
            JOptionPane.showMessageDialog(null, "The processes are scheduled as follows: "
        + "\nFirst is process " + setOrder[0].processNumber
        + "\nSecond is process " + setOrder[1].processNumber
        + "\nThird is process " + setOrder[2].processNumber
        + "\nFourth is process " + setOrder[3].processNumber
        + "\nFifth is process " + setOrder[4].processNumber);
        }
        else if(numProcesses == 6)
        {
            JOptionPane.showMessageDialog(null, "The processes are scheduled as follows: "
        + "\nFirst is process " + setOrder[0].processNumber
        + "\nSecond is process " + setOrder[1].processNumber
        + "\nThird is process " + setOrder[2].processNumber
        + "\nFourth is process " + setOrder[3].processNumber
        + "\nFifth is process " + setOrder[4].processNumber
        + "\nSixth is process " + setOrder[5].processNumber);
        }
        else if(numProcesses == 7)
        {
            JOptionPane.showMessageDialog(null, "The processes are scheduled as follows: "
        + "\nFirst is process " + setOrder[0].processNumber
        + "\nSecond is process " + setOrder[1].processNumber
        + "\nThird is process " + setOrder[2].processNumber
        + "\nFourth is process " + setOrder[3].processNumber
        + "\nFifth is process " + setOrder[4].processNumber
        + "\nSixth is process " + setOrder[5].processNumber
        + "\nSeventh is process " + setOrder[6].processNumber);
        }
        else if(numProcesses == 8)
        {
            JOptionPane.showMessageDialog(null, "The processes are scheduled as follows: "
        + "\nFirst is process " + setOrder[0].processNumber
        + "\nSecond is process " + setOrder[1].processNumber
        + "\nThird is process " + setOrder[2].processNumber
        + "\nFourth is process " + setOrder[3].processNumber
        + "\nFifth is process " + setOrder[4].processNumber
        + "\nSixth is process " + setOrder[5].processNumber
        + "\nSeventh is process " + setOrder[6].processNumber
        + "\nEighth is process " + setOrder[7].processNumber);
        }
        else if(numProcesses == 9)
        {
            JOptionPane.showMessageDialog(null, "The processes are scheduled as follows: "
        + "\nFirst is process " + setOrder[0].processNumber
        + "\nSecond is process " + setOrder[1].processNumber
        + "\nThird is process " + setOrder[2].processNumber
        + "\nFourth is process " + setOrder[3].processNumber
        + "\nFifth is process " + setOrder[4].processNumber
        + "\nSixth is process " + setOrder[5].processNumber
        + "\nSeventh is process " + setOrder[6].processNumber
        + "\nEighth is process " + setOrder[7].processNumber
        + "\nNinth is process " + setOrder[8].processNumber);
        }
        else if(numProcesses == 10)
        {
            JOptionPane.showMessageDialog(null, "The processes are scheduled as follows: "
        + "\nFirst is process " + setOrder[0].processNumber
        + "\nSecond is process " + setOrder[1].processNumber
        + "\nThird is process " + setOrder[2].processNumber
        + "\nFourth is process " + setOrder[3].processNumber
        + "\nFifth is process " + setOrder[4].processNumber
        + "\nSixth is process " + setOrder[5].processNumber
        + "\nSeventh is process " + setOrder[6].processNumber
        + "\nEighth is process " + setOrder[7].processNumber
        + "\nNinth is process " + setOrder[8].processNumber
        + "\nTenth is process " + setOrder[9].processNumber);
        }
        else if(numProcesses == 11)
        {
            JOptionPane.showMessageDialog(null, "The processes are scheduled as follows: "
        + "\nFirst is process " + setOrder[0].processNumber
        + "\nSecond is process " + setOrder[1].processNumber
        + "\nThird is process " + setOrder[2].processNumber
        + "\nFourth is process " + setOrder[3].processNumber
        + "\nFifth is process " + setOrder[4].processNumber
        + "\nSixth is process " + setOrder[5].processNumber
        + "\nSeventh is process " + setOrder[6].processNumber
        + "\nEighth is process " + setOrder[7].processNumber
        + "\nNinth is process " + setOrder[8].processNumber
        + "\nTenth is process " + setOrder[9].processNumber
        + "\nEleventh is process " + setOrder[10].processNumber);
        }
        
        double waitTime;
        double turnAroundTime;
        waitTime = avgWaitTime();
        turnAroundTime = avgTurnAroundTime();
        JOptionPane.showMessageDialog(null, "The average wait time is " + fmt.format(waitTime) 
                + ".\nThe average turnaround time is " + fmt.format(turnAroundTime));
    }

    /*
    Same as avgWaitTime() in priority... we could have made an abstract class 
    that would have had these methods and values and would have made the program
    more modular... maybe next time
    */
    private double avgWaitTime()
    {                           
        int x = 0;
        double numProcess = setOrder.length;
        Integer[] totalWaitTime = new Integer[setOrder.length - 1];
        for(int i = 0; i < setOrder.length - 1; i++)
        {
            if(i == 0)
            {
                totalWaitTime[i] = setOrder[i].burstTime;
            }
            else
            {
            totalWaitTime[i] = setOrder[i].burstTime + totalWaitTime[i - 1];
        
            }
        }
        
        for(int i = 0; i < totalWaitTime.length; i++)
        {
            x = totalWaitTime[i] + x;
        }
        //System.out.println(x);
        double xy = (double) x;
        return xy/numProcess;
    }

    //Same as avgTurnAroundTime() in priority... see notes
    private double avgTurnAroundTime() 
    {
        double numProcess = setOrder.length;
        Integer[] totalCompletionTime = new Integer[setOrder.length];
        int x = 0;
        for(int i = 0; i < setOrder.length; i++)
        {
            if(i == 0)
            {
                totalCompletionTime[i] = setOrder[i].burstTime;
            }
            else
            {
                totalCompletionTime[i] = setOrder[i].burstTime + totalCompletionTime[i-1];
            }
        }
        
        for(int i = 0; i < totalCompletionTime.length; i++)
        {
            x = totalCompletionTime[i] + x;
        }
        double xY = (double) x;
        return xY/numProcess;
    }
}