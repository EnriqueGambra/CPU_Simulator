
import java.util.HashMap;
import javax.swing.JOptionPane;


class Calculate 
{
   private int avgBurst;
   private int pro1;
   private int pro2;
   private int pro3;
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
            JOptionPane.showMessageDialog(null, "The first process to execute is " + pro1);
        }
        else if(processNum == 2)
        {
            pro1 = burstMap.get(1);
            pro2 = burstMap.get(2);
            
            JOptionPane.showMessageDialog(null, "Process 1 executes first with a burst time of " + pro1 +"! Process 2 executes second with a burst time of " + pro2);
            
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
                    "!" + " Process 2 executes second with a burst time of " + pro2 + "! Process 3 executes last with a burst time of " + pro3 + "!");
            
            
            JOptionPane.showMessageDialog(null, "The average burst time is " + avgBurst);
        }
            
    }
    
    public void SJF(HashMap<Integer, Integer> burstMap, int processNum)
    {
        if(processNum == 1)
        {
            
        }
    }
    

}

