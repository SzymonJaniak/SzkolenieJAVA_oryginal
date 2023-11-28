import java.util.Scanner;

public class OdczytStandardoweWejscie {
    public static void main(String[] args) {
//        int a;
//        Scanner odczyt = new Scanner(System.in);
//        System.out.println("Podaj liczbe");
//        int liczba = odczyt.nextInt();
//        System.out.println("podana przez ciebie liczba to: " + liczba);
//        int liczba2 = odczyt.nextInt();
//        System.out.println("podana przez ciebie liczba to: " + liczba2);
//        //enter
//        System.out.println("Podaj imie ");
//        odczyt.nextLine();  //odczyt enter
//        String imie = odczyt.nextLine();
//        System.out.println("Twoje imie to: " + imie);  //tak nie działa
//
//        Scanner odczytString = new Scanner(System.in);
//        System.out.println("Podaj imie ");
//        String linijkaTekstu = odczytString.nextLine();
//        System.out.println("Twoje imie to: " + linijkaTekstu); //linia tekstu

//        Scanner doSpacji = new Scanner(System.in);
//        System.out.println("Czytam do spacji");
//        String nazwisko = doSpacji.next();
//        System.out.println("Odczyt samego nazwiska " + nazwisko);

//        System.out.println("Podaj liczbę zmiennoprzcinkowa");
//        Scanner liczba = new Scanner(System.in);
//        double zminna = liczba.nextDouble();
//        System.out.println("Odczytana liczba to: " + zminna);
//
//        System.out.println("Liczba zmiennoprecinkowa");
//        double krocej = new Scanner(System.in).nextDouble();
//        System.out.println("Odczytana liczba to: " + krocej);

        System.out.println("Podaj liczbę z kropką");
        String doDouble = new Scanner(System.in).nextLine();
        System.out.println("Odczytany String to: " + doDouble);
        double rzeczywista = Double.parseDouble(doDouble);
        System.out.println("Zmieniona liczba to: " + rzeczywista*rzeczywista);
    }
}
