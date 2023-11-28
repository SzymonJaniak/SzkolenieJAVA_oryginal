package funkcje;

public class PrzesylanieArgumentowDoFunkcji {
    public static void main(String[] args) {

        int babcia = 1;
        System.out.println("Na początku argument ma wartość " + babcia);  //jak wyglada babcia
        wnuczek(babcia); // tata wysyła babcie do wnuczka
        System.out.println("Po wyjsciu z funkcji argument ma wartość " + babcia); //uff babcia cała

        int[] drugaBabcia = {2}; // druga babcia
        System.out.println("Jak wyglada druga babcia przed " + drugaBabcia[0]);
        wnuczek(drugaBabcia); //nazwa tablicy jest rownoważna z zeroweym elementen tej naszej tablicy drugaBacia = drugaBabcia[0]
        System.out.println("Po zabawach wnuczka " + drugaBabcia[0]);
    }

    //wnuczek dostaje oryginal
    public static void wnuczek(int[] zabawa)
    {
        zabawa[0] = 100;
        System.out.println("Wnuczek rysuje po babci + " + zabawa[0]);
    }
    //wnuczek i babcia
    //kopia
    public static void wnuczek(int liczba) //wnuczek dostaje kopie - zdjęcie
    {
        liczba = 100; //zawbawa wnuczka
        System.out.println("Nasza liczba wewątrz funkcji " + liczba); //babcia to dziadek
    }
}
