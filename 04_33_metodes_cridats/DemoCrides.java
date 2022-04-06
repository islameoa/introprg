/*Classe que ens cridarà als mètodes de les classes Feli, Gat, GatRenat i Menjar per tal de veure clarament quins mòduls s'utilitzen en cada moment*/
public class DemoCrides {
	public static void main(String[] args){
		Feli feli = new Feli();
		Gat gat = new Gat();
		GatRenat renat = new GatRenat();
		feli.netejaUrpes();
		gat.netejaUrpes();
		renat.netejaUrpes();
		gat.miola();
		renat.miola();
		Menjar menjar = new Menjar("bacallà");
		renat.menja(menjar);
	}
}
