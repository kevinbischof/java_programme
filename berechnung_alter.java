/************************************************
* Programm zur Berechnung des Alters            *
* einer Person                                  *
* Autor: Kevin Bischof                          *
* Datum: 08.01.2017		                        *
************************************************/

import java.util.Scanner;

public class Aufgabe45
    {
    static Scanner in;
    
    public static int geburtsjahr() {
        in = new Scanner(System.in);
        int gebJahr;
        gebJahr = in.nextInt();
        return gebJahr;
    }
    
    public static int alterBerechnung(int gebJahr) {
        int aktuellesJahr = 2016;
        int alter = aktuellesJahr - gebJahr;
        return alter;
    }

    public static void ausgabeAlter(int alter) {
        System.out.printf("Sie sind heute %d Jahre alt.",alter);
    }
    
    public static void main(String[] args)
    {
        in = new Scanner(System.in);
        System.out.printf("\nProgramm zur Berechnung des Alters einer Person\n");
        System.out.printf("\nBitte geben Sie Ihr Geburtsjahr ein: ");
        int gebJahr = geburtsjahr();
        int alter = alterBerechnung(gebJahr);
        ausgabeAlter(alter);
    }
    
}