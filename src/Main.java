import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Applet Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                g.setColor(Color.BLACK);

                Font font = new Font("Roboto", Font.BOLD, 20);
                g.setFont(font);

                g.drawString("This is my first Applet!", 28, 50);
            }
        };
        frame.getContentPane().add(panel);
        frame.setSize(300,150);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}