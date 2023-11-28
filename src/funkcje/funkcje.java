package funkcje;

public class funkcje {
    public static void main(String[] args)
    {

        System.out.println("Pierwiastek "+ Math.sqrt(2));
        kreski();
        dodawanie();
        kreski();
        rozncia(9,7);
        kreski();
        int karteczka  = iloczyn();
        System.out.println("Ilocznyn liczb to:" + karteczka*2);
        kreski();
        double karteczka2 = iloraz(1,0);
        System.out.println("Iloraz liczb to: "+ karteczka2);
        kreski();
        int liczba1 = 9;
        int liczba2 = 7;
        System.out.println("dzielenie: "+ iloraz(liczba1, liczba2));
        kreski();
        dodawanie(); //funkcja bezargumentowa
        kreski();
        dodawanie(1,2); //funkcja z dwoma argumentami
        kreski();
    }

    public static double iloraz(double gupiSzef, double b)
    {
        if(b == 0 ) {
            return 0;
        }
        else {
            return gupiSzef / b;
        }
    }

    public static void dodawanie()
    {
        int a =4;
        int b =-4;
        System.out.println("Dodawanie dwoch liczb " + (a+b));
    }
    public static void dodawanie(int a, int b)
    {
        System.out.println("Dodawanie dwoch liczb " + (a+b));
    }
    public static double dodawanie(int a, double b)
    {
       return  (a+b);
    }
    public static void kreski()
    {
        System.out.println("-----------------------------------------");
    }
    public static void rozncia(int a, int b)
    {
        System.out.println("Roznica dwoch liczb to:" + (a-b));
    }
    public static void rozncia(double a, int b)
    {
        System.out.println("Roznica dwoch liczb to:" + (a-b));
    }
    public static int iloczyn()
    {
        int a = 8;
        int b = 7;
        return a*b;
    }

}
