/************************************************
* Berechnung von Rechtecken                    	*
*                                               *
* Autor: Kevin Bischof					        *
* Datum: 10.11.2016					            *
************************************************/

import java.util.Scanner;

//Definieren der Klasse
public class Aufgabe12 {	
	//Definieren des Scanners
	static Scanner in;
	//Beginn Hauptmethode
	public static void main(String[] args) {
		//Erstellen des Scanners in
		in = new Scanner(System.in);
		//Programmtitel
		System.out.printf("Programm zur Berechnung des Umfanges und der Flaeche von Rechtecken\n\n");
		//Aufforderung zur Eingabe der Seitenlaengen und Einlesen der Seitenlaengen
		System.out.printf("Bitte geben Sie die Seite a in cm ein: ");
		double seite_a = in.nextDouble();
		System.out.printf("Bitte geben Sie die Seite b in cm ein: ");
		double seite_b = in.nextDouble();
		//Ausgabe der Benutzereingaben
		System.out.printf("\n\nDie Seite a ist %08.2f cm lang.\n", seite_a);
		System.out.printf("Die Seite b ist %08.2f cm lang.\n", seite_b);
		//Berechnung Umfang und Flaeche
		double umfang = (seite_a * 2) + (seite_b *2);
		double flaeche = seite_a * seite_b;
		//Ausgabe der Ergebnisse
		System.out.printf("Der Umfang des Rechtecks betraegt %08.2f cm.\n",umfang);
		System.out.printf("Die Flaeche des Rechtecks betraegt %08.2f cmÂ².\n\n",flaeche);
		//Programmende
	}
}
