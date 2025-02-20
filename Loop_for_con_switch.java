import java.util.Scanner;

public class Loop_for_con_switch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] giorni = {"","","","","","",""};
        String[] giorni_scelta = {"Lunedì","Martedì","Mercoledì","Giovedì","Venerdì","Sabato","Domenica"};
        int numero = 0;

        System.out.println("Inserisci i seguenti numeri per scegliere i giorni della settimana: "
        +"\n1 - "+giorni_scelta[0]
        +"\n2 - "+giorni_scelta[1]
        +"\n3 - "+giorni_scelta[2]
        +"\n4 - "+giorni_scelta[3]
        +"\n5 - "+giorni_scelta[4]
        +"\n6 - "+giorni_scelta[5]
        +"\n7 - "+giorni_scelta[6]);

        for (int i = 0; i < 7; i++) {

            System.out.println("Inserisci: ");
            numero = scanner.nextInt();

            switch (numero) {
                case 1:

                System.out.println("Giorno selezionato: "+giorni_scelta[0]);
                giorni[i] = giorni_scelta[0];

                    break;

                case 2:

                System.out.println("Giorno selezionato: "+giorni_scelta[1]);
                giorni[i] = giorni_scelta[1];

                    break;

                case 3:

                System.out.println("Giorno selezionato: "+giorni_scelta[2]);
                giorni[i] = giorni_scelta[2];

                    break;

                case 4:

                System.out.println("Giorno selezionato: "+giorni_scelta[3]);
                giorni[i] = giorni_scelta[3];

                    break;

                case 5:

                System.out.println("Giorno selezionato: "+giorni_scelta[4]);
                giorni[i] = giorni_scelta[4];

                    break;

                case 6:

                System.out.println("Giorno selezionato: "+giorni_scelta[5]);
                giorni[i] = giorni_scelta[5];

                    break;

                case 7:

                System.out.println("Giorno selezionato: "+giorni_scelta[6]);
                giorni[i] = giorni_scelta[6];

                    break;

                default:
                System.out.println("Il numero inserito non è valido.");
                    break;
            }
        }


        System.out.println("\nGiorni scelti dall'utente: ");

        for(String giorno: giorni){
            System.out.print(giorno + "  ");
        }
    }
}
