/************************************************
* Einlesen von zwei Integer-Zahlen und          *
* Berechnung deren Summe, Differenz, Produkt	*
* und Quotienten.                               *
* Autor: Kevin Bischof					        *
* Datum: 10.11.2016					            *
************************************************/

import java.util.Scanner;

//Definieren der Klasse
public class Aufgabe14a {
	//Definieren des Scanners
	static Scanner in;
	//Beginn Hauptmethode
	public static void main(String[] args) {
		//Erstellen des Scanners in
		in = new Scanner(System.in);
		//Deklarieren der Variablen
		int a, b, summe, differenz, produkt, quotient;
		//Programmtitel
		System.out.printf("\nProgramm zur Berechnung der Summe, Differenz, Produkt und Quotient zweier Zahlen\n\n");
		//Aufforderung zur Eingabe der Zahlen
		System.out.printf("Bitte geben Sie zwei ganze Zahlen ein:\nErste Zahl:\n");
		a = in.nextInt();
		System.out.printf("Zweite Zahl: \n");
		b = in.nextInt();
		//Ausgabe der eingegebenen Zahlen
		System.out.printf("\nDie erste Zahl lautet: %d\nDie zweite Zahl lautet: %d\n",a,b);
		//Berechnungen
		summe = a + b;
		differenz = a - b;
		produkt = a * b;
		quotient = a / b;
		//Ausgabe der Ergebnisse
		System.out.printf("Die Summe der Zahlen lautet: %d\n", summe);
		System.out.printf("Die Differenz der Zahlen lautet: %d\n", differenz);
		System.out.printf("Das Produkt der Zahlen lautet: %d\n", produkt);
		System.out.printf("Der Quotient der Zahlen lautet: %d\n\n", quotient);
		//Programmende
	}
}
