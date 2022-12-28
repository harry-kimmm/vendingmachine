import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.util.Random;
import java.awt.Image;
import javax.swing.*;
import java.text.DecimalFormat;

public class VendingMachineFrame extends JFrame implements ActionListener{
    JTextField buyField;
    JTextField addField;
    JTextField addField2;
    JButton buyButton;
    JButton addButton;
    JButton addFieldBut;
    JButton addFieldBut2;
    JButton buyFieldBut;
    JLabel buy;
    JLabel add;
    boolean keypressable = false;
    VendingMachine machine;
    Item ichezit;
    Item idoritos;
    Item igatorade;
    Item ireeses;
    Item isprite;
    Item iwater;
    Customer customer;
    JLabel balLabel;
    JLabel chezitnum;
    JLabel doritosnum;
    JLabel gatoradenum;
    JLabel reesesnum;
    JLabel spritenum;
    JLabel waternum;

    VendingMachineFrame(){
        machine = new VendingMachine();
        buyField = new JTextField();
        buyField.setBounds(500, 300, 175, 50);
        buyField.setVisible(false); 
        buyField = new JTextField();
        buyField.setBounds(500, 300, 175, 50);
        buyField.setVisible(false); 

        addField = new JTextField();
        addField.setBounds(500, 300, 175, 50);
        addField.setVisible(false); 
        addField2 = new JTextField();
        addField2.setBounds(500, 300, 175, 50);
        addField2.setVisible(false); 


        //Buttons
        buyButton = new JButton();
        buyButton.setBounds(320, 245, 35, 60);
        buyButton.addActionListener(this);
        buyButton.setOpaque(false);
        buyButton.setContentAreaFilled(false);
        buyButton.setBorderPainted(false);
        buyFieldBut = new JButton("Submit");
        buyFieldBut.setBounds(700, 300, 100, 50);
        buyFieldBut.addActionListener(this); 
        buyFieldBut.setVisible(false); 
        addButton = new JButton();
        addButton.setBounds(320, 315, 35, 60);
        addButton.addActionListener(this);
        addButton.setOpaque(false);
        addButton.setContentAreaFilled(false);
        addButton.setBorderPainted(false);
        addFieldBut = new JButton("Submit");
        addFieldBut.setBounds(700, 300, 100, 50);
        addFieldBut.addActionListener(this); 
        addFieldBut.setVisible(false); 
        
        addFieldBut2 = new JButton("Submit");
        addFieldBut2.setBounds(700, 300, 100, 50);
        addFieldBut2.addActionListener(this); 
        addFieldBut2.setVisible(false); 
        
        ichezit = new Item("Chez-It", 2.50);
        idoritos = new Item("Doritos", 2.50);
        igatorade = new Item("Gatorade", 1.50);
        ireeses = new Item("Reeses", 1.00);
        isprite = new Item("Sprite", 1.50);
        iwater = new Item("Water", 1.00);

        for(int i = 0; i < 4; i++){
            machine.addItem(ichezit);
            machine.addItem(idoritos);
            machine.addItem(igatorade);
            machine.addItem(ireeses);
            machine.addItem(isprite);
            machine.addItem(iwater);
        }

        //Text
        buy = new JLabel("");
        buy.setBounds(500, -260, 1000, 1000);
        buy.setFont(new Font("Arial", Font.PLAIN, 18));

        add = new JLabel("");
        add.setBounds(500, -260, 1000, 1000);
        add.setFont(new Font("Arial", Font.PLAIN, 18));


        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0, 0, 1000, 625);

        balLabel = new JLabel();
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
        gatorade.setBounds(110, -260, 1000, 1000); 
        reeses.setBounds(200, -235, 1000, 1000);
        sprite.setBounds(105, -140, 1000, 1000);
        water.setBounds(205, -150, 1000, 1000);

        chezitnum = new JLabel();
        chezitnum.setText(ichezit.getAmount() + " | $" + ichezit.getprice());
        chezitnum.setBounds(115, -320, 1000, 1000);
        doritosnum = new JLabel();
        doritosnum.setText(idoritos.getAmount() + " | $" + idoritos.getprice());
        doritosnum.setBounds(215, -320, 1000, 1000);
        gatoradenum = new JLabel();
        gatoradenum.setText(igatorade.getAmount() + " | $" + igatorade.getprice());
        gatoradenum.setBounds(115, -215, 1000, 1000);
        reesesnum = new JLabel();
        reesesnum.setText(ireeses.getAmount() + " | $" + ireeses.getprice());
        reesesnum.setBounds(215, -215, 1000, 1000);
        spritenum = new JLabel();
        spritenum.setText(isprite.getAmount() + " | $" + isprite.getprice());
        spritenum.setBounds(115, -103, 1000, 1000);
        waternum = new JLabel();
        waternum.setText(iwater.getAmount() + " | " + iwater.getprice());
        waternum.setBounds(215, -103, 1000, 1000);


        //Customer Balance
        Random random = new Random();
        customer = new Customer();
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
        this.add(buy);
        this.add(layeredPane);
        this.add(buyField);
        this.add(buyFieldBut);
        this.add(buy);
        this.add(add);
        this.add(addField);
        this.add(addFieldBut);
        this.add(addField2);
        this.add(addFieldBut2);
        layeredPane.add(vmLabel, Integer.valueOf(1));
        layeredPane.add(buyButton, Integer.valueOf(2));
        layeredPane.add(addButton, Integer.valueOf(2));
        layeredPane.add(chezit, Integer.valueOf(2));
        layeredPane.add(doritos, Integer.valueOf(2));
        layeredPane.add(gatorade, Integer.valueOf(2));
        layeredPane.add(reeses, Integer.valueOf(2));
        layeredPane.add(sprite, Integer.valueOf(2));   
        layeredPane.add(water, Integer.valueOf(2));
        layeredPane.add(chezitnum, Integer.valueOf(3));
        layeredPane.add(doritosnum, Integer.valueOf(3));
        layeredPane.add(gatoradenum, Integer.valueOf(3));
        layeredPane.add(reesesnum, Integer.valueOf(3));
        layeredPane.add(spritenum, Integer.valueOf(3));
        layeredPane.add(waternum, Integer.valueOf(3));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==buyButton) {
            buy.setText("<html>What would you like to BUY? <br/>[1] Chez-It, [2] Doritos, [3] Gatorade, <br/>[4] Reeses, [5] Sprite, [6] Water: </html>");
            buyField.setVisible(true);
            buyFieldBut.setVisible(true);
            addField.setVisible(false);
            add.setText("");
            addFieldBut.setVisible(false);
            addFieldBut2.setVisible(false);
            addField2.setVisible(false);
        }

        if(e.getSource()==addButton) {
            add.setText("<html>What would you like to ADD? <br/>[1] Chez-It, [2] Doritos, [3] Gatorade, <br/>[4] Reeses, [5] Sprite, [6] Water: </html>");
            addField.setVisible(true);
            addFieldBut.setVisible(true);
            buyField.setVisible(false);
            buy.setText("");
            buyFieldBut.setVisible(false);
        }

        if(e.getSource()==buyFieldBut) {
            if(buyField.getText().equals("1")){
                customer.setBalance(customer.getBalance() - 2.50);
                balLabel.setText("Balance: $" + Math.round(customer.getBalance() * 100.0) / 100.0);
                buyField.setVisible(false);
                buyFieldBut.setVisible(false);
                buy.setText("");
                machine.removeItem(ichezit);
                chezitnum.setText(ichezit.getAmount() + " | $" + ichezit.getprice());
            }
            if(buyField.getText().equals("2")){
                customer.setBalance(customer.getBalance() - 2.50);
                balLabel.setText("Balance: $" + Math.round(customer.getBalance() * 100.0) / 100.0);
                buyField.setVisible(false);
                buyFieldBut.setVisible(false);
                buy.setText("");
                machine.removeItem(idoritos);
                doritosnum.setText(idoritos.getAmount() + " | $" + idoritos.getprice());
            }
            if(buyField.getText().equals("3")){
                customer.setBalance(customer.getBalance() - 1.50);
                balLabel.setText("Balance: $" + Math.round(customer.getBalance() * 100.0) / 100.0);
                buyField.setVisible(false);
                buyFieldBut.setVisible(false);
                buy.setText("");
                machine.removeItem(igatorade);
                gatoradenum.setText(igatorade.getAmount() + " | $" + igatorade.getprice());
            }
            if(buyField.getText().equals("4")){
                customer.setBalance(customer.getBalance() - 1.00);
                balLabel.setText("Balance: $" + Math.round(customer.getBalance() * 100.0) / 100.0);
                buyField.setVisible(false);
                buyFieldBut.setVisible(false);
                buy.setText("");
                machine.removeItem(ireeses);
                reesesnum.setText(ireeses.getAmount() + " | $" + ireeses.getprice());
            }
            if(buyField.getText().equals("5")){
                customer.setBalance(customer.getBalance() - 1.50);
                balLabel.setText("Balance: $" + Math.round(customer.getBalance() * 100.0) / 100.0);
                buyField.setVisible(false);
                buyFieldBut.setVisible(false);
                buy.setText("");
                machine.removeItem(isprite);
                spritenum.setText(isprite.getAmount() + " | $" + isprite.getprice());
            }
            if(buyField.getText().equals("6")){
                customer.setBalance(customer.getBalance() - 1.00);
                balLabel.setText("Balance: $" + Math.round(customer.getBalance() * 100.0) / 100.0);
                buyField.setVisible(false);
                buyFieldBut.setVisible(false);
                buy.setText("");
                machine.removeItem(iwater);
                waternum.setText(iwater.getAmount() + " | $" + iwater.getprice());
            }
        }

        if(e.getSource()==addFieldBut) {
            if(addField.getText().equals("1")){
                add.setText("How many?"); 
                addFieldBut.setVisible(false);
                addField.setVisible(false);
                addFieldBut2.setVisible(true);
                addField2.setVisible(true);
            }  
        }

        if(e.getSource()==addFieldBut2){
            int i=Integer.parseInt(addField2.getText()); 
            machine.addItems(ichezit, i);
            chezitnum.setText(ichezit.getAmount() + " | $" + ichezit.getprice());
            addFieldBut2.setVisible(false);
            addField2.setVisible(false);
            add.setText("");
        }
    }
}