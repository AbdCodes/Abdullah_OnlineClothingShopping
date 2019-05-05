package model;

public class Items {

    private String ItemName;
    private String ItemPrice;
    private int ItemID;
    private String ItemDescription;


    public Items(String ItemName,String ItemPrice, int ItemID,String ItemDescription){
        this.ItemName=ItemName;
        this.ItemPrice=ItemPrice;
        this.ItemID=ItemID;
        this.ItemDescription=ItemDescription;
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String itemName) {
        ItemName = itemName;
    }

    public String getItemPrice() {
        return ItemPrice;
    }

    public void setItemPrice(String itemPrice) {
        ItemPrice = itemPrice;
    }

    public int getItemID() {
        return ItemID;
    }

    public void setItemID(int itemID) {
        this.ItemID=ItemID;

    }

    public String getItemDescription() {
        return ItemDescription;
    }

    public void setItemDescription(String itemDescription) {
        ItemDescription = itemDescription;
    }
}



