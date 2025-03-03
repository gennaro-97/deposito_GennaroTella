import java.util.Scanner;

public class Prova_Chef {
    public static void main(String[] args) {
        int selezione = 0;
        Scanner scanner = new Scanner(System.in);
        do {

            System.out.println("Che tipo di chef vuoi creare?");
            System.out.println("1. Chef sushi");
            System.out.println("2. Chef pizza");
            System.out.println("3. Chef pasta");
            System.out.println("4. Chef carne");
            System.out.println("0. Esci");
            selezione = scanner.nextInt();
            switch (selezione) {
                case 1:
                    Chef chef1 = new Chef("Tizio", "Sushi", "Riso, pesce, alghe");
                    System.out.println("Chef sushi creato!");
                    System.out.println("Chef: " + chef1.nome);
                    System.out.println("Specialità: " + chef1.specialita);
                    System.out.println("Ingredienti: " + chef1.ingredienti);
                    System.out.println();
                    break;
                case 2:
                    Chef chef2 = new Chef("Caio", "Pizza", "Farina, pomodoro, mozzarella");
                    System.out.println("Chef pizza creato!");
                    System.out.println("Chef: " + chef2.nome);
                    System.out.println("Specialità: " + chef2.specialita);
                    System.out.println("Ingredienti: " + chef2.ingredienti);
                    System.out.println();
                    break;
                case 3:
                    Chef chef3 = new Chef("Barbieri", "Pasta", "Farina, uova, acqua");
                    System.out.println("Chef pasta creato!");
                    System.out.println("Chef: " + chef3.nome);
                    System.out.println("Specialità: " + chef3.specialita);
                    System.out.println("Ingredienti: " + chef3.ingredienti);
                    System.out.println();
                    break;
                case 4:
                    Chef chef4 = new Chef("Cannavacciulo", "Carne", "Manzo, maiale, pollo");
                    System.out.println("Chef carne creato!");
                    System.out.println("Chef: " + chef4.nome);
                    System.out.println("Specialità: " + chef4.specialita);
                    System.out.println("Ingredienti: " + chef4.ingredienti);
                    System.out.println();
                    break;
                case 0:
                    System.out.println("Arrivederci!");
                    break;
                default:
                    break;
            }
        } while (selezione != 0);
    }
}

class Chef {

    String nome;
    String specialita;
    String ingredienti;

    public Chef(String nome, String specialita, String ingredienti) {
        this.nome = nome;
        this.specialita = specialita;
        this.ingredienti = ingredienti;
    }
}
