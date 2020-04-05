public class Item implements ISell {

    private String description;
    private double buyPrice;
    private double sellPrice;

    public Item(String description, double buyPrice, double sellPrice){
        this.description = description;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getDescription() {
        return description;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public double calculateMarkUp() {
        return getSellPrice() - getBuyPrice();
    }
}
