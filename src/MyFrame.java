import java.awt.Color;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
    MyPanel panel;
    
    MyFrame(){
        panel = new MyPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setSize(1920,1080);
        //this.setUndecorated(true);
        //this.getContentPane().setBackground(new Color(1.0f,1.0f,1.0f,0.0f));
        //this.setBackground(new Color(1.0f,1.0f,1.0f,0.0f));
        this.setAlwaysOnTop(true);
        this.add(panel);
        this.getRootPane().putClientProperty("apple.awt.draggableWindowBackground",true);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
// general code stuff will look at to use later
/*
 * dan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 * dan.setSize(400,500);
 * dan.setLocation(200,200);
 * dan.setUndecorated(true);
 * dan.setVisible(true);
 * 
 * JFrame frame = new JFrame("Transparent Window");
 * frame.setUndecorated(true);
 * frame.setBackground(new Color(0, 0, 0, 255));
 * frame.setAlwaysOnTop(true);
 * // Without this, the window is draggable from any non transparent
 * // point, including points inside textboxes.
 * frame.getRootPane().putClientProperty("apple.awt.draggableWindowBackground",true);
 * frame.getContentPane().setLayout(new java.awt.BorderLayout());
 * frame.getContentPane().add(new JTextField("text field north"),
 * java.awt.BorderLayout.NORTH);
 * frame.getContentPane().add(new JTextField("text field south"),
 * java.awt.BorderLayout.SOUTH);
 * frame.setVisible(true);
 * frame.pack();
 */