public class Transport extends OptionVoyage {
    private boolean trajetLong;

    public static double TARIF_LONG = 1500;
    public static double TARIF_BASE = 200;

    public Transport(String nom, double prix, boolean trajetLong) {
        super(nom, prix);
        this.trajetLong = trajetLong;
    }

    public Transport(String nom, double prix) {
        super(nom, prix);
        this.trajetLong = false;
    }

    @Override
    public double getPrix() {
        if (trajetLong) {
            return TARIF_LONG + super.getPrix();
        } else {
            return TARIF_BASE + super.getPrix();
        }
    }


    @Override
    public String toString() {
        if (trajetLong) {
            return super.toString() + " (trajet long)";
        } else {
            return super.toString();
        }
    }
    
}
