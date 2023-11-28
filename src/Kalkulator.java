public class Kalkulator {
    public static void main(String[] args) {


        String dzialanie = "/";
        int x = 0;
        System.out.println("Wybierz + aby dodać do siebie dwie liczby");
        System.out.println("Wybierz - aby odjąć do siebie dwie liczby");
        System.out.println("Wybierz * aby pomnożyć do siebie dwie liczby");
        System.out.println("Wybierz / aby podzielic do siebie dwie liczby");
        System.out.println("Napisz koniec aby zakonczyć aplikacje");

       if (dzialanie.equals("/"))
       {
           System.out.println("Działa");
       }

        double liczba1 = 1;
        double liczba2 = 2;

        switch (dzialanie)
        {
            case "+" -> {
                System.out.println("Suma dwoch liczb " + (liczba1 + liczba2));
            }
            case "-" -> {
                System.out.println("Roznica dwoch liczb " + (liczba1 - liczba2));

            }
            case "*" -> {
                System.out.println("Iloczyn dwoch liczb " + (liczba1 * liczba2));

            }
            case "/" -> {
                if(liczba2 == 0)
                    System.out.println("Nie licze");
                else
                    System.out.println("Iloraz dwoch liczb " + (liczba1 /liczba2));

            }
            default -> System.out.println("bład działania programu");


        }


    }
}
