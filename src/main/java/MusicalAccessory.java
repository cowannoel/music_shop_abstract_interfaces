public class MusicalAccessory extends Item {

    private String instrument;
    private String make;

    public MusicalAccessory(String description, double buyPrice, double sellPrice, String instrument, String make) {
        super(description, buyPrice, sellPrice);
        this.instrument = instrument;
        this.make = make;
    }

    public String getInstrument() {
        return instrument;
    }

    public String getMake() {
        return make;
    }
}
