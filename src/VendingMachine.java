import java.util.ArrayList;

public class VendingMachine {
    private ArrayList<Item> myItems;

    public VendingMachine(){
        myItems = new ArrayList<Item>();
    }


    public void addItem(Item item){
        boolean found = false;
        for (int i = 0; i < myItems.size(); i++){
            if (myItems.get(i).getName().equals(item.getName())) {
                found = true;
                myItems.get(i).setAmount(item.getAmount()+1);
            }
        }
        if (found == false){
            myItems.add(item);
        }
    }

    public void addItems(Item item, int amount){
        boolean found = false;
        for (int i = 0; i < myItems.size(); i++){
            if (myItems.get(i).getName().equals(item.getName())) {
                found = true;
                myItems.get(i).setAmount(item.getAmount()+amount);
            }
        }
        if (found == false){
            myItems.add(item);
        }
    }

    public void removeItem(Item item) {
        for (int i = 0; i < myItems.size(); i++) {
            if (myItems.get(i).getName().equals(item.getName())) {
                myItems.get(i).setAmount(item.getAmount() - 1);
            }
        }
    }

    public void removeAllItems(Item item){
        for (int i = 0; i < myItems.size(); i++){
            if (myItems.get(i).getName().equals(item.getName())) {
                myItems.remove(item);
            }
        }
    }

}