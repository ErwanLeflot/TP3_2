public class Voilier extends Bateau {

    private double surface;

    public Voilier(String nm, int pds, String portAttache, int longue, double surfac) {
        super(nm, pds, portAttache, longue);
        surface = surfac;
    }

    public String toString() {
        String chaine = super.toString() + "\nSurface : " + surface + " metre carre" + "\nSomme : " + somme();
        return chaine;
    }

    public int somme() {
        return (int) (50 * getLongueur());
    }
    public void affiche(){
        System.out.println(this.toString());
    }
}