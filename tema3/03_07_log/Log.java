/*Programa que ens ofereix un registre de log, un registre dels errors del nostre programa, en aquest fitxer només tenim les 4 funcions que utilitzarà el log real*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class Log{
	private static int contador;
	public static void reset(){
		contador = 0;
	}
	public static String printError(String mssg) throws IOException{
		String cami = "log.txt";
		BufferedWriter sortida = new BufferedWriter(new FileWriter(cami, true));
		contador++;
		String logError = String.format("[%d] ERROR: %s", contador, mssg);
		sortida.write(logError);
		sortida.newLine();
		sortida.close();
		return logError;
	}
	public static String printWarning(String mssg) throws IOException{
		String cami = "log.txt";
		BufferedWriter sortida = new BufferedWriter(new FileWriter(cami, true));
		contador++;
		String logWarning = String.format("[%d] WARNING: %s", contador, mssg);
		sortida.write(logWarning);
		sortida.newLine();
		sortida.close();
		return logWarning;
	}
	
	public static String printInfo(String mssg) throws IOException{
		String cami = "log.txt";
		BufferedWriter sortida = new BufferedWriter(new FileWriter(cami, true));
		contador++;
		String logInfo = String.format("[%d] INFO: %s", contador, mssg);
		sortida.write(logInfo);
		sortida.newLine();
		sortida.close();
		return logInfo;
	}
	
	public static String printDebug(String mssg) throws IOException{
		String cami = "log.txt";
		BufferedWriter sortida = new BufferedWriter(new FileWriter(cami, true));
		contador++;
		String logDebug = String.format("[%d] DEBUG: %s", contador, mssg);
		sortida.write(logDebug);
		sortida.newLine();
		sortida.close();
		return logDebug;
	}
}
