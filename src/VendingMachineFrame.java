import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.cert.LDAPCertStoreParameters;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class VendingMachineFrame extends JFrame implements ActionListener{
    JButton buyButton;

    VendingMachineFrame(){
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0, 0, 1000, 625);

        JLabel balLabel = new JLabel();
        JLabel vmLabel = new JLabel();
    
        //Snacks
        JLabel chezit = new JLabel();
        JLabel doritos = new JLabel();
        JLabel gatorade = new JLabel();
        JLabel reeses = new JLabel();
        JLabel sprite = new JLabel();
        JLabel water = new JLabel();
        ImageIcon che = new ImageIcon("src/image/chezit.png"); 
        ImageIcon dor = new ImageIcon("src/image/doritos.png"); 
        ImageIcon gat = new ImageIcon("src/image/gatorade.png"); 
        ImageIcon ree = new ImageIcon("src/image/reese.png"); 
        ImageIcon spr = new ImageIcon("src/image/sprite.png"); 
        ImageIcon wat = new ImageIcon("src/image/water.png"); 
        chezit.setIcon(che);
        doritos.setIcon(dor);
        gatorade.setIcon(gat);
        reeses.setIcon(ree);
        sprite.setIcon(spr);
        water.setIcon(wat);
        chezit.setBounds(25, -210 , 1000, 1000);
        doritos.setBounds(25, -210 , 1000, 1000);
        gatorade.setBounds(25, -210 , 1000, 1000); 
        reeses.setBounds(25, -210 , 1000, 1000);
        sprite.setBounds(25, -210 , 1000, 1000);
        water.setBounds(25, -210 , 1000, 1000);


        //Buttons
        buyButton = new JButton();
        buyButton.setBounds(320, 245, 35, 60);
        buyButton.addActionListener(this);


        //Customer Balance
        Random random = new Random();
        Customer customer = new Customer();
        double rand = random.nextDouble((15 - 5) + 1) + 5;

        balLabel.setBounds(800, 0, 500, 50);
        customer.setBalance(Math.round(rand * 100.0) / 100.0);
        balLabel.setText("Balance: $" + Math.round(customer.getBalance() * 100.0) / 100.0);
        balLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        
        //Vending Machine Image
        ImageIcon vendingMachine = new ImageIcon("src/image/vendingmachine.jpg"); 
        vmLabel.setIcon(vendingMachine);
        vmLabel.setBounds(25, -210 , 1000, 1000);

        //Frame  
        this.setTitle("Vending Machine");
        this.getContentPane().setBackground(Color.WHITE);
        this.setSize(1000, 625);
        this.setVisible(true);
        this.setResizable(false);
        this.setLayout(null);
        this.add(balLabel);
        this.add(layeredPane);
        layeredPane.add(vmLabel, Integer.valueOf(100));
        layeredPane.add(buyButton, Integer.valueOf(2));
        layeredPane.add(chezit, Integer.valueOf(3));
        layeredPane.add(doritos, Integer.valueOf(4));
        layeredPane.add(gatorade, Integer.valueOf(5));
        layeredPane.add(reeses, Integer.valueOf(1));
        layeredPane.add(sprite, Integer.valueOf(6));   
        layeredPane.add(water, Integer.valueOf(7));

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==buyButton) {
            System.out.println("hi");
        }
    }

}