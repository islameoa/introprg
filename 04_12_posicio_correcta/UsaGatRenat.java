/*Exercici que utilitza la classe GatRenat per provar que funciona*/

public class UsaGatRenat {
	public static void main(String[] args) {
		GatRenat renat = new GatRenat();
		System.out.println("Vides inicials: " + renat.GetVides());
		System.out.println("Posició inicial: " + renat.GetPosicio());
		System.out.println("Introdueix nova posició:");
		renat.setPosicio(Entrada.readLine());
		System.out.println("Posició final: " + renat.GetPosicio());
	}
}
