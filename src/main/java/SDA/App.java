package SDA;


public class App {
    public static void main(String[] args) {
        CountingSort sortowanie = new CountingSort();

        int[] tablica1 = sortowanie.tworzenietablicy();
        System.out.println("Nieposortowana tablica");
        for (int key : tablica1) {
            System.out.print(key + " ");
        }
        System.out.println(" ");
        sortowanie.countingsort(tablica1);
    }
}