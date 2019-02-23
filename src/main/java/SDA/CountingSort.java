package SDA;

public class CountingSort {

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


        for (int temp2 = 0; temp2 < tablica.length;temp2++){

            array[tablica[temp2]]--;
            finalarray[array[tablica[temp2]]]=tablica[temp2];
        }

        for (int key : finalarray) {
            System.out.print(key+" ");
        }


    }
}

