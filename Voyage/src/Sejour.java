public class Sejour extends OptionVoyage {

    private int nbNuits;
    private double prixParNuit;

    public Sejour(String nom, double prix, int nbNuits, double prixParNuit) {
        super(nom, prix);
        this.nbNuits = nbNuits;
        this.prixParNuit = prixParNuit;
    }


    public double getPrix() {
        return (nbNuits * prixParNuit) + super.getPrix();
    }
}
