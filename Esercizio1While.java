import java.util.Scanner;

public class Esercizio1While {

    public static void main(String[] args) {

        // creazione scanner e dichiarazione variabili
        Scanner scan_Num = new Scanner(System.in);
        int numero = 0;
        int numero2 = 0;
        int tot = 0;

        boolean controllo = true;

        // acquisisco input dall'utente
        System.out.println("Inserisci un numero intero positivo o un numero negativo per terminare: ");
        numero = scan_Num.nextInt();

        // verifica del numero inserito MAGGIORE o MINORE di 0
        if (numero < 0) {

            System.out.println("Il numero inserito è negativo, la somma totale è pari a 0");

        } else {

            // ciclo per la somma dei numeri inseriti dall'utente
            // condizione di uscita = numero negativo
            while (controllo) {

                System.out.println("Inserisci il numero da sommare a quello precedente:");
                numero2 = scan_Num.nextInt();

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

        scan_Num.close();
    }
}
