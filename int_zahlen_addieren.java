
/************************************************
 * Programm Integer Zahlen addieren 			*
 * 												*
 * Autor: Kevin Bischof 						*
 * Datum: 13.12.2016 							*
 ************************************************/
import java.util.Scanner;

public class Aufgabe33 {
	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);

		// Programmtitel
		System.out.println("\nProgramm Bereichsueberschreitungen\n");
		System.out.println("Geben Sie bitte zwei Integerzahlen ein: x, y\n");

		// Eingabe des Benutzers speichern
		int x = in.nextInt();
		int y = in.nextInt();

		// Berechnung
		int summe = x + y;

		// Ausgabe des Ergebnisses
		System.out.printf("Die Summe von x=%d und y=%d ist: %d\n", x, y, summe);

		/*
		 * Bei der Addition von zwei sehr grossen Zahlen, kann kein korrektes
		 * Ergebnis ausgegeben werden. Das liegt daran, dass der Zahlenbereich
		 * von int beschraenkt ist. Groessere Berechnungen koennen mit dem
		 * Datentyp float oder long durchgefuehrt werden.
		 */
		// Programmende
	}
}
