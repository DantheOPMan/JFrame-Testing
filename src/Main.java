public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
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
 * frame.getRootPane().putClientProperty("apple.awt.draggableWindowBackground",
 * true);
 * frame.getContentPane().setLayout(new java.awt.BorderLayout());
 * frame.getContentPane().add(new JTextField("text field north"),
 * java.awt.BorderLayout.NORTH);
 * frame.getContentPane().add(new JTextField("text field south"),
 * java.awt.BorderLayout.SOUTH);
 * frame.setVisible(true);
 * frame.pack();
 */
