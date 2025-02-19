
import java.util.Random;
import java.util.Scanner;

public class EsercizioMenuWhile {

    public static void main(String[] args) {

        // dichiarazione delle variabili
        Scanner scanner = new Scanner(System.in);
        Scanner scannerString = new Scanner(System.in);
        int esercizio;
        boolean ciclo = true;

        // Inizio del ciclo, dove 0 è la condizione di uscita
        while (ciclo) {
            System.out.println("\nMenu principale:"
                    + "\n1 - per eseguire il primo esercizio"
                    + "\n2 - per eseguire il secondo esercizio"
                    + "\n3 - per eseguire il terzo esercizio"
                    + "\n0 - per chiudere il programma");
            esercizio = scanner.nextInt();

            switch (esercizio) {
                case 1:
                    primoEsercizio(scanner);
                    break;
                case 2:
                    secondoEsercizio(scanner);
                    break;
                case 3:
                    terzoEsercizio(scannerString);
                    break;
                case 0:
                    ciclo = false;
                    System.out.println("Chiusura del programma...");
                    break;
                default:
                    System.out.println("Opzione non valida, riprova.");
                    break;
            }
        }

        scanner.close();
        scannerString.close();

    }

    public static void primoEsercizio(Scanner scanner) {
        // creazione scanner e dichiarazione variabili
        int numero = 0;
        int numero2 = 0;
        int tot = 0;

        boolean controllo = true;

        // acquisisco input dall'utente
        System.out.println("Inserisci un numero intero positivo o un numero negativo per terminare: ");
        numero = scanner.nextInt();

        // verifica del numero inserito MAGGIORE o MINORE di 0
        if (numero < 0) {

            System.out.println("Il numero inserito è negativo, la somma totale è pari a 0");

        } else {

            // ciclo per la somma dei numeri inseriti dall'utente
            // condizione di uscita = numero negativo
            while (controllo) {

                System.out.println("Inserisci il numero da sommare a quello precedente:");
                numero2 = scanner.nextInt();

                if (numero2 < 0) {
                    System.out.println("Sei uscito dal ciclo");
                    break;
                } else {
                    // somma dei numeri inseriti dall'utente al totale
                    tot += numero2;
                }
            }

            // somma del totale calcolato nel ciclo con il primo numero inserito dall'utente
            tot += numero;

            System.out.println("La somma dei numeri inseriti è: " + tot);

        }

    }

    public static void secondoEsercizio(Scanner scanner) {

        // creazione scanner e dichiarazione variabili
        int numero = 0;
        int controllo = 0;

        // acquisizione dati input utente
        System.out.println("Scegli un numero intero:");
        numero = scanner.nextInt();

        System.out.println("Tabellina da 1 a 10:");

        // ciclo per il calcolo della tabellina
        while (controllo <= 9) {
            controllo++;
            System.out.print(numero * controllo + " ");
        }
    }

    public static void terzoEsercizio(Scanner scanner) {

        // creazione oggetti scanner e random
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
            numero = scanner.nextInt();

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
    }
}
