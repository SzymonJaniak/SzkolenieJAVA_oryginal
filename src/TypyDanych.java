public class TypyDanych {
    public static void main(String[] args)
    {
        //to jest komentarz
        /* to jest komentarz
        wielolinijkowy
         */
        //nazwa klasy ma być zgodna z nazwą pliku
        //nazwa klasy ma być pisana z wielkiej litery
        //nazwa zmiennej camelCase
        char mojaZmiennaWsposobieZapisuCamelCase;
        //nazwa zmiennej c++
        char moja_zmienna_w_sposobieZapisu_c;
        mojaZmiennaWsposobieZapisuCamelCase = 'y';
//        mojaZmiennaWsposobieZapisuCamelCase = "y"; - pojednyczy apostrof
        String mojaZmiennaTypuString = "m";
        String mojNapis = "Kamil gdzie jestes?";
        System.out.println(mojNapis + "jeszcze mnie nie ma");
        boolean wartoscLogiczna = false;
        if(wartoscLogiczna)
        {
            System.out.println("Działa");
        }
        else
        {
            System.out.println("Nie bangla");
        }
        byte mojaZmienaTypuByte = 127;
        System.out.println("Moja zmienna typu byte " + mojaZmienaTypuByte);
        byte malo1 = Byte.MIN_VALUE;
        byte malo2 = Byte.MAX_VALUE;
        //sout
        System.out.println("Minimalna liczba w typie byte " + malo1 );
        System.out.println("Maksymalna liczba w typie byte " + malo2 );
//        byte test = mojaZmienaTypuByte + malo2; 
        short mojaZmiennaTypuShort = 32000;
        System.out.println("Moja zmienna typu short " + mojaZmiennaTypuShort);
        short short1 = Short.MIN_VALUE;
        short short2 = Short.MAX_VALUE;
        //sout
        System.out.println("Minimalna liczba w typie short " + short1 );
        System.out.println("Maksymalna liczba w typie short " + short2 );

        int mojaZmiennaTypuInt = 1234657789;
        System.out.println("Moja zmienna typu int " + mojaZmiennaTypuInt);
        int int1 = Integer.MIN_VALUE;
        int int2 = Integer.MAX_VALUE;
        //sout
        System.out.println("Minimalna liczba w typie int " + int1 );
        System.out.println("Maksymalna liczba w typie int " + int2 );

        long mojaZmiennaTypuLong = 1234657789;
        System.out.println("Moja zmienna typu int " + mojaZmiennaTypuLong);
        long long1 = Long.MIN_VALUE;
        long long2 = Long.MAX_VALUE;
        //sout
        System.out.println("Minimalna liczba w typie long " + long1 );
        System.out.println("Maksymalna liczba w typie long " + long2 );
        long test2 = 9223372036854775807l;

        float mojaZmiennaTypuFloat = 1.89786f;
        System.out.println("Moja zmienna typu float " + mojaZmiennaTypuFloat);
        float float1 = Float.MIN_VALUE;
        float float2 = Float.MAX_VALUE;
        //sout
        System.out.println("Minimalna liczba w typie float " + float1 );
        System.out.println("Maksymalna liczba w typie float " + float2 );

        double mojaZmiennaTypuDouble  = 1.876098765;
        double mojaZmiennaTypuDouble1  = 1.876098765d;
        System.out.println("Moja zmienna typu float " + mojaZmiennaTypuFloat);
        double double1 = Double.MIN_VALUE;
        double double2 = Double.MAX_VALUE;
        //sout
        System.out.println("Minimalna liczba w typie double " + double1 );
        System.out.println("Maksymalna liczba w typie double " + double2 );




    }
    //tu moge pisać ale wytłumaczę później
}
//\tu nie może nic być - poza klasą
