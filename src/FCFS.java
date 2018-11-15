import java.util.HashMap;
import javax.swing.JOptionPane;

// This class is for the FCFS algorithm... all calculations for the FCFS 
// including the output can be found here
class FCFS 
{
        int avgBurst;
        int avgTurnAround;
        int avgWait;
        int pro1;
        int pro2;
        int pro3;
        int pro4;
        int pro5;
        int pro6;
        int pro7;
        int pro8;
        int pro9;
        int pro10;
        int pro11;
        
    public FCFS(int processNum, HashMap<Integer, Integer> burstMap)
    {    
            FCFS(burstMap, processNum);
    }
    
    /*
    This method computes the FCFS algorithm by getting the values from the
    hashmap and then as well getting the number of processes and simply
    outputting the algo
    */
    public void FCFS(HashMap<Integer, Integer> burstMap, int processNum)
    {                                                                   
        if(processNum == 1)                                             
        {
            pro1 = burstMap.get(1);
            avgWait = 0;
            avgTurnAround = pro1;
            JOptionPane.showMessageDialog(null, "The first process to execute is " + pro1 + "!");
        }
        else if(processNum == 2)
        {
            pro1 = burstMap.get(1);
            pro2 = burstMap.get(2);
            
            avgTurnAround = avgTurnAround(burstMap, processNum);
            
            avgWait = pro1;
            
            JOptionPane.showMessageDialog(null, "Process 1 executes first with a burst time of " + pro1 
                    + "! \nProcess 2 executes second with a burst time of " + pro2 + "!");
            
            
            JOptionPane.showMessageDialog(null, "The average wait time is " + avgWait + " \nThe average turnaround time is " + avgTurnAround);
        }
        else if(processNum == 3)
        {
            pro1 = burstMap.get(1);
            pro2 = burstMap.get(2);
            pro3 = burstMap.get(3);
            
            
            avgWait = avgWaitTime(burstMap, processNum);
         
            avgTurnAround = avgTurnAround(burstMap, processNum);
            
            JOptionPane.showMessageDialog(null, "Process 1 executes first with a burst time of " + pro1 + 
                    "!" + " \nProcess 2 executes second with a burst time of " + pro2 
                    + "! \nProcess 3 executes last with a burst time of " + pro3 + "!");
            
            
            JOptionPane.showMessageDialog(null, "The average wait time is " + avgWait + " \nThe average turnaround time is " + avgTurnAround);
        }
        else if(processNum == 4)
        {
            pro1 = burstMap.get(1);
            pro2 = burstMap.get(2);
            pro3 = burstMap.get(3);
            pro4 = burstMap.get(4);
            
            avgWait = avgWaitTime(burstMap, processNum);
            
            avgTurnAround = avgTurnAround(burstMap, processNum);
            
            JOptionPane.showMessageDialog(null, "Process 1 executes first with a burst time of " + pro1 + 
                    "!" + " \nProcess 2 executes second with a burst time of " + pro2 
                    + "! \nProcess 3 executes third with a burst time of " + pro3 
                    + "! \nProcess 4 executes last with a burst time of " + pro4 + "!");
            
            
            JOptionPane.showMessageDialog(null, "The average wait time is " + avgWait + " \nThe average turnaround time is " + avgTurnAround);
        }
        else if(processNum == 5)
        {
            pro1 = burstMap.get(1);
            pro2 = burstMap.get(2);
            pro3 = burstMap.get(3);
            pro4 = burstMap.get(4);
            pro5 = burstMap.get(5);
            
            avgWait = avgWaitTime(burstMap, processNum);
            
           avgTurnAround = avgTurnAround(burstMap, processNum);
            
            JOptionPane.showMessageDialog(null, "Process 1 executes first with a burst time of " + pro1 + 
                    "!" + " \nProcess 2 executes second with a burst time of " + pro2 
                    + "! \nProcess 3 executes third with a burst time of " + pro3 
                    + "! \nProcess 4 executes fourth with a burst time of " + pro4
                    + "! \nProcess 5 executes last with a burst time of " + pro5 + "!");
            
            
            JOptionPane.showMessageDialog(null, "The average wait time is " + avgWait + " \nThe average turnaround time is " + avgTurnAround);
        }
        else if(processNum == 6)
        {
            pro1 = burstMap.get(1);
            pro2 = burstMap.get(2);
            pro3 = burstMap.get(3);
            pro4 = burstMap.get(4);
            pro5 = burstMap.get(5);
            pro6 = burstMap.get(6);
            
            avgWait = avgWaitTime(burstMap, processNum);
            
            avgTurnAround = avgTurnAround(burstMap, processNum);
            
            JOptionPane.showMessageDialog(null, "Process 1 executes first with a burst time of " + pro1 + 
                    "!" + " \nProcess 2 executes second with a burst time of " + pro2 
                    + "! \nProcess 3 executes third with a burst time of " + pro3 
                    + "! \nProcess 4 executes fourth with a burst time of " + pro4
                    + "! \nProcess 5 executes fifth with a burst time of " + pro5
                    + "! \nProcess 6 executes last with a burst time of " + pro6 + "!");
            
            
            JOptionPane.showMessageDialog(null, "The average wait time is " + avgWait + " \nThe average turnaround time is " + avgTurnAround);
        }
        else if(processNum == 7)
        {
            pro1 = burstMap.get(1);
            pro2 = burstMap.get(2);
            pro3 = burstMap.get(3);
            pro4 = burstMap.get(4);
            pro5 = burstMap.get(5);
            pro6 = burstMap.get(6);
            pro7 = burstMap.get(7);
            
            avgWait = avgWaitTime(burstMap, processNum);
            
            avgTurnAround = avgTurnAround(burstMap, processNum);
            
            JOptionPane.showMessageDialog(null, "Process 1 executes first with a burst time of " + pro1 + 
                    "!" + " \nProcess 2 executes second with a burst time of " + pro2 
                    + "! \nProcess 3 executes third with a burst time of " + pro3 
                    + "! \nProcess 4 executes fourth with a burst time of " + pro4
                    + "! \nProcess 5 executes fifth with a burst time of " + pro5
                    + "! \nProcess 6 executes sixth with a burst time of " + pro6
                    + "! \nProcess 7 executes last with a burst time of " + pro7 + "!");
            
            
            JOptionPane.showMessageDialog(null, "The average wait time is " + avgWait + " \nThe average turnaround time is " + avgTurnAround);
        }
        else if(processNum == 8)
        {
            pro1 = burstMap.get(1);
            pro2 = burstMap.get(2);
            pro3 = burstMap.get(3);
            pro4 = burstMap.get(4);
            pro5 = burstMap.get(5);
            pro6 = burstMap.get(6);
            pro7 = burstMap.get(7);
            pro8 = burstMap.get(8);
            
            avgWait = avgWaitTime(burstMap, processNum);
            
            avgTurnAround = avgTurnAround(burstMap, processNum);
            
            JOptionPane.showMessageDialog(null, "Process 1 executes first with a burst time of " + pro1 + 
                    "!" + " \nProcess 2 executes second with a burst time of " + pro2 
                    + "! \nProcess 3 executes third with a burst time of " + pro3 
                    + "! \nProcess 4 executes fourth with a burst time of " + pro4
                    + "! \nProcess 5 executes fifth with a burst time of " + pro5
                    + "! \nProcess 6 executes sixth with a burst time of " + pro6
                    + "! \nProcess 7 executes seventh with a burst time of " + pro7
                    + "! \nProcess 8 executes last with a burst time of " + pro8 + "!");
            
            
            JOptionPane.showMessageDialog(null, "The average wait time is " + avgWait + " \nThe average turnaround time is " + avgTurnAround);
        }
        else if(processNum == 9)
        {
            pro1 = burstMap.get(1);
            pro2 = burstMap.get(2);
            pro3 = burstMap.get(3);
            pro4 = burstMap.get(4);
            pro5 = burstMap.get(5);
            pro6 = burstMap.get(6);
            pro7 = burstMap.get(7);
            pro8 = burstMap.get(8);
            pro9 = burstMap.get(9);
            
            avgWait = avgWaitTime(burstMap, processNum);
            
            avgTurnAround = avgTurnAround(burstMap, processNum);
            
            JOptionPane.showMessageDialog(null, "Process 1 executes first with a burst time of " + pro1 + 
                    "!" + " \nProcess 2 executes second with a burst time of " + pro2 
                    + "! \nProcess 3 executes third with a burst time of " + pro3 
                    + "! \nProcess 4 executes fourth with a burst time of " + pro4
                    + "! \nProcess 5 executes fifth with a burst time of " + pro5
                    + "! \nProcess 6 executes sixth with a burst time of " + pro6
                    + "! \nProcess 7 executes seventh with a burst time of " + pro7
                    + "! \nProcess 8 executes last with a burst time of " + pro8
                    + "! \nProcess 9 executes last with a burst time of " + pro9 + "!");
            
            
            JOptionPane.showMessageDialog(null, "The average wait time is " + avgWait + " \nThe average turnaround time is " + avgTurnAround);
        }
        else if(processNum == 10)
        {
            pro1 = burstMap.get(1);
            pro2 = burstMap.get(2);
            pro3 = burstMap.get(3);
            pro4 = burstMap.get(4);
            pro5 = burstMap.get(5);
            pro6 = burstMap.get(6);
            pro7 = burstMap.get(7);
            pro8 = burstMap.get(8);
            pro9 = burstMap.get(9);
            pro10 = burstMap.get(10);
            
            avgWait = avgWaitTime(burstMap, processNum);
            
            avgTurnAround = avgTurnAround(burstMap, processNum);
            
            JOptionPane.showMessageDialog(null, "Process 1 executes first with a burst time of " + pro1 + 
                    "!" + " \nProcess 2 executes second with a burst time of " + pro2 
                    + "! \nProcess 3 executes third with a burst time of " + pro3 
                    + "! \nProcess 4 executes fourth with a burst time of " + pro4
                    + "! \nProcess 5 executes fifth with a burst time of " + pro5
                    + "! \nProcess 6 executes sixth with a burst time of " + pro6
                    + "! \nProcess 7 executes seventh with a burst time of " + pro7
                    + "! \nProcess 8 executes last with a burst time of " + pro8
                    + "! \nProcess 9 executes ninth with a burst time of " + pro9
                    + "! \nProcess 10 executes last with a burst time of " + pro10 + "!");
            
            
            JOptionPane.showMessageDialog(null, "The average wait time is " + avgWait + " \nThe average turnaround time is " + avgTurnAround);
        }
        else if(processNum == 11)
        {
            pro1 = burstMap.get(1);
            pro2 = burstMap.get(2);
            pro3 = burstMap.get(3);
            pro4 = burstMap.get(4);
            pro5 = burstMap.get(5);
            pro6 = burstMap.get(6);
            pro7 = burstMap.get(7);
            pro8 = burstMap.get(8);
            pro9 = burstMap.get(9);
            pro10 = burstMap.get(10);
            pro11 = burstMap.get(11);
            
            avgWait = avgWaitTime(burstMap, processNum);
            
            avgTurnAround = avgTurnAround(burstMap, processNum);
            
            JOptionPane.showMessageDialog(null, "Process 1 executes first with a burst time of " + pro1 + 
                    "!" + " \nProcess 2 executes second with a burst time of " + pro2 
                    + "! \nProcess 3 executes third with a burst time of " + pro3 
                    + "! \nProcess 4 executes fourth with a burst time of " + pro4
                    + "! \nProcess 5 executes fifth with a burst time of " + pro5
                    + "! \nProcess 6 executes sixth with a burst time of " + pro6
                    + "! \nProcess 7 executes seventh with a burst time of " + pro7
                    + "! \nProcess 8 executes last with a burst time of " + pro8
                    + "! \nProcess 9 executes ninth with a burst time of " + pro9
                    + "! \nProcess 10 executes tenth with a burst time of " + pro10
                    + "! \nProcess 11 executes last with a burst time of " + pro11 + "!");
            
            
            JOptionPane.showMessageDialog(null, "The average wait time is " + avgWait + " \nThe average turnaround time is " + avgTurnAround);
        }       
    }                                           
    
    /*
    gets avgWaitTime by creating an array passed on by the getWaitTimes
    method and then finds the average
    */
    public int avgWaitTime(HashMap <Integer, Integer> burstMap, int processNum)
    {                                                                           
        Integer[] avgWaitTime = getWaitTimes(burstMap, processNum);
        int wT = 0;
        
        for(int i = 0; i < avgWaitTime.length; i++)
        {
            wT = avgWaitTime[i] + wT;
        }
        return wT/processNum;
    }
    
    /*
    Gets the wait times for each process then sends it to the avg
    wait time method
    */
    public Integer[] getWaitTimes(HashMap <Integer, Integer> burstMap, int processNum)
    {                                                                                   
        Integer[] waitTime = new Integer[processNum];
        
        for(int i = 0; i < waitTime.length; i++)
        {
            if(i == 0)
            {
                waitTime[i] = 0;
            }
            else
            {
                waitTime[i] = burstMap.get(i) + waitTime[i - 1];   
            }
        }
        return waitTime;
    }
    
    /*
    This calculates the average TurnAround time by getting the completion
    time for all processes first and then gets the average
    */
    public int avgTurnAround(HashMap<Integer, Integer> burstMap, int processNum)
    {                                                                           
        Integer[] avgTurnAroundTime = getCompletionTime(burstMap, processNum);
        int turnAround = 0;
        for(int i = 0; i < avgTurnAroundTime.length; i++)
        {
           turnAround = turnAround + avgTurnAroundTime[i];
        }
        return turnAround/processNum;
    }
    
    /*
    This method creates an array and has a loop that will end
    getting all the completion times for each process and will send
    the completion times to the avgTurnAround to be calculated
    */
    public Integer[] getCompletionTime(HashMap<Integer, Integer> burstMap, int processNum)
    {                                                                                   
        Integer[] completionTime = new Integer[processNum];                             
        
        for(int i = 0; i < completionTime.length; i++)
        {
            if(i == 0)
            {
                completionTime[i] = burstMap.get(i + 1);
            }
            else
            {
                completionTime[i] = completionTime[i - 1] + burstMap.get(i + 1);
                
            }
        }
        return completionTime;
    }
}