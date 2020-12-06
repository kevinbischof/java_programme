/************************************************
* Programm zum Einlesen in ein Array           	*
*                                               *
* Autor: Kevin Bischof							*
* Datum: 08.01.2017								*
************************************************/

import java.util.Scanner;

public class Aufgabe27 {
	static Scanner in;
	public static void main(String[] args){
	in = new Scanner(System.in);
	System.out.println("Programm Array Ein- und Ausgabe");
	System.out.println("Wie viele Werte sollen eingelesen werden?");
	int anzahl = in.nextInt();
	int zahlen[] =new int[anzahl];
	
	//Realisierung der Eingaben als for-each Schleife
	int i = 0;
	for (int element : zahlen) {
		System.out.print("Bitte geben Sie den " + (i+1) + ". Wert ein: ");
		zahlen[i] = in.nextInt();
		i++;
	}
	/*Diese Art der Eingabe ist m.E. unsinnig und besser als for Schleife
	 * realisierbar.
	 */
	
	System.out.print("Sie haben folgende Werte eingegeben: ");

	for (int element : zahlen) {
		System.out.print(element+", ");
	}
	}
}
