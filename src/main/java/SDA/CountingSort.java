package SDA;

import java.util.Random;
import java.util.Scanner;

public class CountingSort {


    Random generator = new Random();
    Scanner lbElementow = new Scanner(System.in);

    public CountingSort() {
        System.out.println("Podaj wielkość tablicy");
        liczba = lbElementow.nextInt();
        System.out.println("Podaj zakres liczb losowych");
        zakres = lbElementow.nextInt();
    }

    int liczba;

    int zakres;


    public int[] tworzenietablicy() {
        int[] tablica2 = new int[liczba];
        for (int i = 0; i <= liczba - 1; i++) {
            tablica2[i] = generator.nextInt(zakres);
        }

        return tablica2;
    }


    public void countingsort(int[] tablica) {


//        Szukanie najewiekszego elementu
        int temp = tablica[0];
        for (int key : tablica) {

            if (temp < key) {
                temp = key;
            }

        }

// Nowa kolekcja na podstawie najwiekszego elementu plus zapełnienie ją zerami

        int[] array = new int[temp + 1];

        for (int i = 0; i >= temp; i++) {
            array[i] = 0;

        }
//      Dla każdego elementu "tablica" wykonaj array[tablica]++

        for (int key : tablica) {
            array[key]++;
        }

        // Sumowanie array

        for (int i = 0; i < temp; i++) {
            array[i + 1] = array[i] + array[i + 1];
        }
//        Tworzenie koncowej + sortowanie
        int[] finalarray = new int[tablica.length];


        for (int temp2 = 0; temp2 < tablica.length; temp2++) {

            array[tablica[temp2]]--;
            finalarray[array[tablica[temp2]]] = tablica[temp2];
        }

        System.out.println("Posortowana tablica");
        for (int key : finalarray) {
            System.out.print(key + " ");
        }


    }
}

