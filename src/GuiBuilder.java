import javax.swing.*;
public class GuiBuilder extends JFrame 
{
    public GuiBuilder()
    {
        super("CPU Simulator Project");
        setLayout(null);
        setSize(900, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        add(new Processes());
        setVisible(true);
    }
}
