public class Yacht extends BateauAMoteur{
    private int nombreEquipage;
    public Yacht(String n,int pd,String pt,double l,double puissance,int nbrEquipage){
        super(n,pd,pt,l,puissance);
        this.nombreEquipage=nbrEquipage;
    }
    public int getNombreEquipage(){
        return nombreEquipage;
    }
    public String toString(){
        return super.toString()+"\nNombre de membre d'équipage: "+this.nombreEquipage;
    }
    public void affiche(){
        System.out.println(this.toString());
    }
    public int somme(){
        return (int)(70*getLongueur()+PRIX*getPuissance()+PRIXE*nombreEquipage);
    }
}