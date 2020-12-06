/************************************************
* Programm Matrix fuellen               		*
*                                               *
* Autor: Kevin Bischof							*
* Datum: 13.12.2016								*
************************************************/
import java.util.Scanner;

public class Aufgabe31 {
	private static Scanner in;
	public static void main(String[] args){
		in = new Scanner(System.in);
		//Deklarieren der Variablen
		int[][] matrix = new int[5][5];
		int i=0,j=0,eingabe=0;
		//Programmtitel
		System.out.printf("\nProgramm 5 * 5 Matrix\n");
		System.out.printf("\nBitte waehlen Sie:\n");
		System.out.printf("Option 1: Fuelle die erste Zeile und letzte Spalte mit Einsen\n");
		System.out.printf("Option 2: Fuelle die beiden Diagonalen der Matrix mit Einsen\n");
		System.out.printf("Bitte 1 oder 2 eingeben: ");
		//Einlesen der Benutzereingabe
		eingabe = in.nextInt();
		//Pruefen, ob Eingabe korrekt war
		while(eingabe != 1 && eingabe != 2){
			System.out.printf("Fehler. Bitte geben Sie 1 oder 2 ein:");
		eingabe = in.nextInt();
		}
		System.out.println();
		//Matrix fuer Option 1 fuellen
		if(eingabe == 1){
			for(j = 0; j < 5;j++){
				matrix[0][j]=1;
			}
			for(i = 1; i < 5;i++){
				matrix[i][4]=1;
			}
		//Matrix fuer Option 2 fuellen
		}else{
			for(i=1;i<=5;i++){
				matrix[i-1][i-1]=1;
				matrix[i-1][5-i]=1;
			}
		}
		//Ausgabe der Matrix
		for(i=0;i<5;i++){
			for(j=0;j<5;j++){
				System.out.printf("%4d",matrix[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		//Programmende
	}
}
