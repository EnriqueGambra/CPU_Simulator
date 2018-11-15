import javax.swing.JFrame;
public class GuiBuilder extends JFrame 
{
    // this creates the JFrame that will hold the components of the project
    public GuiBuilder()
    {
        super("CPU Simulator Project");
        setLayout(null);
        setSize(470, 580);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        
        // Processes is a class that extends JPanel and includes several 
        // components that are necessary for the CPU simulation
        add(new Processes());
        setVisible(true);
    }
}
