import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class VendingMachineFrame extends JFrame implements ActionListener{
    JButton buyButton;
    Item ichezit = new Item("Chez-It", 2.50);
    Item idoritos = new Item("Doritos", 2.50);
    Item igatorade = new Item("Gatorade", 1.50);
    Item ireeses = new Item("Reeses", 1.00);
    Item isprite = new Item("Sprite", 1.50);
    Item iwater = new Item("Water", 1.00);


    VendingMachineFrame(){


        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0, 0, 1000, 625);

        JLabel balLabel = new JLabel();
        JLabel vmLabel = new JLabel();

        JLabel chezitnum = new JLabel();
        chezitnum.setBounds(130, -320, 1000, 1000);
        JLabel doritosnum = new JLabel();
        JLabel gatoradenum = new JLabel();
        JLabel reesesnum = new JLabel();
        JLabel spritenum = new JLabel();
        JLabel waternum = new JLabel();
        chezitnum.setText(ichezit.getAmount() + "");

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
        Image cheIm = che.getImage();
        Image dorIm = dor.getImage();
        Image gatIm = gat.getImage();
        Image reeIm = ree.getImage(); 
        Image sprIm = spr.getImage();
        Image watIm = wat.getImage();
        Image scaleChe = cheIm.getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH);
        Image scaleDor = dorIm.getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH);
        Image scaleGat = gatIm.getScaledInstance(45, 80, java.awt.Image.SCALE_SMOOTH);
        Image scaleRee = reeIm.getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH);
        Image scaleSpr = sprIm.getScaledInstance(45, 60, java.awt.Image.SCALE_SMOOTH);
        Image scaleWat = watIm.getScaledInstance(50, 80, java.awt.Image.SCALE_SMOOTH);
        che = new ImageIcon(scaleChe); 
        dor = new ImageIcon(scaleDor); 
        gat = new ImageIcon(scaleGat); 
        ree = new ImageIcon(scaleRee); 
        spr = new ImageIcon(scaleSpr); 
        wat = new ImageIcon(scaleWat); 
        chezit.setIcon(che);
        doritos.setIcon(dor);
        gatorade.setIcon(gat);
        reeses.setIcon(ree);
        sprite.setIcon(spr);
        water.setIcon(wat);
        chezit.setBounds(100, -360, 1000, 1000);
        doritos.setBounds(200, -360, 1000, 1000);
        gatorade.setBounds(100, -260, 1000, 1000); 
        reeses.setBounds(200, -235, 1000, 1000);
        sprite.setBounds(100, -140, 1000, 1000);
        water.setBounds(200, -150, 1000, 1000);

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
        layeredPane.add(vmLabel, Integer.valueOf(1));
        layeredPane.add(buyButton, Integer.valueOf(2));
        layeredPane.add(chezit, Integer.valueOf(2));
        layeredPane.add(doritos, Integer.valueOf(2));
        layeredPane.add(gatorade, Integer.valueOf(2));
        layeredPane.add(reeses, Integer.valueOf(2));
        layeredPane.add(sprite, Integer.valueOf(2));   
        layeredPane.add(water, Integer.valueOf(2));
        layeredPane.add(chezitnum, Integer.valueOf(3));

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==buyButton) {
            System.out.println("hi");
        }
    }

}