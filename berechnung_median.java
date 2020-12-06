/************************************************
* Programm Median                         		*
*                                               *
* Autor: Kevin Bischof							*
* Datum: 12.12.2016								*
************************************************/

//for gegen for each austauschen

import java.util.Scanner;

public class Aufgabe28 {

//Funktion Bubblesort definieren
	public static void bubbleSort (int array[], int n) {
		/*Erste for-Schleife. Wiederholt solange die inner Schleife,
		 * bis die laenge des Arrays erreicht ist. Bis dahin sollten
		 * alle Elemente des Arrays sortiert sein.
		 */
		for(int j = 0; j < n; j++) {
			/*Zweite for-Schleife. Durchlaeuft einmal die Schleife 
			 * und tauscht zwei benachbarte Werte.
			 */
			for(int i = 0; i < n-1 ;i++) {
				/*Abfrage, ob der i. Wert groesser ist
				 * als der benachbarte Wert. Falls ja,
				 * werden die beiden Werte getauscht. 
				 */
				if(array[i] > array[i+1]) {
					//...teile der Variablen b das i. Array zu 
					int b = array[i];
					//Nun ueberschreibe das i. Array mit dem naechsten Array
					array[i] = array[i+1];
					/*Zuletzt weise dem naechsten Array den Wert des i. Arrays
					 * mit Hilfe der Variablen b zu.
					 */
					array[i+1] = b;
			}
		}
	}
}

//Definieren des Scanners
private static Scanner in;	

//Beginn Hauptmethode
public static void main(String[] args) {
	//Deklarierung von Variablen, Array und Scanner
	in = new Scanner(System.in);
	int i = 0, stelle1 = 0, stelle2 = 0;
	float median = 0;
	int[] array = new int [6];

	//Programmtitel
	System.out.println("\nProgramm Median");
	
	//Initialisieren des Arrays
	for(i=0;i<array.length;i++){
		array[i] = 0;
	}
	
	//for-Schleife fuer die Abfrage der Werte
	for (i=0; i < array.length; i++) {
		System.out.printf("Bitte geben Sie den %d. Wert ein: ", i+1);
		array[i] = in.nextInt();
	}

	//Ausgabe der unsortierten Reihenfolge
	System.out.printf("\nUnsortierte Zahlenfolge:\n");
	for(i=0; i < array.length; i++) {
		System.out.printf("%d", array[i]);
		if(i < array.length-1) {
			System.out.printf(", ");
		}
	}
	
	System.out.printf("\nSortierte Zahlenfolge:\n");
	
	//Sortieren der Zahlen durch bubbleSort Funktion
	bubbleSort(array, array.length);
	
	//Ausgabe der sortierten Reihenfolge
	for(i=0; i < array.length; i++) {
		System.out.printf("%d", array[i]);
		if(i < array.length-1) {
			System.out.printf(", ");
		}
	}

	// Berechnung des Medians. a % b liefert den Restwert
		stelle1 = (array.length / 2) - 1;
		stelle2 = (array.length / 2);
		median = (float)(array[stelle1] + (float)array[stelle2]) / 2;
		System.out.printf("\nDer Median der eingegebenen Zahlenfolge lautet: %.2f\n", median);
	}
}
