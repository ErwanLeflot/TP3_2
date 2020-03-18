public abstract class Bateau {
    private String nom;
    private int poids;
    private String port;
    private double longueur;
    static final int PRIX=5;
    static final int PRIXE=20;
    public Bateau(String n,int pd,String pt,double l){
        this.nom=n;
        this.poids=pd;
        this.port=pt;
        this.longueur=l;
    }
    public String getNom(){
        return this.nom;
    }
    public int getPoids(){
        return this.poids;
    }
    public String getPort(){
        return this.port;
    }
    public double getLongueur(){
        return this.longueur;
    }
    public void affiche(){
        System.out.println(this.toString());
    }
    
    public abstract int somme();
    public String toString(){
        return "\nNom: "+this.nom+"\nPoids"+this.poids+"\nPort d'attache: "+this.port+"\nLongueur"+this.longueur;
    }
}