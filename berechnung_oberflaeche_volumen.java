/************************************************
* Berechnung der Oberflaeche und des Volumens   *
* einer Kugel.                                  *
* Autor: Kevin Bischof					        *
* Datum: 10.11.2016					            *
************************************************/

import java.util.Scanner;

//Definieren der Klasse
public class Aufgabe13 {
	//Definieren des Scanners
	static Scanner in;
	//Beginn Hauptmethode
	public static void main(String[] args) {
		//Erstellen des Scanners in
		in = new Scanner(System.in);
		//Definieren der Variablen
		double radius, volumen, oberflaeche, pi = 3.141592654;
		//Programmtitel
		System.out.printf("\nProgramm Kugelberechnung\n\n");
		//Aufforderung zur Eingabe des Radius
		System.out.printf("Bitte geben Sie den Radius der Kugel in cm ein: ");
		//Einlesen des Radius
		radius = in.nextDouble();
		//Berechnung Volumen und Oberflaeche
		volumen = (4 * pi * (radius*radius*radius))/3;
		oberflaeche = 4 * pi * (radius*radius);
		//Ausgabe Volumen und Oberflaeche
		System.out.printf("\nDas Volumen der Kugel betraegt %07.2f cmÂ³\n", volumen);
		System.out.printf("Die Oberflaeche der Kugel betraegt %07.2f cm2\n\n", oberflaeche);
		//Programmende
	}
}
