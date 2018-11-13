import java.util.HashMap;
import javax.swing.JOptionPane;

public class SJF 
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

        public SJF(int processNum, HashMap<Integer, Integer> burstMap)
        {
            calcSJF(burstMap, processNum);
        }


        public void calcSJF(HashMap<Integer, Integer> burstMap, int processNum)//This method computes the SJF algo by getting in a hashmap and then 
    {                                                                   //calling the sortHashMap method to sort the values in the correct form
        Integer[] processSort;                                          //for the SJF algo
        processSort = sortHashMap(burstMap, processNum);
        HashMap <Integer, Integer> burstSorted = new HashMap<Integer, Integer>();
        
        if(processNum == 1)
        {
            pro1 = burstMap.get(1);
            JOptionPane.showMessageDialog(null, "Process " + burstMap.get(pro1) + " executes first with a burst time of " + pro1);
            JOptionPane.showMessageDialog(null, "The average burst time is " + pro1);
            
           
        }
        else if(processNum == 2)
        {
            pro1 = processSort[0];
            pro2 = processSort[1];
            
            burstSorted = switchKeys(burstMap);
            burstSorted.get(pro1);
            burstSorted.get(pro2);
            
            JOptionPane.showMessageDialog(null, "Process " + burstSorted.get(pro1) + " executes first with a burst time of " + pro1
                                            + "! \nProcess " + burstSorted.get(pro2) + " executes second with a burst time of " + pro2);   
            
            
        }
        else if(processNum == 3)
        {
            pro1 = processSort[0];
            pro2 = processSort[1];
            pro3 = processSort[2];
            
            burstSorted = switchKeys(burstMap);
            burstSorted.get(pro1);
            burstSorted.get(pro2);
            burstSorted.get(pro3);
            
            JOptionPane.showMessageDialog(null, "Process " + burstSorted.get(pro1) + " executes first with a burst time of " + pro1
                                            + "! \nProcess " + burstSorted.get(pro2) + " executes second with a burst time of " + pro2
                                            + "! \nProcess " + burstSorted.get(pro3) + " executes third with a burst time of " + pro3);
            
           
        }
        else if(processNum == 4)
        {
            pro1 = processSort[0];
            pro2 = processSort[1];
            pro3 = processSort[2];
            pro4 = processSort[3];
            
            burstSorted = switchKeys(burstMap);
            burstSorted.get(pro1);
            burstSorted.get(pro2);
            burstSorted.get(pro3);
            burstSorted.get(pro4);
            
            JOptionPane.showMessageDialog(null, "Process " + burstSorted.get(pro1) + " executes first with a burst time of " + pro1
                                            + "! \nProcess " + burstSorted.get(pro2) + " executes second with a burst time of " + pro2
                                            + "! \nProcess " + burstSorted.get(pro3) + " executes third with a burst time of " + pro3
                                            + "! \nProcess " + burstSorted.get(pro4) + " executes fourth with a burst time of " + pro4);

        }
         else if(processNum == 5)
        {
            pro1 = processSort[0];
            pro2 = processSort[1];
            pro3 = processSort[2];
            pro4 = processSort[3];
            pro5 = processSort[4];
            burstSorted = switchKeys(burstMap);
            burstSorted.get(pro1);
            burstSorted.get(pro2);
            burstSorted.get(pro3);
            burstSorted.get(pro4);
            burstSorted.get(pro5);
            
            JOptionPane.showMessageDialog(null, "Process " + burstSorted.get(pro1) + " executes first with a burst time of " + pro1
                                            + "! \nProcess " + burstSorted.get(pro2) + " executes second with a burst time of " + pro2
                                            + "! \nProcess " + burstSorted.get(pro3) + " executes third with a burst time of " + pro3
                                            + "! \nProcess " + burstSorted.get(pro4) + " executes fourth with a burst time of " + pro4
                                            + "! \nProcess " + burstSorted.get(pro5) + " executes fourth with a burst time of " + pro5);
        }
        else if(processNum == 6)
        {
            pro1 = processSort[0];
            pro2 = processSort[1];
            pro3 = processSort[2];
            pro4 = processSort[3];
            pro5 = processSort[4];
            pro6 = processSort[5];
            burstSorted = switchKeys(burstMap);
            burstSorted.get(pro1);
            burstSorted.get(pro2);
            burstSorted.get(pro3);
            burstSorted.get(pro4);
            burstSorted.get(pro5);
            burstSorted.get(pro6);
            
            JOptionPane.showMessageDialog(null, "Process " + burstSorted.get(pro1) + " executes first with a burst time of " + pro1
                                            + "! \nProcess " + burstSorted.get(pro2) + " executes second with a burst time of " + pro2
                                            + "! \nProcess " + burstSorted.get(pro3) + " executes third with a burst time of " + pro3
                                            + "! \nProcess " + burstSorted.get(pro4) + " executes fourth with a burst time of " + pro4
                                            + "! \nProcess " + burstSorted.get(pro5) + " executes fourth with a burst time of " + pro5
                                            + "! \nProcess " + burstSorted.get(pro6) + " executes fourth with a burst time of " + pro6);
        }
        else if(processNum == 7)
        {
            pro1 = processSort[0];
            pro2 = processSort[1];
            pro3 = processSort[2];
            pro4 = processSort[3];
            pro5 = processSort[4];
            pro6 = processSort[5];
            pro7 = processSort[6];
            burstSorted = switchKeys(burstMap);
            burstSorted.get(pro1);
            burstSorted.get(pro2);
            burstSorted.get(pro3);
            burstSorted.get(pro4);
            burstSorted.get(pro5);
            burstSorted.get(pro6);
            burstSorted.get(pro7);
            
           JOptionPane.showMessageDialog(null, "Process " + burstSorted.get(pro1) + " executes first with a burst time of " + pro1
                                            + "! \nProcess " + burstSorted.get(pro2) + " executes second with a burst time of " + pro2
                                            + "! \nProcess " + burstSorted.get(pro3) + " executes third with a burst time of " + pro3
                                            + "! \nProcess " + burstSorted.get(pro4) + " executes fourth with a burst time of " + pro4
                                            + "! \nProcess " + burstSorted.get(pro5) + " executes fourth with a burst time of " + pro5
                                            + "! \nProcess " + burstSorted.get(pro6) + " executes fourth with a burst time of " + pro6
                                            + "! \nProcess " + burstSorted.get(pro7) + " executes fourth with a burst time of " + pro7);
        }
        else if(processNum == 8)
        {
            pro1 = processSort[0];
            pro2 = processSort[1];
            pro3 = processSort[2];
            pro4 = processSort[3];
            pro5 = processSort[4];
            pro6 = processSort[5];
            pro7 = processSort[6];
            pro8 = processSort[7];
            burstSorted = switchKeys(burstMap);
            burstSorted.get(pro1);
            burstSorted.get(pro2);
            burstSorted.get(pro3);
            burstSorted.get(pro4);
            burstSorted.get(pro5);
            burstSorted.get(pro6);
            burstSorted.get(pro7);
            burstSorted.get(pro8);
            
            JOptionPane.showMessageDialog(null, "Process " + burstSorted.get(pro1) + " executes first with a burst time of " + pro1
                                            + "! \nProcess " + burstSorted.get(pro2) + " executes second with a burst time of " + pro2
                                            + "! \nProcess " + burstSorted.get(pro3) + " executes third with a burst time of " + pro3
                                            + "! \nProcess " + burstSorted.get(pro4) + " executes fourth with a burst time of " + pro4
                                            + "! \nProcess " + burstSorted.get(pro5) + " executes fourth with a burst time of " + pro5
                                            + "! \nProcess " + burstSorted.get(pro6) + " executes fourth with a burst time of " + pro6
                                            + "! \nProcess " + burstSorted.get(pro7) + " executes fourth with a burst time of " + pro7
                                            + "! \nProcess " + burstSorted.get(pro8) + " executes fourth with a burst time of " + pro8);
        }
        else if(processNum == 9)
        {
            pro1 = processSort[0];
            pro2 = processSort[1];
            pro3 = processSort[2];
            pro4 = processSort[3];
            pro5 = processSort[4];
            pro6 = processSort[5];
            pro7 = processSort[6];
            pro8 = processSort[7];
            pro9 = processSort[8];
            burstSorted = switchKeys(burstMap);
            burstSorted.get(pro1);
            burstSorted.get(pro2);
            burstSorted.get(pro3);
            burstSorted.get(pro4);
            burstSorted.get(pro5);
            burstSorted.get(pro6);
            burstSorted.get(pro7);
            burstSorted.get(pro8);
            burstSorted.get(pro9);
            
            JOptionPane.showMessageDialog(null, "Process " + burstSorted.get(pro1) + " executes first with a burst time of " + pro1
                                            + "! \nProcess " + burstSorted.get(pro2) + " executes second with a burst time of " + pro2
                                            + "! \nProcess " + burstSorted.get(pro3) + " executes third with a burst time of " + pro3
                                            + "! \nProcess " + burstSorted.get(pro4) + " executes fourth with a burst time of " + pro4
                                            + "! \nProcess " + burstSorted.get(pro5) + " executes fourth with a burst time of " + pro5
                                            + "! \nProcess " + burstSorted.get(pro6) + " executes fourth with a burst time of " + pro6
                                            + "! \nProcess " + burstSorted.get(pro7) + " executes fourth with a burst time of " + pro7
                                            + "! \nProcess " + burstSorted.get(pro8) + " executes fourth with a burst time of " + pro8
                                            + "! \nProcess " + burstSorted.get(pro9) + " executes fourth with a burst time of " + pro9);
        }
        else if(processNum == 10)
        {
            pro1 = processSort[0];
            pro2 = processSort[1];
            pro3 = processSort[2];
            pro4 = processSort[3];
            pro5 = processSort[4];
            pro6 = processSort[5];
            pro7 = processSort[6];
            pro8 = processSort[7];
            pro9 = processSort[8];
            pro10 = processSort[9];
            burstSorted = switchKeys(burstMap);
            burstSorted.get(pro1);
            burstSorted.get(pro2);
            burstSorted.get(pro3);
            burstSorted.get(pro4);
            burstSorted.get(pro5);
            burstSorted.get(pro6);
            burstSorted.get(pro7);
            burstSorted.get(pro8);
            burstSorted.get(pro9);
            burstSorted.get(pro10);
            
            JOptionPane.showMessageDialog(null, "Process " + burstSorted.get(pro1) + " executes first with a burst time of " + pro1
                                            + "! \nProcess " + burstSorted.get(pro2) + " executes second with a burst time of " + pro2
                                            + "! \nProcess " + burstSorted.get(pro3) + " executes third with a burst time of " + pro3
                                            + "! \nProcess " + burstSorted.get(pro4) + " executes fourth with a burst time of " + pro4
                                            + "! \nProcess " + burstSorted.get(pro5) + " executes fourth with a burst time of " + pro5
                                            + "! \nProcess " + burstSorted.get(pro6) + " executes fourth with a burst time of " + pro6
                                            + "! \nProcess " + burstSorted.get(pro7) + " executes fourth with a burst time of " + pro7
                                            + "! \nProcess " + burstSorted.get(pro8) + " executes fourth with a burst time of " + pro8
                                            + "! \nProcess " + burstSorted.get(pro9) + " executes fourth with a burst time of " + pro9
                                            + "! \nProcess " + burstSorted.get(pro10) + " executes fourth with a burst time of " + pro10);
        }
        else if(processNum == 11)
        {
            pro1 = processSort[0];
            pro2 = processSort[1];
            pro3 = processSort[2];
            pro4 = processSort[3];
            pro5 = processSort[4];
            pro6 = processSort[5];
            pro7 = processSort[6];
            pro8 = processSort[7];
            pro9 = processSort[8];
            pro10 = processSort[9];
            pro11 = processSort[10];
            burstSorted = switchKeys(burstMap);
            burstSorted.get(pro1);
            burstSorted.get(pro2);
            burstSorted.get(pro3);
            burstSorted.get(pro4);
            burstSorted.get(pro5);
            burstSorted.get(pro6);
            burstSorted.get(pro7);
            burstSorted.get(pro8);
            burstSorted.get(pro9);
            burstSorted.get(pro10);
            burstSorted.get(pro11);
            
            JOptionPane.showMessageDialog(null, "Process " + burstSorted.get(pro1) + " executes first with a burst time of " + pro1
                                            + "! \nProcess " + burstSorted.get(pro2) + " executes second with a burst time of " + pro2
                                            + "! \nProcess " + burstSorted.get(pro3) + " executes third with a burst time of " + pro3
                                            + "! \nProcess " + burstSorted.get(pro4) + " executes fourth with a burst time of " + pro4
                                            + "! \nProcess " + burstSorted.get(pro5) + " executes fourth with a burst time of " + pro5
                                            + "! \nProcess " + burstSorted.get(pro6) + " executes fourth with a burst time of " + pro6
                                            + "! \nProcess " + burstSorted.get(pro7) + " executes fourth with a burst time of " + pro7
                                            + "! \nProcess " + burstSorted.get(pro8) + " executes fourth with a burst time of " + pro8
                                            + "! \nProcess " + burstSorted.get(pro9) + " executes fourth with a burst time of " + pro9
                                            + "! \nProcess " + burstSorted.get(pro10) + " executes fourth with a burst time of " + pro10
                                            + "! \nProcess " + burstSorted.get(pro11) + " executes fourth with a burst time of " + pro11);
        }
        
        avgWait = avgWaitTime(processNum, processSort);
        avgTurnAround = avgTurnAroundTime(processNum, processSort);
        
        JOptionPane.showMessageDialog(null, " The average wait is " + avgWait + " The average turnaround time is " + avgTurnAround);
       
    }

         public Integer[] sortHashMap(HashMap<Integer, Integer> burstMap, int processNum)//This method sorts the hashmap from shortest value to largest value
    {                                                                               //by creating an array that gets the values from the hashmap...
        Integer[] processSorted = new Integer[processNum];                          //It then returns the sorted array
        int temp;
        for(int i = 0; i < burstMap.size(); i++)
        {
           processSorted[i] = burstMap.get(i + 1);
        }
        
        for(int z = 0; z < processSorted.length - 1; z++)
        {
            for(int j = z+1; j < processSorted.length; j++)
            {
                if((processSorted[z] > processSorted[j]) && (z != j))
                {
                temp = processSorted[j];
                processSorted[j] = processSorted[z];
                processSorted[z] = temp;
                }
            }
            
        }
        
        
        return processSorted;
        
    }
    
    public HashMap<Integer, Integer> switchKeys(HashMap<Integer, Integer> burstMap)//This method switches the keys for the hashmap so that when it returns
    {                                                                              //the switched hashmap, it can compare the values of the original 
        HashMap<Integer, Integer> reverse = new HashMap<>();                       //hashmap to the reversed and outputs the correct values in an order
        for(int i = 0; i < burstMap.size(); i++)                                   //that the SJF algo requires
        {
            int z = burstMap.get(i + 1);
            reverse.put(z, i + 1);
        }
        return reverse;
    }
    
    public int avgTurnAroundTime(int processNum, Integer[] processSort)    
    {
        Integer[] avgTurnAroundTime = getCompletionTime(processNum, processSort);
        int turnAround = 0;
        for(int i = 0; i < avgTurnAroundTime.length; i++)
        {
           turnAround = turnAround + avgTurnAroundTime[i];
        }
        
        return turnAround/processNum;
    }
    
    public Integer[] getCompletionTime(int processNum, Integer[] processSort)
    {
         Integer[] completionTime = new Integer[processNum];                             //the completion times to the avgTurnAround to be calculated
        
        for(int i = 0; i < completionTime.length; i++)
        {
            if(i == 0)
            {
                completionTime[i] = processSort[i];
            }
            else
            {
                completionTime[i] = completionTime[i - 1] + processSort[i];   
            }
        }
        
        return completionTime;
    }
    
    public int avgWaitTime(int processNum, Integer[] processSort) 
    {
          Integer[] avgWaitTime = getWaitTime(processNum, processSort);
          
          int wT = 0;
        
        for(int i = 0; i < avgWaitTime.length - 1; i++)
        {
            wT = avgWaitTime[i] + wT;
            
        }
        
        return wT/processNum;
    }

    private Integer[] getWaitTime(int processNum, Integer[] processSort) 
    {
        Integer[] waitTime = new Integer[processNum];
        
        for(int i = 0; i < waitTime.length; i++)
        {
            if(i == 0)
            {
                waitTime[i] = processSort[i];
                //System.out.println(processSort[i]);
            }
            else
            {
               
                
                   waitTime[i] = processSort[i] + waitTime[i - 1]; 
                   
                   //System.out.println(processSort[i]);
                   //System.out.println(waitTime[i]);
                
            }
        }
        return waitTime;
    }

}