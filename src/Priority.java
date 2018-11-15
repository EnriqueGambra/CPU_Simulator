
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

// This class calculates everything for the Priority algorithm as well as outputs
// the results
public class Priority 
{
    private int processNumber;
    private int priorityNumber;
    private int burstTime;
    private Priority[] setOrder;
    
    public Priority()
    {
        
    }
    
    // Properties needed for the priority algorithm
    public Priority(int processNumber, int priorityNumber, int burstTime)
    {
        this.processNumber = processNumber;
        this.priorityNumber = priorityNumber;
        this.burstTime = burstTime;
    }

    //Sets the order of processes in the order of Priority
    public void correctOrder(Priority[] rightOrder) 
    {
        Priority temp;
        // Creates a priority array that will store the passed arrays values from
        // the Process class
        setOrder = new Priority[rightOrder.length];
        
        //The loop doing just that ^^^^
        for(int i = 0; i < rightOrder.length; i++)
        {
            setOrder[i] = rightOrder[i];
        }
        
        //This loop will order the values for the setOrder array correctly
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
        // Once the order is correct and completed, it now outputs the correct 
        // order by calling the outputOrder method
        outputOrder();      
    }

    public int getPriorityNumber() 
    {
        return priorityNumber;
    }

    // Just outputs the order as well as outputs the avg wait time and turnaround
    // time
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
    
    //Computes the average wait time
    public double avgWaitTime()
    {
        int x = 0;
        double numProcess = setOrder.length;
        Integer[] totalWaitTime = new Integer[setOrder.length - 1];
        
        // This fills the array totalWaitTime by going through the corrected 
        // setOrder array and adding the previous value in each array index to 
        // the value in the current array index to get the total wait time
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
        
        // x then will be the actual value of the total wait time by going 
        // through the totalWaitTime array and adding each value
        for(int i = 0; i < totalWaitTime.length; i++)
        {                                               
            x = totalWaitTime[i] + x;
        }
        //System.out.println(x);
        double xy = (double) x;
        return xy/numProcess;//Passed back to call made in outputOrder() method
    }
    
    //Computes the average turnaround time... very similar to average wait time
    public double avgTurnAroundTime()
    {
        double numProcess = setOrder.length;
        Integer[] totalCompletionTime = new Integer[setOrder.length];
        int x = 0;
        // totalCompletionTime[] gets all the burst times from the correct 
        // setOrder array
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
        
        //Now x will go through each index of the totalCompletionTime array, 
        // get the total completion time and will then be divided by the number
        // of processes there were, giving us the avg turnaround time
        for(int i = 0; i < totalCompletionTime.length; i++)
        {                                                   
            x = totalCompletionTime[i] + x;                 
        }
        double xY = (double) x;
        return xY/numProcess;
    }
}
