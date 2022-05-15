import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyPanel extends JPanel implements ActionListener {
    Toolkit tk = Toolkit.getDefaultToolkit();
    final int PANEL_WIDTH = (int) tk.getScreenSize().getWidth();
    final int PANEL_HEIGHT = (int) tk.getScreenSize().getHeight();
    Image phoenix;
    int phoenixWidth = 100;
    int phoenixHeight = 100;
    Image backgroundImage;
    Timer timer;
    int time = 10;
    int xVelocity = 5;
    int yVelocity = 5;
    int x = 0;
    int y = 0;

    MyPanel() {
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
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
        
        if (x >= PANEL_WIDTH - phoenix.getWidth(null) || x < 0) {
            xVelocity = xVelocity * -1;
        }
        if (y >= PANEL_HEIGHT - phoenix.getHeight(null) || y < 0) {
            yVelocity = yVelocity * -1;
        }
        x = x + xVelocity;
        y = y + yVelocity;
        repaint();

    }

}
