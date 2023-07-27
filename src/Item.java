import java.text.DecimalFormat;

import java.text.DecimalFormat;

public class Item {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    private String itemname;
    private double itemprice;
    private int amount;

    public Item(String name, double price){
        itemname = name;
        itemprice = price;
        amount = 0;
    }

    public String getprice(){
        return df.format(itemprice);    
    }

    public String getName(){
        return itemname;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}