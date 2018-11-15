
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;


public class Priority 
{
    private int processNumber;
    private int priorityNumber;
    private int burstTime;
    private Priority[] setOrder;
    
    public Priority()
    {
        
    }
    
    public Priority(int processNumber, int priorityNumber, int burstTime)
    {
        this.processNumber = processNumber;
        this.priorityNumber = priorityNumber;
        this.burstTime = burstTime;
    }

    public void correctOrder(Priority[] rightOrder) 
    {
        Priority temp;
         setOrder = new Priority[rightOrder.length];
        
        for(int i = 0; i < rightOrder.length; i++)
        {
            setOrder[i] = rightOrder[i];
        }
        
        for(int i = 0; i < rightOrder.length; i++)
        {
            for(int j = i+1; j < rightOrder.length; j++)
            {
                if((setOrder[i].priorityNumber > setOrder[j].priorityNumber) && (i != j))
                {
                temp = setOrder[j];
                setOrder[j] = setOrder[i];
                setOrder[i] = temp;
                }
            }
            
        }
        outputOrder();      
    }

    public int getPriorityNumber() 
    {
        return priorityNumber;
    }

    public void outputOrder() 
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
        JOptionPane.showMessageDialog(null, "The average wait time is " + waitTime+ ". The average turnaround time is " + turnAroundTime);
    }
    
    public double avgWaitTime()
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
    
    public double avgTurnAroundTime()
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
