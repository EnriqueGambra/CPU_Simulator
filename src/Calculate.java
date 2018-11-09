import java.util.HashMap;
import javax.swing.JOptionPane;

class Calculate 
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
        
    public Calculate(String algo, int processNum, HashMap<Integer, Integer> burstMap)
    {    
        if(algo == "1. FCFS")
        {
            FCFS(burstMap, processNum);
        }
        
        else if(algo == "2. SJF")
        {
            SJF(burstMap, processNum);
        }            
    }
    
    public void FCFS(HashMap<Integer, Integer> burstMap, int processNum)//This method computes the FCFS algorithm by getting the values from the
    {                                                                   //hashmap and then as well getting the number of processes and simply
        if(processNum == 1)                                             //outputting the algo
        {
            pro1 = burstMap.get(1);
            JOptionPane.showMessageDialog(null, "The first process to execute is " + pro1 + "!");
        }
        else if(processNum == 2)
        {
            pro1 = burstMap.get(1);
            pro2 = burstMap.get(2);
            
            avgWait = pro2;
            JOptionPane.showMessageDialog(null, "Process 1 executes first with a burst time of " + pro1 
                    + "! \nProcess 2 executes second with a burst time of " + pro2 + "!");
            
            
            JOptionPane.showMessageDialog(null, "The average wait time is " + avgWait);
        }
        else if(processNum == 3)
        {
            pro1 = burstMap.get(1);
            pro2 = burstMap.get(2);
            pro3 = burstMap.get(3);
            avgWait = ((pro1*2) + pro2) /3;
            
            JOptionPane.showMessageDialog(null, "Process 1 executes first with a burst time of " + pro1 + 
                    "!" + " \nProcess 2 executes second with a burst time of " + pro2 
                    + "! \nProcess 3 executes last with a burst time of " + pro3 + "!");
            
            
            JOptionPane.showMessageDialog(null, "The average wait time is " + avgWait);
        }
        else if(processNum == 4)
        {
            pro1 = burstMap.get(1);
            pro2 = burstMap.get(2);
            pro3 = burstMap.get(3);
            pro4 = burstMap.get(4);
            avgWait = ((pro1 * 3) + (pro2*2) + pro3) / 4;
            
            JOptionPane.showMessageDialog(null, "Process 1 executes first with a burst time of " + pro1 + 
                    "!" + " \nProcess 2 executes second with a burst time of " + pro2 
                    + "! \nProcess 3 executes third with a burst time of " + pro3 
                    + "! \nProcess 4 executes last with a burst time of " + pro4 + "!");
            
            
            JOptionPane.showMessageDialog(null, "The average wait time is " + avgWait);
        }
        else if(processNum == 5)
        {
            pro1 = burstMap.get(1);
            pro2 = burstMap.get(2);
            pro3 = burstMap.get(3);
            pro4 = burstMap.get(4);
            pro5 = burstMap.get(5);
            avgWait = ((pro1*4) + (pro2*3) + (pro3*2) + pro4) / 5;
            
            JOptionPane.showMessageDialog(null, "Process 1 executes first with a burst time of " + pro1 + 
                    "!" + " \nProcess 2 executes second with a burst time of " + pro2 
                    + "! \nProcess 3 executes third with a burst time of " + pro3 
                    + "! \nProcess 4 executes fourth with a burst time of " + pro4
                    + "! \nProcess 5 executes last with a burst time of " + pro5 + "!");
            
            
            JOptionPane.showMessageDialog(null, "The average wait time is " + avgWait);
        }
        else if(processNum == 6)
        {
            pro1 = burstMap.get(1);
            pro2 = burstMap.get(2);
            pro3 = burstMap.get(3);
            pro4 = burstMap.get(4);
            pro5 = burstMap.get(5);
            pro6 = burstMap.get(6);
            avgWait = ((pro1*5) + (pro2*4) + (pro3*3) + (pro4*2) + pro5) / 6;
            
            JOptionPane.showMessageDialog(null, "Process 1 executes first with a burst time of " + pro1 + 
                    "!" + " \nProcess 2 executes second with a burst time of " + pro2 
                    + "! \nProcess 3 executes third with a burst time of " + pro3 
                    + "! \nProcess 4 executes fourth with a burst time of " + pro4
                    + "! \nProcess 5 executes fifth with a burst time of " + pro5
                    + "! \nProcess 6 executes last with a burst time of " + pro6 + "!");
            
            
            JOptionPane.showMessageDialog(null, "The average wait time is " + avgWait);
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
            avgWait = ((pro1*6) + (pro2*5) + (pro3*4) + (pro4*3) + (pro5*2) + pro6) / 7;
            
            JOptionPane.showMessageDialog(null, "Process 1 executes first with a burst time of " + pro1 + 
                    "!" + " \nProcess 2 executes second with a burst time of " + pro2 
                    + "! \nProcess 3 executes third with a burst time of " + pro3 
                    + "! \nProcess 4 executes fourth with a burst time of " + pro4
                    + "! \nProcess 5 executes fifth with a burst time of " + pro5
                    + "! \nProcess 6 executes sixth with a burst time of " + pro6
                    + "! \nProcess 7 executes last with a burst time of " + pro7 + "!");
            
            
            JOptionPane.showMessageDialog(null, "The average wait time is " + avgBurst);
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
            avgWait = ((pro1*7) + (pro2*6) + (pro3*5) + (pro4*4) + (pro5*3) + (pro6*2) + pro7) / 8;
            
            JOptionPane.showMessageDialog(null, "Process 1 executes first with a burst time of " + pro1 + 
                    "!" + " \nProcess 2 executes second with a burst time of " + pro2 
                    + "! \nProcess 3 executes third with a burst time of " + pro3 
                    + "! \nProcess 4 executes fourth with a burst time of " + pro4
                    + "! \nProcess 5 executes fifth with a burst time of " + pro5
                    + "! \nProcess 6 executes sixth with a burst time of " + pro6
                    + "! \nProcess 7 executes seventh with a burst time of " + pro7
                    + "! \nProcess 8 executes last with a burst time of " + pro8 + "!");
            
            
            JOptionPane.showMessageDialog(null, "The average wait time is " + avgWait);
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
            avgWait = ((pro1*8) + (pro2*7) + (pro3*6) + (pro4*5) + (pro5*4) + (pro6*3) + (pro7*2) + pro8) / 9;
            
            JOptionPane.showMessageDialog(null, "Process 1 executes first with a burst time of " + pro1 + 
                    "!" + " \nProcess 2 executes second with a burst time of " + pro2 
                    + "! \nProcess 3 executes third with a burst time of " + pro3 
                    + "! \nProcess 4 executes fourth with a burst time of " + pro4
                    + "! \nProcess 5 executes fifth with a burst time of " + pro5
                    + "! \nProcess 6 executes sixth with a burst time of " + pro6
                    + "! \nProcess 7 executes seventh with a burst time of " + pro7
                    + "! \nProcess 8 executes last with a burst time of " + pro8
                    + "! \nProcess 9 executes last with a burst time of " + pro9 + "!");
            
            
            JOptionPane.showMessageDialog(null, "The average wait time is " + avgWait);
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
            avgWait = ((pro1*9) + (pro2*8) + (pro3*7) + (pro4*6) + (pro5*5) + (pro6*4) + (pro7*3) + (pro8*2) + pro9) / 10;
            
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
            
            
            JOptionPane.showMessageDialog(null, "The average wait time is " + avgWait);
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
            avgWait = ((pro1*10) + (pro2*9) + (pro3*8) + (pro4*7) + (pro5*6) + (pro6*5) + (pro7*4) + (pro8*3) + (pro9*2) + pro10) / 11;
            
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
            
            
            JOptionPane.showMessageDialog(null, "The average wait time is " + avgWait);
        }
        
            
    }                                           
    
    public void SJF(HashMap<Integer, Integer> burstMap, int processNum)//This method computes the SJF algo by getting in a hashmap and then 
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
                                            + "! \nProcess " + burstSorted.get(pro3) + " executes third with a burst time of " + pro3);
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
        }
       
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
    

}