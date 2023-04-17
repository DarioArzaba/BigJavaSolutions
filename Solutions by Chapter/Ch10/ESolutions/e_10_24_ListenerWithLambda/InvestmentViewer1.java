package e_10_24_ListenerWithLambda;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.event.ActionEvent;

/**
 * Reimplement the program in Section 10.7.2, specifiying the listener with
 * a lambda expression (see Java 8 Note 10.4).
 */
public class InvestmentViewer1
{
    private static final int FRAME_WIDTH = 200;
    private static final int FRAME_HEIGHT = 80;

    private static final double INTEREST_RATE = 10;
    private static final double INITIAL_BALANCE = 1000;

    public static void main(String[] args)
    {
        JFrame frame = new JFrame();

        // The button to trigger the calculation
        JButton button = new JButton("Add Interest");
        frame.add(button);

        // The application adds interest to this bank account
        final BankAccount account = new BankAccount(INITIAL_BALANCE);

        button.addActionListener((ActionEvent event) -> {
            double interest = account.getBalance() * INTEREST_RATE / 100;
            account.deposit(interest);
            System.out.println("balance: " + account.getBalance());
        });

        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
