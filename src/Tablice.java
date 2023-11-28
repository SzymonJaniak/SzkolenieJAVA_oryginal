import java.util.Random;

public class Tablice
{
    public static void main(String[] args) {
        String imie[] = new String[3]; //składnia z jezyka c
        String[] nazwisko = new String[3];
        imie[0] = "Jan";
        imie[1] =" Ewa";
        imie[2] = "Ola";
        System.out.println("Imie z tablicy to: " + imie[2]);
      //  imie[3] = "Nieznane"; - taki element w tablicy nie istnieje
       // System.out.println("Czy moge odczytać" + imie[3]);

        for(int i = 0; i < 3; i++)
        {
            System.out.println("Elementy z tablicy to: " + imie[i]);
        }

        System.out.println("------------------------------------");
        int[] liczby = {34,8,5,3,5,7,8,5,34,23,4,6,78,9,8,0,8,7,4,34,3,2,23};
        for(int i = 0; i < liczby.length; i++) //długosc tablicy
        {
            System.out.print(liczby[i]+", ");
        }
        //foreach
        System.out.println("------------------------------------");
        System.out.println("Petla foreach");
        liczby[6] = -100;
        for(int zmienna: liczby)
        {
            System.out.print(zmienna+", ");
        }
        System.out.println();
        System.out.println("--------------------------");
        //podmien ostatni element tablicy na -200
        int ostatni = liczby.length;
        System.out.println("Długosc tablicy to:" + ostatni);
        //System.out.println("Odczytuje 23 element tablicy " + liczby[23]);
        liczby[ostatni-1] = -200;
        System.out.println("Ostatni lemenet tablicy to:" + liczby[ostatni-1]);
        //odczytaj liczby z tablcy w odwrotnej kolejnosci
        System.out.println("------------------------------------");
        System.out.println("Liczby w odwrotnej kolejnosci");

        for(int i = liczby.length-1; i>0; i--)
        {
            System.out.print(liczby[i] +", ");
        }
        //wylosuj 100 liczb z przedziału do 1 do 100 i wpisz je do tablicy
        //liczby w tablicy pomnóż przez 1,5
        //dodaj 100 do każdego elementu w tablicy
        //wypisz tylko parzyste liczby z tablicy
        //wypisz co trzeci indeks z tablicy
        //dodaj do ostatnich 20 elementów tablicy 300

       int los = new Random().nextInt(100)+1;



     }
}
