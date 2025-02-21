import java.util.ArrayList;
import java.util.Scanner;

public class EsercizioVilla {

    static ArrayList<String> ville = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scan_NUM = new Scanner(System.in);
        menu(scan_NUM);

    }

    public static void menu(Scanner scan_NUMScanner) {

        int scelta = 0;

        do {
            // Menu principale
            System.out.println("\n--- Gestione Ville ---");
            System.out.println("1. Aggiungi Villa");
            System.out.println("2. Visualizza elenco ville");
            System.out.println("3. Ricerca Villa per nome");
            System.out.println("0. Esci");
            System.out.print("Scegli un'opzione: ");
            scelta = scan_NUMScanner.nextInt();

            switch (scelta) {
                case 1:
                    aggiungiVilla();
                    break;
                case 2:
                    visualizzaVille();
                    break;
                case 3:
                    cercaVilla(scan_NUMScanner);
                    break;
                case 0:
                    System.out.println("Uscita dal programma.");
                    break;
                default:
                    System.out.println("Opzione non valida! Riprova.");
            }

        } while (scelta != 0);
    }

    public static void aggiungiVilla() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il nome della villa: ");
        String nome = scanner.nextLine();
        ville.add(nome.toLowerCase().trim());

        int numero;
        do {
            System.out.print("Da quante stanze è composta? ");
            while (!scanner.hasNextInt()) {
                System.out.println("Errore! Devi inserire un numero intero positivo.");
                scanner.next(); // Scarta input errato
            }
            numero = scanner.nextInt();
            scanner.nextLine(); // Pulire il buffer
        } while (numero < 0);

        ville.add(Integer.toString(numero));

        String piscina;
        do {
            System.out.print("Ha la piscina? (si/no): ");
            piscina = scanner.nextLine().trim().toLowerCase();

            if (!piscina.equals("si") && !piscina.equals("no")) {
                System.out.println("Errore! Devi rispondere con 'si' o 'no'.");
            }

        } while (!piscina.equals("si") && !piscina.equals("no"));

        ville.add(String.valueOf(piscina));
        System.out.println("Villa aggiunta correttamente!\n");
    }

    public static void cercaVilla(Scanner scan_NUMScanner) {

        System.out.print("Inserisci il nome della villa da cercare: ");
        String nomeCercato = scan_NUMScanner.nextLine().toLowerCase().trim();  // Convertiamo a minuscolo per una ricerca case-insensitive
    
        boolean trovata = false;  // Variabile per verificare se la villa è stata trovata
    
        for (int i = 0; i < ville.size(); i += 3) {  // Ogni villa ha 3 informazioni: nome, stanze, piscina
            String nome = ville.get(i);
            String stanze = ville.get(i + 1);
            String piscina = ville.get(i + 2);
    
            // Controlliamo se il nome della villa corrisponde a quello cercato
            if (nome.equals(nomeCercato)) {
                System.out.println("\n--- Villa trovata ---");
                System.out.println("Villa: " + nome);
                System.out.println("Stanze: " + stanze);
                System.out.println("Piscina: " + (piscina.equals("si") ? "Sì" : "No"));
                trovata = true;
                break;  // Esci dal ciclo quando la villa è trovata
            }
        }
    
        if (!trovata) {
            System.out.println("Villa non trovata con il nome: " + nomeCercato);
        }

    }

    public static void visualizzaVille() {

        if (ville.isEmpty()) {
            System.out.println("Nessuna villa presente.");
            return;
        }
    
        System.out.println("\n--- Elenco delle Ville ---");
        for (int i = 0; i < ville.size(); i += 3) {  // Ogni villa ha 3 elementi: nome, stanze, piscina
            String nome = ville.get(i);
            String stanze = ville.get(i + 1);
            String piscina = ville.get(i + 2);
    
            System.out.println("Villa: " + nome);
            System.out.println("Stanze: " + stanze);
            System.out.println("Piscina: " + (piscina.equals("si") ? "SI" : "NO"));
            System.out.println("--------------------------");
        }

    }
}
