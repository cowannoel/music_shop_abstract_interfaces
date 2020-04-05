public class Piano extends Instrument {

    private String style;
    private int numberOfKeys;

    public Piano(String name, String material, String colour, String sound, double buyPrice, double sellPrice, String style, int numberOfKeys){
        super(name, material, colour, sound, buyPrice, sellPrice);
        this.style = style;
        this.numberOfKeys = numberOfKeys;
    }

    public String getStyle() {
        return style;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

}
