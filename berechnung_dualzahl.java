/************************************************
* Aufgabe32.java                                *
* Programm Dualzahl               				*
*                                               *
* Autor: Kevin Bischof							*
* Datum: 13.12.2016								*
************************************************/
import java.util.Scanner;

public class Aufgabe32 {
	private static Scanner in;
	public static void main(String[] args){
		in = new Scanner(System.in);
		/*Wertebereich 8 Bit Dualzahl: 0=<Wert<=2^8-1
		 * Definitionsbereich Dezimalzahl: 0-255
		 */
		
		//Deklarieren der Variablen
		int dezimalzahl = 0;
		int[] dualzahl = new int[8];
		int i=0,rest=0;
		
		//Programmtitel
		System.out.println("\nProgramm Dualzahl\n");
		System.out.printf("Geben Sie bitte eine ganze Zahl ein: ");
		
		//Einlesen der Benutzereingabe
		dezimalzahl = in.nextInt();
		
		//Pruefen, ob die Benutzereingabe korrekt war
		while(!(dezimalzahl>=0 && dezimalzahl<=255)) {
			System.out.printf("Fehler! Bitte geben Sie eine Zahl zwischen 0 und 255 ein: ");
			dezimalzahl = in.nextInt();
		}
		
		//Berechnung der Dualzahl
		for(i=7;i>=0;i--){
			rest = dezimalzahl % 2;
			dualzahl[i] = rest;
			dezimalzahl = (dezimalzahl - rest)/2;		
		}	
		
		//Ausgabe der Dualzahl
		System.out.printf("Ausgabe im Dualsystem: ");
		for(i=0;i<4;i++){
			System.out.printf("%d",dualzahl[i]);
		}
		System.out.printf(" ");
		for(i=4;i<8;i++){
			System.out.printf("%d",dualzahl[i]);
		}
		System.out.println();
		
		//Programmende
	}
}
