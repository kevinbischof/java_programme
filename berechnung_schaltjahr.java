/************************************************
* Programm Berechnung Schaltjahr               	*
*                                               *
* Autor: Kevin Bischof							*
* Datum: 13.12.2016								*
************************************************/
import java.util.Scanner;

public class Aufgabe30 {
	private static Scanner in;
	public static void main(String[] args) {
		in = new Scanner(System.in);
		System.out.println("Programm Schaltjahr\n");
		System.out.printf("Bitte geben Sie eine Jahreszahl ein: ");
		int jahr = in.nextInt(); 
		if(jahr % 4 == 0 && !(jahr % 100 == 0)) {
			System.out.printf("%d ist ein Schaltjahr!",jahr);
		}else{
			if(jahr % 100 == 0 && !(jahr % 400 == 0)){
				System.out.printf("%d ist kein Schaltjahr!",jahr);
			}else{
				if(jahr % 400 == 0){
					System.out.printf("%d ist ein Schaltjahr",jahr);
				}else{
					System.out.printf("%d ist kein Schaltjahr",jahr);
				}
			}
		}
		System.out.println();
	}
}
