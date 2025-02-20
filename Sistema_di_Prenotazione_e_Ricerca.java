import java.util.ArrayList;
import java.util.Scanner;

public class Sistema_di_Prenotazione_e_Ricerca {
    public static void main(String[] args) {

        Scanner scan_STR = new Scanner(System.in);
        Scanner scan_NUM = new Scanner(System.in);

        ArrayList<String> nome = new ArrayList<>();
        ArrayList<Integer> numero_fila = new ArrayList<>();
        ArrayList<Integer> numero_posto = new ArrayList<>();

        Boolean esegui = true;

        int menu = 0;

        while (esegui) {

            Boolean prenotazione = true;
            Boolean cerca = true;

            System.out.println("**********MENU'**********"
                    + "\n1 - PRENOTAZIONE"
                    + "\n2 - RICERCA PRENOTAZIONE"
                    + "\n3 - MAPPA DELLA SALA"
                    + "\n4 - REPORT"
                    + "\n0 - ESCI DAL PROGRAMMA");
                    System.out.println("? ");
            menu = scan_NUM.nextInt();
            /*
             * if(menu<0 || menu > 4){
             * System.out.println("Valore non valido!");
             * continue;
             * }
             */

            switch (menu) {
                case 1:
                    while (prenotazione) {

                        System.out.print("Indicare il tuo nome: ");
                        String nome_Utente = scan_STR.nextLine();

                        System.out.print("\nInserire la fila (1-3): ");
                        int fila = scan_NUM.nextInt();

                        // Controllo se la fila è valida
                        if (fila < 1 || fila > 3) {
                            System.out.println("Fila non valida! Inserisci un valore tra 1 e 3.");
                            continue;
                        }

                        System.out.print("\nInserisci il posto (1-8): ");
                        int posto = scan_NUM.nextInt();

                        // Controllo se il posto è valido
                        if (posto < 1 || posto > 8) {
                            System.out.println("Posto non valido! Inserisci un valore tra 1 e 8.");
                            continue;
                        }

                        // Se i dati sono validi, vengono aggiunti agli ArrayList
                        nome.add(nome_Utente);
                        numero_fila.add(fila);
                        numero_posto.add(posto);

                        System.out.println("Prenotazione effettuata con successo per " + nome_Utente + " - Fila " + fila
                                + ", Posto " + posto);

                        prenotazione = false;

                    }
                    break;

                case 2:
                    while (cerca) {

                        System.out.print("\nInserisci il nome da cercare: ");
                        String nomeCercato = scan_STR.nextLine();

                        boolean trovato = false; // Flag per verificare se il nome è stato trovato

                        // Scansione di tutte le prenotazioni
                        for (int i = 0; i < nome.size(); i++) {
                            if (nome.get(i).equals(nomeCercato)) {
                                System.out.println("Prenotazione trovata: " + nome.get(i) +
                                        " - Fila " + numero_fila.get(i) +
                                        ", Posto " + numero_posto.get(i));
                                trovato = true;
                            }
                        }

                        // Se nessuna prenotazione è stata trovata, avvisiamo l'utente
                        if (!trovato) {
                            System.out.println("Nessuna prenotazione trovata per: " + nomeCercato);
                        }

                        // Chiedere se vuole fare un'altra ricerca
                        String risposta;
                        do {
                            System.out.print("\nVuoi cercare un altro nome? (si/no): ");
                            risposta = scan_STR.nextLine().trim().toLowerCase(); // Rimuove spazi e converte in
                                                                                 // minuscolo

                            if (risposta.equals("no")) {
                                cerca = false;
                            } else if (!risposta.equals("si")) {
                                System.out.println("Input non valido! Rispondi con 'si' o 'no'.");
                            }
                        } while (!risposta.equals("si") && !risposta.equals("no"));
                    }
                    break;

                case 3:
                    System.out.println("Mappa della sala (X = occupato, [ ] = libero):\n");

                    // Scorro tutte le file
                    for (int i = 1; i <= 3; i++) {

                        // Scorro i posti
                        for (int j = 1; j <= 8; j++) {

                            // Controllo se il posto (i, j) è prenotato
                            boolean occupato = false;

                            for (int k = 0; k < numero_fila.size(); k++) {
                                if (numero_fila.get(k) == i && numero_posto.get(k) == j) {
                                    occupato = true;
                                    break;
                                }
                            }

                            // Stampa la sala con X per occupato e [ ] per libero
                            if (occupato) {
                                System.out.print("[X] ");
                            } else {
                                System.out.print("[ ] ");
                            }
                        }
                        System.out.println(); // Vai a capo alla fine della fila
                    }
                    break;

                case 4:
                    // Numero di posti prenotati
                    int postiPrenotati = numero_fila.size();

                    // Numero di posti liberi
                    int postiLiberi = 24 - postiPrenotati;

                    // Creazione del report
                    System.out.println("\n----- Report Prenotazioni -----");
                    System.out.println("Posti totali: 24");
                    System.out.println("Posti prenotati: " + postiPrenotati);
                    System.out.println("Posti liberi: " + postiLiberi);
                    System.out.println("\nDettaglio prenotazioni:");

                    for (int i = 0; i < nome.size(); i++) {
                        System.out.println(
                                "Nome: " + nome.get(i) + " - Fila: " + numero_fila.get(i) + ", Posto: "
                                        + numero_posto.get(i));
                    }
                    break;

                case 0:
                    System.out.println("Il programma è terminato.");
                    esegui = false;
                    break;

                default:
                    System.out.println("Valore non valido! RIPROVA");
                    break;
            }

            /*
             * while (prenotazione) {
             * 
             * System.out.print("Indicare il tuo nome: ");
             * String nome_Utente = scan_STR.nextLine();
             * 
             * System.out.print("\nInserire la fila (1-3): ");
             * int fila = scan_NUM.nextInt();
             * 
             * // Controllo se la fila è valida
             * if (fila < 1 || fila > 3) {
             * System.out.println("Fila non valida! Inserisci un valore tra 1 e 3.");
             * continue;
             * }
             * 
             * System.out.print("\nInserisci il posto (1-8): ");
             * int posto = scan_NUM.nextInt();
             * 
             * // Controllo se il posto è valido
             * if (posto < 1 || posto > 8) {
             * System.out.println("Posto non valido! Inserisci un valore tra 1 e 8.");
             * continue;
             * }
             * 
             * // Se i dati sono validi, vengono aggiunti agli ArrayList
             * nome.add(nome_Utente);
             * numero_fila.add(fila);
             * numero_posto.add(posto);
             * 
             * System.out.println("Prenotazione effettuata con successo per " + nome_Utente
             * + " - Fila " + fila
             * + ", Posto " + posto);
             * 
             * prenotazione = false;
             * 
             * }
             */

            /*
             * while (cerca) {
             * 
             * System.out.print("\nInserisci il nome da cercare: ");
             * String nomeCercato = scan_STR.nextLine();
             * 
             * boolean trovato = false; // Flag per verificare se il nome è stato trovato
             * 
             * // Scansione di tutte le prenotazioni
             * for (int i = 0; i < nome.size(); i++) {
             * if (nome.get(i).equals(nomeCercato)) {
             * System.out.println("Prenotazione trovata: " + nome.get(i) +
             * " - Fila " + numero_fila.get(i) +
             * ", Posto " + numero_posto.get(i));
             * trovato = true;
             * }
             * }
             * 
             * // Se nessuna prenotazione è stata trovata, avvisiamo l'utente
             * if (!trovato) {
             * System.out.println("Nessuna prenotazione trovata per: " + nomeCercato);
             * }
             * 
             * // Chiedere se vuole fare un'altra ricerca
             * String risposta;
             * do {
             * System.out.print("\nVuoi cercare un altro nome? (si/no): ");
             * risposta = scan_STR.nextLine().trim().toLowerCase(); // Rimuove spazi e
             * converte in minuscolo
             * 
             * if (risposta.equals("no")) {
             * cerca = false;
             * } else if (!risposta.equals("si")) {
             * System.out.println("Input non valido! Rispondi con 'si' o 'no'.");
             * }
             * } while (!risposta.equals("si") && !risposta.equals("no"));
             * }
             */

            /*
             * System.out.println("Mappa della sala (X = occupato, [ ] = libero):\n");
             * 
             * // Scorro tutte le file
             * for (int i = 1; i <= 3; i++) {
             * 
             * // Scorro i posti
             * for (int j = 1; j <= 8; j++) {
             * 
             * // Controllo se il posto (i, j) è prenotato
             * boolean occupato = false;
             * 
             * for (int k = 0; k < numero_fila.size(); k++) {
             * if (numero_fila.get(k) == i && numero_posto.get(k) == j) {
             * occupato = true;
             * break;
             * }
             * }
             * 
             * // Stampa la sala con X per occupato e [ ] per libero
             * if (occupato) {
             * System.out.print("[X] ");
             * } else {
             * System.out.print("[ ] ");
             * }
             * }
             * System.out.println(); // Vai a capo alla fine della fila
             * }
             */

            // Numero di posti prenotati
            /*
             * int postiPrenotati = numero_fila.size();
             * 
             * // Numero di posti liberi
             * int postiLiberi = 24 - postiPrenotati;
             * 
             * // Creazione del report
             * System.out.println("\n----- Report Prenotazioni -----");
             * System.out.println("Posti totali: 24");
             * System.out.println("Posti prenotati: " + postiPrenotati);
             * System.out.println("Posti liberi: " + postiLiberi);
             * System.out.println("\nDettaglio prenotazioni:");
             * 
             * for (int i = 0; i < nome.size(); i++) {
             * System.out.println(
             * "Nome: " + nome.get(i) + " - Fila: " + numero_fila.get(i) + ", Posto: " +
             * numero_posto.get(i));
             * }
             */

            /*
             * System.out.println("Vuoi continuare? si/no.");
             * String continua = scan_STR.nextLine();
             * if (continua.equalsIgnoreCase("no")) {
             * System.out.println("IL PROGRAMMA E' FINITO!");
             * esegui = false;
             * }
             */
        }

    }
}
