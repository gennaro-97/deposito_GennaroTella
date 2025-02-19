import java.util.Scanner;

public class Esercizio2While {
    public static void main(String[] args) {

        // creazione scanner e dichiarazione variabili
        Scanner scan_Num = new Scanner(System.in);
        int numero = 0;
        int controllo = 0;

        // acquisizione dati input utente
        System.out.println("Scegli un numero intero:");
        numero = scan_Num.nextInt();

        System.out.println("Tabellina da 1 a 10:");

        // ciclo per il calcolo della tabellina
        while (controllo <= 9) {
            controllo++;
            System.out.print(numero * controllo + " ");
        }

        scan_Num.close();
    }
}
