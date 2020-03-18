public class BateauAMoteur extends Bateau{
    private double puiss;
    public BateauAMoteur(String n,int pd,String pt,double l,double puissance){
        super(n,pd,pt,l);
        this.puiss=puissance;

    }
    public double getPuissance(){
        return puiss;
    }
    public String toString() {
        return super.toString()+"\nPuissance: "+this.puiss;     
    }
    public int somme() {
        return (int)(70*getLongueur()+PRIX*puiss);
    }
    public void affiche(){
        System.out.println(this.toString());
    }
}