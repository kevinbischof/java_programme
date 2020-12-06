/************************************************
* Simulation eines einfachen Taschenrechners   	*
*                                               *
* Autor: Kevin Bischof					        *
* Datum: 14.11.2016					            *
************************************************/

import java.util.Scanner;

//Definieren der Klasse
public class Aufgabe17 {
	//Definieren des Scanners
	private static Scanner in;
	//Beginn Hauptmethode
	public static void main(String[] args) {
		//Erstellen des Scanners in
		in = new Scanner(System.in);
		//Deklarieren der Variablen
		int operator_check;
		float operand1, operand2, ergebnis;
		String operator = "0";
		String op1 = new String("+");
		String op2 = new String("-");
		String op3 = new String("*");	
		String op4 = new String("/");
		//Programmtitel
		System.out.printf("\nEinfacher Taschenrechner\n\n");
		System.out.printf("Geben Sie den gewuenschten Operator ein (+,-,*,/): \n");
		/*operator_check ist ein Hilfsoperator
		 * Einlesen der Benutzereingabe
		 * Ueberpruefung, ob ein korrekter Operator eingegeben wurde
		 * Ggf. wiederholte Aufforderung zur Eingabe eines Operators*/
		operator_check=1;
		while(operator_check==1){
		operator = in.next();
			if(operator.equals(op1) || operator.equals(op2) || operator.equals(op3) || operator.equals(op4)) {
			operator_check = 0;
		}else{
			operator_check = 1;
			System.out.printf("Fehler. Bitte einen korrekten Operator eingeben:\n");	
		}	
		}
		//Aufforderung zur Eingabe der beiden Operanden
		System.out.printf("Geben Sie die beiden Operanden ein.\n");
		System.out.printf("Operand 1: \n");
		operand1 = in.nextFloat();
		System.out.printf("Operand 2: \n");
		operand2 = in.nextFloat();
		//Ausgabe der eingegebenen Operanden
		System.out.printf("Operand 1: %.2f, Operand 2: %.2f\n", operand1, operand2);		
		/*Berechnung der Operanden mit dem eingegebenen Operator
		 * Bei Division durch Null wird das Programm direkt beendet.
		 * Das Ergebnis wird direkt ausgegeben*/
		switch(operator) {
			case "+":
				ergebnis = operand1 + operand2; System.out.printf("Ergebnis: %.2f\n", ergebnis); break;
			case "-":
				ergebnis = operand1 - operand2; System.out.printf("Ergebnis: %.2f\n", ergebnis); break;
			case "*":
				ergebnis = operand1 * operand2; System.out.printf("Ergebnis: %.2f\n", ergebnis); break;
			case "/":
				if(operand2 == 0) {
					System.out.printf("Eine Division durch Null ist nicht erlaubt!\n");
				}else{ 
					ergebnis = operand1 / operand2; System.out.printf("Ergebnis: %.2f\n", ergebnis); break;
				}
			}
	//Programmende
	}
}
