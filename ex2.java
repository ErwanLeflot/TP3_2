
public class ex2 {
	public static void main(String[] args) throws Exception {
		Voilier voilier=new Voilier("Atalante",200,"Rio", 35, 50);
		ListeBateaux liste=new ListeBateaux();
		Yacht yacht=new Yacht("Tortuga", 500, "Rio", 90, 180, 7);
		liste.add(voilier);
		liste.add(yacht);
		liste.lister();
		
	}
}