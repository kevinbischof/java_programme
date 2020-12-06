/************************************************
* Berechnung von Jahrespraemien abhaenging      *
* vom Dienstalter.                              *
* Autor: Kevin Bischof					        *
* Datum: 10.11.2016					            *  
************************************************/

import java.util.Scanner;

//Definieren der Klasse
public class Aufgabe16 {
	//Definieren des Scanners
	static Scanner in;
	//Beginn Hauptmethode
	public static void main(String[] args) {
		//Erstellen des Scanners in
		in = new Scanner(System.in);
		

//Deklarieren der Variablen
		int alter = 0, dienstalter = 0, praemie = 0; //Wichtig: Variablen zunaechst initialisieren (einen Wert zuweisen)
		//Programmtitel
		System.out.printf("\nProgramm zur Berechnung von Jahrespraemien\n\n");
		//Aufforderung zur Eingabe der Zahlen
		System.out.printf("Alter des Angestellten: \n");
		alter = in.nextInt();
		System.out.printf("Dienstalter in ganzen Jahren: \n");
		dienstalter = in.nextInt();
		//Berechnung der Praemie
		if (dienstalter == 0) {
			praemie = 0;
		}else {
			if(dienstalter >= 1 && dienstalter <6) {
				praemie = 600;
			}else {
				if(dienstalter >= 6 && alter < 50) {
					praemie = 250 + (75 * dienstalter);
			}else {
				if(dienstalter >= 6 && alter >= 50) {
					praemie = 500 + (75 * dienstalter);
					}
				}
			}
		}
		//Ausgabe der Praemie
		System.out.printf("Praemie: %d EUR\n", praemie);
		//Programmende
	}
}
