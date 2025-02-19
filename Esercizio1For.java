import java.util.Scanner;

public class Esercizio1For {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);

        String nome = "";
        String password = "";
        int eta = 0;
        boolean controllo = true;

        // Registrazione utente
        while (controllo) {
            System.out.print("Inserisci il nome: ");
            nome = scanner.nextLine();

            System.out.print("Inserisci l'eta': ");
            eta = scannerInt.nextInt();

            System.out.print("Inserisci la password: ");
            password = scanner.nextLine();

            // Controllo che i valori non siano vuoti
            if (nome.isEmpty() || eta < 18 || password.isEmpty()) {
                System.out.println("I campi non possono essere vuoti e devi essere maggiorenne. Riprova.");
            } else {
                controllo = false; // Se tutti i campi sono validi, esci dal ciclo
            }
        }

        System.out.println("Registrazione completata!");

        String nomeUtenteRegistrato = nome; // Salviamo il nome utente per il login
        String passwordRegistrata = password; // Salviamo la password per il login
        boolean loggato = false;

        // Ciclo per i tentativi di login (3 tentativi)
        for (int tentativi = 1; tentativi <= 3; tentativi++) {

            System.out.println("\nTentativo " + tentativi + " di 3:");

            System.out.print("Inserisci il nome utente per il login: ");
            String nomeLogin = scanner.nextLine();

            System.out.print("Inserisci la password per il login: ");
            String passwordLogin = scanner.nextLine();

            // Verifica delle credenziali
            if (nomeLogin.equals(nomeUtenteRegistrato) && passwordLogin.equals(passwordRegistrata)) {

                loggato = true;
                System.out.println("Login riuscito! Sei loggato.");

                // scelta dei dati da modificare
                System.out.println("\nQuale delle 3 info vuoi modificare?"
                        + "\n1 - Nome"
                        + "\n2 - Età"
                        + "\n3 - Password");
                int scelta = scanner.nextInt();

                switch (scelta) {
                    case 1:
                        System.out.print("Reinserisci nome: ");
                        nome = scanner.nextLine();
                        break;
                    case 2:
                        System.out.print("Reinserisci età: ");
                        eta = scannerInt.nextInt();
                        break;
                    case 3:
                        System.out.print("Reinserisci password: ");
                        password = scanner.nextLine();
                        break;
                    default:
                        System.out.println("Hai sbagliato selezione");
                        break;
                }

                // stampa dei dati aggiornati
                System.out.println("\nI tuoi dati aggiornati sono:"
                        + "\nNome: " + nome
                        + "\nEtà: " + eta
                        + "\nPassword: " + password);

                break; // Esce dal ciclo se il login è corretto

            } else {
                System.out.println("Nome utente o password errati.");
            }
        }

        // Se il login non è riuscito dopo 3 tentativi
        if (!loggato) {
            System.out.println("Numero tentativi esaurito. Riprova più tardi.");
        }

        scanner.close();
        scannerInt.close();
    }
}
