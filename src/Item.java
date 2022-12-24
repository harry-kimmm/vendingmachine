public class Item {
    private String itemname;
    private double itemprice;
    private int amount;

    public Item(String name, double price){
        itemname = name;
        itemprice = price;
        amount = 1;
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