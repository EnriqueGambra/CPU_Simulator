import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class GuiBuilder extends JFrame 
{
    public GuiBuilder()
    {
        super("Testing");
        setLayout(null);
        setSize(900, 900);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        add(new Processes());
        setVisible(true);
    }
 
}
