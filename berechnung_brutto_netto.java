/************************************************
* Einlesen eines Nettobetrages, Berechnung der 	*
* MWSt, des Bruttobetrages mit 2 Nachkommast.	*
* Autor: Kevin Bischof					        *
* Datum: 10.11.2016					            *
************************************************/

import java.util.Scanner;

//Definieren der Klasse
public class Aufgabe10 {
	//Definieren des Scanners
	static Scanner in;
	//Beginn Hauptmethode
	public static void main(String[] args) {
		//Erstellen des Scanners in
		in = new Scanner(System.in);
		//Programmtitel
		System.out.println("\nProgramm zur Berechnung eines Bruttobetrages\n");
		//Aufforderung zur Eingabe des Nettobetrages
		System.out.println("Bitte geben Sie einen Nettobetrag in EUR ein: ");
		//Einlesen der Benutzereingabe
		double netto = in.nextDouble();
		System.out.printf("Nettobetrag	    =	%08.2f EUR\n", netto);
		//Berechnung der MWSt
		double mwst = netto * 0.19;
		//Ausgabe der MWSt
		System.out.printf("MWSt-Satz 19.00 %%   =	%08.2f EUR \n", mwst);
		//Berechnung des Bruttobetrages
		double brutto = netto * 1.19;
		//Ausgabe des Bruttobetrages
		System.out.printf("Bruttobetrag	    =	%08.2f EUR \n", brutto);
		//Programmende
	}
}
