import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class MyPanel extends JPanel implements ActionListener {
    Toolkit tk = Toolkit.getDefaultToolkit();
    final int PANEL_WIDTH = (int) tk.getScreenSize().getWidth();
    final int PANEL_HEIGHT = (int) tk.getScreenSize().getHeight();
    Image phoenix;
    int phoenixWidth = 50;
    int phoenixHeight = 50;
    Image backgroundImage;
    Timer timer;
    int time = 50;
    int xVelocity = 1;
    int yVelocity = 1;
    int x = 0;
    int y = 0;

    MyPanel() {
        this.setPreferredSize(tk.getScreenSize());
        this.setOpaque(false);
        phoenix = new ImageIcon("Phoenix.png").getImage().getScaledInstance(phoenixWidth, phoenixHeight,Image.SCALE_DEFAULT);
        timer = new Timer(time, this);
        timer.start();
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(phoenix, x, y, null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Random gen = new Random();
        int decisionTime = gen.nextInt(20) + 20;

        
        if (x >= (int)(tk.getScreenSize().getWidth()) - phoenix.getWidth(null) || x < 0) {
            xVelocity = xVelocity * -1;
        }
        if (y >= (int)(tk.getScreenSize().getWidth()) - phoenix.getHeight(null) || y < 0) {
            yVelocity = yVelocity * -1;
        }
        x = x + xVelocity;
        y = y + yVelocity;
        repaint();
        /*Point mouse = MouseInfo.getPointerInfo().getLocation();
        x = (int)mouse.getX() - phoenixHeight / 2;
        y = (int)mouse.getY() - phoenixWidth / 2;
       */
        
    }
    private void setNewDirection(){

    }

}
