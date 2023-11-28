package funkcje;

import java.util.Random;

public class FunkcjeTablice {
    public static void main(String[] args) {

        //Napisz funkcje, która
         //- wypisuje liczby parzyste z tablicy
        // - wypisuje liczby nieparzyste z tablicy
        // -liczby podzielne przez 5 i zapisuje je do nowej tablicy
        // zrób kopie tablicy
        //funkcja do odwracania wyrazów
        




        int[] tab = new int[50];
        uzupelnij(tab);
        System.out.println("Elemenet 1 =" + tab[0]);
        wypisz(tab);

        int[] zwroc;
        zwroc = podwojenie(tab);
        System.out.println("Zwrocona tablica ");
        for (int zobacz: tab) {
            System.out.print(zobacz + ", ");
        }
        System.out.println();
        wypisz(tab); //
    }
    public static int[] podwojenie(int[] razyDwa)
    {
        for(int i =0 ; i < razyDwa.length; i++)
            razyDwa[i] *= 2;
        return razyDwa;
    }
    public static void uzupelnij(int[] a)
    {
        for(int i = 0; i < a.length; i++)
        {
            a[i] = new Random().nextInt(100);
        }
    }
    public static void wypisz(int[] wypisz)
    {
        for (int x:wypisz) {
            System.out.print(x + ", ");
        }
    }

}
