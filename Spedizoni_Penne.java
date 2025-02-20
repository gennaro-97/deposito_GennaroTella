import java.util.ArrayList;
import java.util.Scanner;

public class Spedizoni_Penne {

    // Dichiarazione degli ArrayList per ogni colore
    static ArrayList<Integer> rosso = new ArrayList<>();
    static ArrayList<Integer> blu = new ArrayList<>();
    static ArrayList<Integer> verde = new ArrayList<>();
    static ArrayList<Integer> nero = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scan_NUM = new Scanner(System.in);
        int scelta;

        do {
            // Menu principale
            System.out.println("\n--- Gestione Spedizioni di Penne ---");
            System.out.println("1. Aggiungi una spedizione");
            System.out.println("2. Visualizza tutte le spedizioni");
            System.out.println("3. Cerca quantità di un colore");
            System.out.println("4. Esci");
            System.out.print("Scegli un'opzione: ");
            scelta = scan_NUM.nextInt();

            switch (scelta) {
                case 1:
                    aggiungiSpedizione(scan_NUM);
                    break;
                case 2:
                    visualizzaSpedizioni();
                    break;
                case 3:
                    cercaColore(scan_NUM);
                    break;
                case 4:
                    System.out.println("Uscita dal programma.");
                    break;
                default:
                    System.out.println("Opzione non valida! Riprova.");
            }

        } while (scelta != 4);

        scan_NUM.close();
    }

    public static void aggiungiSpedizione(Scanner scanner) {

        System.out.println("\nAggiungi una nuova spedizione:");

        System.out.print("Quantità di penne Rosso: ");
        rosso.add(scanner.nextInt());

        System.out.print("Quantità di penne Blu: ");
        blu.add(scanner.nextInt());

        System.out.print("Quantità di penne Verde: ");
        verde.add(scanner.nextInt());

        System.out.print("Quantità di penne Nero: ");
        nero.add(scanner.nextInt());

        System.out.println("Spedizione aggiunta con successo!");

    }

    public static void visualizzaSpedizioni() {

        System.out.println("\n--- Elenco delle Spedizioni ---");
        if (rosso.isEmpty()) {
            System.out.println("Nessuna spedizione registrata.");
            return;
        }

        for (int i = 0; i < rosso.size(); i++) {
            System.out.println("Spedizione " + (i + 1) + ":");
            System.out.println(" - Rosso: " + rosso.get(i));
            System.out.println(" - Blu: " + blu.get(i));
            System.out.println(" - Verde: " + verde.get(i));
            System.out.println(" - Nero: " + nero.get(i));
            System.out.println("----------------------");
        }
        

    }

    public static void cercaColore(Scanner scanner) {

    }
}
