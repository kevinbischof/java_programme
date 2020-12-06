/************************************************
* Programm zum Einlesen in ein Array           	*
*                                               *
* Autor: Kevin Bischof							*
* Datum: 08.01.2017								*
************************************************/
import java.util.Scanner;

public class Aufgabe45
{
	static Scanner in;
	public int arrayEinlesen(int zahlen[], int groesse)
	{
	/* Arrays einlesen */
	int i = 0;	
	int tmp = 1;
	System.out.printf("Geben Sie ganze Zahlen ein. Die Eingabe wird durch die Eingabe einer Null beendet.\n");

		for(i=0;i<groesse;i++)
		{
			System.out.printf("Bitte ganze Zahl eingeben: ");
			&tmp = in.nextInt();
			
			if(tmp == 0) 
			{
				System.out.printf("\nEinlesen beendet.\n");
				break;			
			}else{
				zahlen[i] = tmp;
			}
		}
	return i;
	}

	public int mittelwert(int zahlen[], int groesse)
	{
		/* Mittelwert berechnen */
		int i = 0, summe = 0;
		float mittelwert = 0;
			for(i=0;i<groesse;i++)
			{
				summe += zahlen[i];
			}
		mittelwert = (float)summe / (float) groesse;
		System.out.printf("\nMittelwert: %0.2f", mittelwert);
	}

	public int groessteZahl(int zahlen[], int groesse)
	{
		int max = zahlen[0];
		int i = 0;
		for(i = 1; i<groesse;i++)
		{
			if(zahlen[i] > max)
			{
				max = zahlen[i];
			}
		}
		System.out.printf("\nGroesste Zahl: %d", max);
		return max;
	}

	public int kleinsteZahl(int zahlen[], int groesse)
	{
		int min = zahlen[0];
		int i = 0;
		for(i = 1; i<groesse;i++)
		{
			if(zahlen[i] < min)
			{
				min = zahlen[i];
			}
		}
		System.out.printf("\nKleinste Zahl: %d", min);	
		return min;
	}

	public int zweitkleinsteZahl(int zahlen[], int groesse, int max, int min)
	{
		int zweitMin = max;
		int i = 0;
		for(i = 1; i<groesse;i++)
		{
			if((zahlen[i] < zweitMin) && zahlen[i] != min)
			{
				zweitMin = zahlen[i];
			}
		}
		System.out.printf("\nZweitkleinste Zahl: %d", zweitMin);
	}

	public int zahlenUmgekehrtAbsolut(int zahlen[], int groesse)
	{
		/* Wenn Zahl negativ ist, den Absolutbetrag mit der Funktion abs() erstellen */
		int i = 0;
		for(i = 0;i<groesse;i++)
		{
			if(zahlen[i] < 0)
			{
				zahlen[i] = abs(zahlen[i]);
			}
		}
		System.out.printf("\nZahlen im Absolutbetrag: ");
		for(i=0;i<groesse;i++)
		{
			System.out.printf("%d, ", zahlen[i]);
		}
	
		/* Arraywerte in umgekehrter Reihenfolge in ein neues Array kopieren */
		int zahlenUmgekehrt[groesse];
		for(i=0;i<groesse;i++)
		{
			zahlenUmgekehrt[i] = zahlen[groesse-1-i];
		}
		System.out.printf("\nZahlen im Absolutbetrag umgekehrt: ");
		for(i=0;i<groesse;i++)
		{
			System.out.printf("%d, ", zahlenUmgekehrt[i]);
		}
	}

	public static void main(String[] args)
	{
	        in = new Scanner(System.in);
		int i = 0;
		const int groesse = 1000;
		int max, min = 0;
		int zahlen[groesse];
		System.out.printf("\nProgramm Arrays\n\n");

		int neueGroesse = arrayEinlesen(zahlen, groesse);
		mittelwert(zahlen, neueGroesse);
		max = groessteZahl(zahlen, neueGroesse);
		min = kleinsteZahl(zahlen, neueGroesse);
		zweitkleinsteZahl(zahlen, neueGroesse, max, min);
		zahlenUmgekehrtAbsolut(zahlen, neueGroesse);
		System.out.printf("\n");
	}
}