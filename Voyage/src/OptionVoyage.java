public class OptionVoyage {
    private String nom;
    private double prix;
    private boolean tarifReduit;

    final static double COEF_TARIF_REDUIT = 0.8;

    /**
     * 
     * @param nom
     * @param prix
     */
    public OptionVoyage(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public String getNom() {
        return this.nom;
    }

    public double getPrix() {
        return this.prix;
    }

    @Override
    public String toString() {
        return  nom + "-> " + getPrix() + " euros";
    }

    
    
}
