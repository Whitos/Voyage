import java.util.ArrayList;

public class KitVoyage {
    private String depart;
    private String destination;
    private ArrayList<OptionVoyage> lesOptions;

    public String getDepart() {
        return depart;
    }

    public String getDestination() {
        return destination;
    }
    
    public KitVoyage(String depart, String destination) {
        this.depart = depart;
        this.destination = destination;
        lesOptions = new ArrayList<OptionVoyage>();
    }

    public double getPrix() {
        double resultat = 0;
        for (OptionVoyage uneOption : lesOptions) {
            resultat += uneOption.getPrix();
        }
        return resultat;
    }

    @Override
    public String toString() {
        String chaine = "Voyage de " + depart + " à " + destination + ", avec pour options :\n";
        for (OptionVoyage uneOption : lesOptions) {
            chaine += uneOption.toString() + "\n";
        }
        chaine += "Prix total : " + getPrix() + " euros";
        return chaine;
    }
}
