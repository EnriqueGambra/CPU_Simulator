import java.util.HashMap;
import javax.swing.JOptionPane;

class Calculate 
{
        
        int avgBurst;
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
    
    public void FCFS(HashMap<Integer, Integer> burstMap, int processNum)
    {   
        
        
        if(processNum == 1)
        {
            pro1 = burstMap.get(1);
            JOptionPane.showMessageDialog(null, "The first process to execute is " + pro1 + "!");
        }
        else if(processNum == 2)
        {
            pro1 = burstMap.get(1);
            pro2 = burstMap.get(2);
            
            JOptionPane.showMessageDialog(null, "Process 1 executes first with a burst time of " + pro1 
                    + "! \nProcess 2 executes second with a burst time of " + pro2 + "!");
            
            avgBurst = (pro1 + pro2) / 2;
            JOptionPane.showMessageDialog(null, "The average burst time is " + avgBurst);
        }
        else if(processNum == 3)
        {
            pro1 = burstMap.get(1);
            pro2 = burstMap.get(2);
            pro3 = burstMap.get(3);
            avgBurst = (pro1 + pro2 + pro3) /3;
            
            JOptionPane.showMessageDialog(null, "Process 1 executes first with a burst time of " + pro1 + 
                    "!" + " \nProcess 2 executes second with a burst time of " + pro2 
                    + "! \nProcess 3 executes last with a burst time of " + pro3 + "!");
            
            
            JOptionPane.showMessageDialog(null, "The average burst time is " + avgBurst);
        }
        else if(processNum == 4)
        {
            pro1 = burstMap.get(1);
            pro2 = burstMap.get(2);
            pro3 = burstMap.get(3);
            pro4 = burstMap.get(4);
            avgBurst = (pro1 + pro2 + pro3 + pro4) / 4;
            
            JOptionPane.showMessageDialog(null, "Process 1 executes first with a burst time of " + pro1 + 
                    "!" + " \nProcess 2 executes second with a burst time of " + pro2 
                    + "! \nProcess 3 executes third with a burst time of " + pro3 
                    + "! \nProcess 4 executes last with a burst time of " + pro4 + "!");
            
            
            JOptionPane.showMessageDialog(null, "The average burst time is " + avgBurst);
        }
        else if(processNum == 5)
        {
            pro1 = burstMap.get(1);
            pro2 = burstMap.get(2);
            pro3 = burstMap.get(3);
            pro4 = burstMap.get(4);
            pro5 = burstMap.get(5);
            avgBurst = (pro1 + pro2 + pro3 + pro4 + pro5) / 5;
            
            JOptionPane.showMessageDialog(null, "Process 1 executes first with a burst time of " + pro1 + 
                    "!" + " \nProcess 2 executes second with a burst time of " + pro2 
                    + "! \nProcess 3 executes third with a burst time of " + pro3 
                    + "! \nProcess 4 executes fourth with a burst time of " + pro4
                    + "! \nProcess 5 executes last with a burst time of " + pro5 + "!");
            
            
            JOptionPane.showMessageDialog(null, "The average burst time is " + avgBurst);
        }
        else if(processNum == 6)
        {
            pro1 = burstMap.get(1);
            pro2 = burstMap.get(2);
            pro3 = burstMap.get(3);
            pro4 = burstMap.get(4);
            pro5 = burstMap.get(5);
            pro6 = burstMap.get(6);
            avgBurst = (pro1 + pro2 + pro3 + pro4 + pro5 + pro6) / 6;
            
            JOptionPane.showMessageDialog(null, "Process 1 executes first with a burst time of " + pro1 + 
                    "!" + " \nProcess 2 executes second with a burst time of " + pro2 
                    + "! \nProcess 3 executes third with a burst time of " + pro3 
                    + "! \nProcess 4 executes fourth with a burst time of " + pro4
                    + "! \nProcess 5 executes fifth with a burst time of " + pro5
                    + "! \nProcess 6 executes last with a burst time of " + pro6 + "!");
            
            
            JOptionPane.showMessageDialog(null, "The average burst time is " + avgBurst);
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
            avgBurst = (pro1 + pro2 + pro3 + pro4 + pro5 + pro6 + pro7) / 7;
            
            JOptionPane.showMessageDialog(null, "Process 1 executes first with a burst time of " + pro1 + 
                    "!" + " \nProcess 2 executes second with a burst time of " + pro2 
                    + "! \nProcess 3 executes third with a burst time of " + pro3 
                    + "! \nProcess 4 executes fourth with a burst time of " + pro4
                    + "! \nProcess 5 executes fifth with a burst time of " + pro5
                    + "! \nProcess 6 executes sixth with a burst time of " + pro6
                    + "! \nProcess 7 executes last with a burst time of " + pro7 + "!");
            
            
            JOptionPane.showMessageDialog(null, "The average burst time is " + avgBurst);
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
            avgBurst = (pro1 + pro2 + pro3 + pro4 + pro5 + pro6 + pro7 + pro8) / 8;
            
            JOptionPane.showMessageDialog(null, "Process 1 executes first with a burst time of " + pro1 + 
                    "!" + " \nProcess 2 executes second with a burst time of " + pro2 
                    + "! \nProcess 3 executes third with a burst time of " + pro3 
                    + "! \nProcess 4 executes fourth with a burst time of " + pro4
                    + "! \nProcess 5 executes fifth with a burst time of " + pro5
                    + "! \nProcess 6 executes sixth with a burst time of " + pro6
                    + "! \nProcess 7 executes seventh with a burst time of " + pro7
                    + "! \nProcess 8 executes last with a burst time of " + pro8 + "!");
            
            
            JOptionPane.showMessageDialog(null, "The average burst time is " + avgBurst);
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
            avgBurst = (pro1 + pro2 + pro3 + pro4 + pro5 + pro6 + pro7 + pro8 + pro9) / 9;
            
            JOptionPane.showMessageDialog(null, "Process 1 executes first with a burst time of " + pro1 + 
                    "!" + " \nProcess 2 executes second with a burst time of " + pro2 
                    + "! \nProcess 3 executes third with a burst time of " + pro3 
                    + "! \nProcess 4 executes fourth with a burst time of " + pro4
                    + "! \nProcess 5 executes fifth with a burst time of " + pro5
                    + "! \nProcess 6 executes sixth with a burst time of " + pro6
                    + "! \nProcess 7 executes seventh with a burst time of " + pro7
                    + "! \nProcess 8 executes last with a burst time of " + pro8
                    + "! \nProcess 9 executes last with a burst time of " + pro9 + "!");
            
            
            JOptionPane.showMessageDialog(null, "The average burst time is " + avgBurst);
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
            avgBurst = (pro1 + pro2 + pro3 + pro4 + pro5 + pro6 + pro7 + pro8 + pro9 + pro10) / 10;
            
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
            
            
            JOptionPane.showMessageDialog(null, "The average burst time is " + avgBurst);
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
            avgBurst = (pro1 + pro2 + pro3 + pro4 + pro5 + pro6 + pro7 + pro8 + pro9 + pro10 + pro11) / 11;
            
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
            
            
            JOptionPane.showMessageDialog(null, "The average burst time is " + avgBurst);
        }
        
            
    }
    
    public void SJF(HashMap<Integer, Integer> burstMap, int processNum)
    {
        Integer[] processSort;
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
    
    public Integer[] sortHashMap(HashMap<Integer, Integer> burstMap, int processNum)
    {
        Integer[] processSorted = new Integer[processNum];
        int temp;
        for(int i = 0; i < burstMap.size(); i++)
        {
           processSorted[i] = burstMap.get(i + 1);
        }
        
        for(int z = 0; z < processSorted.length - 1; z++)
        {
            if(processSorted[z] > processSorted[z + 1])
            {
                temp = processSorted[z];
                processSorted[z] = processSorted[z + 1];
                processSorted[z + 1] = temp;
            }
        }
        
        return processSorted;
        
    }
    
    public HashMap<Integer, Integer> switchKeys(HashMap<Integer, Integer> burstMap)
    {
        HashMap<Integer, Integer> reverse = new HashMap<>();
        for(int i = 0; i < burstMap.size(); i++)
        {
            int z = burstMap.get(i + 1);
            reverse.put(z, i + 1);
        }
        return reverse;
    }
    

}