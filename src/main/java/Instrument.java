public abstract class Instrument implements IPlay, ISell {

    private String name;
    private String material;
    private String colour;
    private String sound;
    private double buyPrice;
    private double sellPrice;


    public Instrument(String name, String material, String colour, String sound, double buyPrice, double sellPrice){
        this.name = name;
        this.material = material;
        this.colour = colour;
        this.sound = sound;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;

    }

    public String getName() {
        return name;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public String getSound() {
        return sound;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public String play(){
        return "When you play the " + getName() + " it makes a " + getSound() + " sound!";
    }

    public double calculateMarkUp(){
        return getSellPrice() - getBuyPrice();
    }

}
