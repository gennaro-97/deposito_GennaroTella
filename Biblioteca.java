import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
    public static void main(String[] args) {
        Scanner sc_NUM = new Scanner(System.in);
        Scanner sc_STR = new Scanner(System.in);
        int libri_CONT = 0;
        int ciclo = -1;
        ArrayList<Libro> libri = new ArrayList<Libro>();

        do {

            System.out.println("Vuoi inserire un libro? 1. Si 2. No");
            ciclo = sc_NUM.nextInt();
            if (ciclo == 2) {
                ciclo = 0;
            } else {

                System.out.println("Inserisci il nome dell'autore: ");
                String autore = sc_STR.nextLine();

                System.out.println("Inserisci il numero di pagine: ");
                int nr_pagine = sc_NUM.nextInt();

                libri.add(new Libro(autore, nr_pagine));
            }

        } while (ciclo != 0);
System.out.println("-------------------------------------------------------------------");
        for (Libro libro : libri) {
            libri_CONT++;
            System.out.println("Libro " + libri_CONT);
            System.out.println("Autore: " + libro.autore);
            System.out.println("Numero di pagine: " + libro.nr_pagine);
            System.out.println();
        }

    }
}

class Libro {
    String autore;
    int nr_pagine;

    public Libro(String autore, int nr_pagine) {
        this.autore = autore;
        this.nr_pagine = nr_pagine;
    }
}
