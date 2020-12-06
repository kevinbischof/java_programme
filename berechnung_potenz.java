/************************************************
* Programm zur Berechnung der Potenz           	*
*                                               *
* Autor: Kevin Bischof							*
* Datum: 08.01.2017								*
************************************************/
import java.util.Scanner;
import static java.lang.Math.*;

public class Aufgabe46
{
	static Scanner in;
	public void main(String[] args)
	{
		in = new Scanner(System.in);
		System.out.printf("\nProgramm zur Berechnung der Potenz\n");
		System.out.printf("Bitte geben Sie x ein: ");
		int x = in.nextInt(); 
		System.out.printf("Bitte geben Sie y ein: ");
		int y = in.nextInt(); 
		double ergebnis = pow(x,y);
		System.out.printf("Die Potenz von %d hoch %d ist: %d",x,y,ergebnis);
	}
}
