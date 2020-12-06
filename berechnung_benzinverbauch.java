/************************************************
* Berechnung des Benzinverbrauchs eines Autos   *
*                                               *
* Autor: Kevin Bischof					        *
* Datum: 10.11.2016					            *
************************************************/

import java.util.Scanner;

//Definieren der Klasse
public class Aufgabe15 {
	//Definieren des Scanners
	static Scanner in;
	//Beginn Hauptmethode
	public static void main(String[] args) {
		//Erstellen des Scanners in
		in = new Scanner(System.in);
		
//Deklarieren der Variablen
		double benzin, km, verbrauch;
		//Programmtitel
		System.out.println("\nProgramm zur Berechnung des Benzinverbrauchs eines Autos\n");
		//Aufforderung zur Eingabe
		System.out.println("Bitte geben Sie die verbrauchte Benzinmenge in Liter ein: ");
		benzin = in.nextDouble();
		System.out.println("Bitte geben Sie die gefahrenen Kilometer ein: ");
		km = in.nextDouble();
		//Berechnungen
		verbrauch = (benzin * 100)/(km);
		//Ausgabe des Ergebnisses
		System.out.printf("Ihr Wagen verbraucht %05.2f Liter Benzin auf 100 Kilometer.\n",verbrauch);
		//Programmende
	}
}
