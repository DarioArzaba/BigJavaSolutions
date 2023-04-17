package e_10_25_LambdaButtonListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Reimplement the program in Section 10.8, specifiying the listener with
 * a lambda expression (see Java 8 Note 10.4).
 */
public class InvestmentViewer2
{
    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 100;

    private static final double INTEREST_RATE = 10;
    private static final double INITIAL_BALANCE = 1000;

    public static void main(String[] args)
    {
        JFrame frame = new JFrame();

        // The button to trigger the calculation
        JButton button = new JButton("Add Interest");

        // The application adds interest to this bank account
        final BankAccount account = new BankAccount(INITIAL_BALANCE);

        // The label for displaying the results
        final JLabel label = new JLabel("balance: " + account.getBalance());

        // The panel that holds the user interface components
        JPanel panel = new JPanel();
        panel.add(button);
        panel.add(label);
        frame.add(panel);

        button.addActionListener((ActionEvent event) ->
        {
            double interest = account.getBalance() * INTEREST_RATE / 100;
            account.deposit(interest);
            label.setText("balance: " + account.getBalance());
        });

        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
