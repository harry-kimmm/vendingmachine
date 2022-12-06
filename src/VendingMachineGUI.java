import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class VendingMachineGUI extends JFrame{
    private JPanel mainPanel;
    private JLabel balanceLabel;


    public VendingMachineGUI(String title){
        super(title);

        Random random = new Random();
        Customer customer = new Customer();
        double rand = random.nextDouble((15 - 5) + 1) + 5;
        customer.setBalance(Math.round(rand * 100.0) / 100.0);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();

        balanceLabel.setText("Balance: $" + Math.round(customer.getBalance() * 100.0) / 100.0);
        balanceLabel.setFont(new Font("Arial", Font.PLAIN, 25));


    }
}
