import java.util.ArrayList;


public class ListeBateaux{
    private static ArrayList<Bateau> ListBat;
    public ListeBateaux(){
        ListBat = new ArrayList<Bateau>();
    }
    public void add(Bateau bat){
        ListBat.add(bat);
    }
    public void lister(){
        for(int i = 0; i < ListBat.size(); i++) {
            System.out.println(ListBat.get(i).toString());
        }
    }
    public double longueurDe(Bateau bat){
        return bat.getLongueur();
    }
    public void listerPar(String port){
        for(int i = 0; i < ListBat.size(); i++) {
            
            if (ListBat.get(i).getPort()==port){
                System.out.println(ListBat.get(i).toString());
            }
        }
    }
}