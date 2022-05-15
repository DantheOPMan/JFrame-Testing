import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{
    MyPanel panel;
    
    MyFrame(){
        panel = new MyPanel();
        Toolkit tk = Toolkit.getDefaultToolkit();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(tk.getScreenSize());
        this.setUndecorated(true);
        this.setBackground(new Color(1.0f,1.0f,1.0f,0.0f));
        this.setAlwaysOnTop(true);
        this.add(panel);
        this.getRootPane().putClientProperty("apple.awt.draggableWindowBackground",true);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
}