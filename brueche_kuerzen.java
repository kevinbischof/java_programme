/************************************************
* Programm zum Kuerzen von Bruechen           	*
*                                               *
* Autor: Kevin Bischof							*
* Datum: 08.01.2017								*
************************************************/
import java.util.Scanner;

public class Aufgabe47
{
	static Scanner in;
	public static unsigned int ggt(unsigned int a, unsigned int b) {
		while(b!=0) {
			int rest = a % b;
			a = b;
			b = rest;
		}
		return a;
	}

int main() {
	return 0;
}
	

	public static void main(String[] args)
	{
		in = new Scanner(System.in);
		System.out.printf("\nProgramm zum Kuerzen von Bruechen\n\n");
		System.out.printf("Bitte geben Sie den Zaehler ein: ");
		unsigned int zaehler = in.nextInt();
		System.out.printf("Bitte geben Sie den Nenner ein: ");
		unsigned int nenner = in.nextInt();
		int teiler = ggt(zaehler, nenner);
		System.out.printf("\nDer groesste gemeinsame Teiler ist: %d\n",teiler);
		int zaehlerKurz = zaehler / teiler;
		int nennerKurz = nenner / teiler;
		System.out.printf("\nDer gekuerzte Bruch heisst: %d/%d\n",zaehlerKurz,nennerKurz);	
	}
}


