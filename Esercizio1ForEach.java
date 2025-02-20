import java.util.Scanner;

public class Esercizio1ForEach {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int array[] = { 0, 0, 0 };
        boolean controllo = true;
        int contatore = 0;

        while (controllo) {
            System.out.println("Inserisci 3 valori nell'array:");

            //inserimento dati nell'array 
            for (int i = 0; i < array.length; i++) {
                System.out.println("Valore n.ro " + (i + 1) + ":");
                array[i] = scanner.nextInt();
            }

            System.out.println();

            //stampa dei valori maggiori di 100
            for (int valore : array) {
                if (valore > 100) {
                    System.out.println("Il valore: " + valore + "è maggiore di 100.");
                    contatore++;
                }
            }

            System.out.println();

            //verifica condizione di uscita dal ciclo: i tre numeri devono essere maggiori di 100
            if (contatore == 3) {
                controllo = false;
            } else {
                System.out.println("Per uscire dal ciclo devi inserire tutti i numeri maggiori di 100");
                contatore = 0;
            }

        }

        scanner.close();
    }
}