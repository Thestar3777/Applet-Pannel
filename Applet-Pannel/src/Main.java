import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Add Application");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 150);

            JPanel panel = new JPanel(new GridLayout(3,2));

            JLabel label1 = new JLabel("Enter a number:");
            JTextField textField = new JTextField("0", 10);

            JLabel label2 = new JLabel("Enter second number:");
            JTextField textField2 = new JTextField("0", 10);

            JButton calculateButton = new JButton("Calculate");
            JLabel resultLabel = new JLabel("Sum: ");

            calculateButton.addActionListener(_ -> {
                int num1 = Integer.parseInt(textField.getText());
                int num2 = Integer.parseInt(textField2.getText());
                int sum = num1 + num2;
                resultLabel.setText("Sum: " + sum);
            });

            panel.add(label1);
            panel.add(textField);
            panel.add(label2);
            panel.add(textField2);
            panel.add(calculateButton);
            panel.add(resultLabel);

            frame.getContentPane().add(panel);
            frame.setResizable(false);
            frame.setVisible(true);
        });
    }
}
