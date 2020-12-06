/************************************************
* Programm Sieb des Eratosthenes               	*
*                                               *
* Autor: Kevin Bischof							*
* Datum: 13.12.2016								*
************************************************/

public class Aufgabe29 {

	public static void main(String[] args){
		/*Deklarieren der Variablen*/	
		boolean[] stellen = new boolean[1000];
		/*Initialisieren des ersten Arrays mit Null,
		* die restlichen Zahlen sind nicht initialisiert
		* und daher automatisch Null.*/
		int i=0, j=0;
		/*Setzen der Vielfachen einer Zahl auf false*/
		for(i=2;i<1000;i++) {
			/*Pruefen, ob Array-Stelle false ist*/
			if(!stellen[i-2]) {
				/*Falls nicht, alle Vielfachen
				* der Zahl auf false setzen*/
				for(j=2*i;j<1000;j+=i) {
					stellen[j-2] = true;
				}
			}
		}
		/*Ermittlung der Anzahl von Primzahlen*/
		int primzahlen[] = new int[168];
		int anzahl = 0;
		for(i=2; i<1000;i++) {
			if(!stellen[i-2]) {
				primzahlen[anzahl] = i;
				anzahl++;
			}
		}
		/*Ausgabe der Primzahlen*/
		for(i=0;i<anzahl;i++) {
			System.out.printf("%d", primzahlen[i]);
			if(i<anzahl-1) {
				System.out.printf(", ");
			}
		}
		System.out.printf("\n");
		/*Programmende*/
	}

}
