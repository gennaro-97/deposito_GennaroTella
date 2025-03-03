import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class EsercizioSquadra {
    public static void main(String[] args) {
        Squadra pippe = new Squadra();
        Squadra avversari = new Squadra();
        Scanner sc_STR = new Scanner(System.in);
        int n_giocatori = 0;

        for (int i = 0; i < 12; i++) {
            System.out.println("Giocatore " + (i + 1));
            System.out.println("Inserisci il nome del giocatore: ");
            String nome = sc_STR.nextLine();

            // Ciclo per controllare se il ruolo inserito è valido
            String ruolo;
            while (true) {
                System.out.println("Inserisci il ruolo del giocatore (attaccante (atc), centrocampista(cts), difensore(dif)): ");
                ruolo = sc_STR.nextLine().toLowerCase(); // Rendiamo tutto minuscolo per una verifica case-insensitive
                if (isRuoloValido(ruolo)) {
                    break; // Esce dal ciclo se il ruolo è valido
                } else {
                    System.out.println(
                            "Ruolo non valido. Per favore, inserisci un ruolo valido (atc, cts, dif).");
                }
            }

            pippe.giocatori.add(new Giocatore(nome, ruolo)); // Aggiunge il giocatore con ruolo valido
        }

        /*
         * System.out.println(
         * "----------------------------------------------------------------------------"
         * );
         * System.out.println("I giocatori della squadra sono: ");
         * for (Giocatore giocatore : pippe.giocatori) {
         * n_giocatori++;
         * System.out.println(n_giocatori + " Nome: " + giocatore.nome + " Ruolo: " +
         * giocatore.ruolo);
         */

        // Inserisci giocatori per la seconda squadra (avversari)
        System.out.println("Inserisci i giocatori per la seconda squadra (Avversari):");
        for (int i = 0; i < 12; i++) { // Loop per inserire i giocatori dell'altra squadra
            System.out.println("Giocatore " + (i + 1));
            System.out.println("Inserisci il nome del giocatore: ");
            String nome = sc_STR.nextLine();

            // Ciclo per controllare se il ruolo inserito è valido
            String ruolo;
            while (true) {
                System.out.println("Inserisci il ruolo del giocatore (attaccante (atc), centrocampista(cts), difensore(dif)): ");
                ruolo = sc_STR.nextLine().toLowerCase(); // Rendiamo tutto minuscolo per una verifica case-insensitive
                if (isRuoloValido(ruolo)) {
                    break; // Esce dal ciclo se il ruolo è valido
                } else {
                    System.out.println(
                            "Ruolo non valido. Per favore, inserisci un ruolo valido (atc, cts, dif).");
                }
            }

            avversari.giocatori.add(new Giocatore(nome, ruolo)); // Aggiunge il giocatore con ruolo valido
        }

        // Creazione della partita
        Partita partita = new Partita(pippe, avversari);
        partita.iniziaPartita();
    }

    private static boolean isRuoloValido(String ruolo) {
        String[] ruoli_validi = { "atc", "cts", "dif" };
        for (String r : ruoli_validi) {
            if (r.equalsIgnoreCase(ruolo)) {
                return true;
            }
        }
        return false;
    }
}

class Giocatore {

    String nome;
    final String ruolo;

    public Giocatore(String nome, String ruolo) {
        this.nome = nome;
        this.ruolo = ruolo;
    }

}

class Squadra {
    ArrayList<Giocatore> giocatori = new ArrayList<Giocatore>();
}

class Partita {
    Squadra squadra1;
    Squadra squadra2;

    public Partita(Squadra squadra1, Squadra squadra2) {
        this.squadra1 = squadra1;
        this.squadra2 = squadra2;
    }

    public void iniziaPartita() {
        Random rand = new Random();
        // Generiamo un punteggio casuale per ogni squadra
        int punteggioSquadra1 = rand.nextInt(6); // Punteggio da 0 a 5
        int punteggioSquadra2 = rand.nextInt(6); // Punteggio da 0 a 5

        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Risultato della partita: ");
        System.out.println(
                "Squadra 1 (Pippe) - " + punteggioSquadra1 + " | Squadra 2 (Avversari) - " + punteggioSquadra2);

        if (punteggioSquadra1 > punteggioSquadra2) {
            System.out.println("La squadra Pippe ha vinto!");
        } else if (punteggioSquadra1 < punteggioSquadra2) {
            System.out.println("La squadra Avversari ha vinto!");
        } else {
            System.out.println("La partita è finita in pareggio!");
        }
    }
}