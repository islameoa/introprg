/*Programa que utilitzarà la classe ascensor per tal de comprovar que es pot executar una classe des de fora.*/

public class UsaAscensor{
	public static void main(String args[]){
		Ascensor ascensor = new Ascensor();
		System.out.println("L'ascensor creat des de fora està al pis " + ascensor.pis);
		System.out.println("L'ascensor està a la planta " + ascensor.pis);
	}
}
