import java.util.Random;
import java.util.Scanner;

public class Esercizio3While {
    public static void main(String[] args) {

        // creazione oggetti scanner e random
        Scanner scan_Num = new Scanner(System.in);
        Random rand = new Random();

        // dichiarazione variabili
        int numero = 0;
        int numero_casuale = rand.nextInt(100) + 1; // generazione numero da 1 a 100
        int tentativi = 1;

        System.out.println("Il PC ha generato un numero casuale tra 1 e 100."
                + "\nProva a indovinarlo!");

        boolean controllo = true;

        while (controllo) {

            // acquisizione dati input
            System.out.println("\nTentativo numero " + tentativi + ":");
            numero = scan_Num.nextInt();

            // incremento il numero dei tentativi
            tentativi++;

            // verifica del numero inserito
            if (numero < numero_casuale) {
                System.out.println("Troppo basso.");
            } else if (numero > numero_casuale) {
                System.out.println("Troppo alto.");
            } else {
                System.out.println("Il numero inserito corrisponde al numero casuale!");
                break;
            }
        }

        scan_Num.close();
    }
}
