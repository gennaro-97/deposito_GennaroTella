import java.util.Scanner;

public class Loop_While_con_If {
    public static void main(String[] args) {

        //creazione dello scanner e dichiarazione variabili
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        int totale = 0;
        
        //condizione di uscita: Inserire numero negativo
        while(numero >= 0){

            //Richiesta input utente
            System.out.print("Inserisci il numero: ");
            numero = scanner.nextInt();

            //controllo del numero: PARI, DISPARI, NEGATIVO.
            if(numero<0){
                System.out.println("Il numero inserito è negativo. FINE");
                break;
            }else if(numero % 2 == 0){
                System.out.println(" - Il numero inserito è pari.");
            }else{
                System.out.println(" - Il numero inserito è dispari.");
            }

            //Somma dei numeri inseriti e verifica della somma: PARI, DISPARI
            totale += numero;
            if(totale % 2 == 0){
                System.out.println(" - La somma dei numeri è PARI = "+ totale);
            }else{
                System.out.println(" - La somma dei numeri è DISPARI = " +totale);
            }

        }
    }
}
