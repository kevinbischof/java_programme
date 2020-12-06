/************************************************
* Berechnung der Sekunden im Monat November 2016*
*                                               *
* Autor: Kevin Bischof					        *
* Datum: 14.11.2016					            *
************************************************/

//Definieren der Klasse
public class Aufgabe11 {
	public static void main(String[] args) {
		//Berechnung der Sekunden
		int tage_nov_2016 = 30;
		int sek_nov_2016 = tage_nov_2016 * 24 * 3600;
		//Ausgabe der Sekunden
		System.out.printf("Der Monat November 2016 hat %d Sekunden\n",sek_nov_2016);
		//Programmende
	}
}
