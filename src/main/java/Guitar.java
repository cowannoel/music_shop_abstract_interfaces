public class Guitar extends Instrument {

    private boolean acoustic;
    private int numberOfStrings;

    public Guitar(String name, String material, String colour, String sound, double buyPrice, double sellPrice, boolean acoustic, int numberOfStrings){
        super(name, material, colour, sound, buyPrice, sellPrice);
        this.acoustic = acoustic;
        this.numberOfStrings = numberOfStrings;
    }

    public boolean isAcoustic() {
        return acoustic;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

}
