package model;

public class Items {

    private String ItemName;
    private String ItemPrice;
    private int ItemImage;
    private String ItemDescription;

    public Items(String itemName, String itemPrice, int itemImage, String itemDescription) {
        ItemName = itemName;
        ItemPrice = itemPrice;
        ItemImage = itemImage;
        ItemDescription = itemDescription;
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

    public int getItemImage() {
        return ItemImage;
    }

    public void setItemImage(int itemImage) {
        ItemImage = itemImage;
    }

    public String getItemDescription() {
        return ItemDescription;
    }

    public void setItemDescription(String itemDescription) {
        ItemDescription = itemDescription;
    }
}
