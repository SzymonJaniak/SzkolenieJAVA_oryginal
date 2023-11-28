public class Operatory
{
    public static void main(String[] args) {
        {
            int x = 11;
            System.out.println("Zmienna blokowa " + x);
        }
        for(int x = 1; x < 10; x++)
        {
            System.out.println("Zmienna w petli " + x);
        }
        //System.out.println("Zmienna blokowa " + x);

        double   a = 1,b = 1,c = 1,d = 1;
        System.out.println( "A oto wartosc poszczegolnych wyrazen\n" + "(nie mylic ze zmiennymi)\n" );

        System.out.println( "++a = " + ++a
                + " \n b++ = " + b++
                + " \n --c = " + --c
                + " \n d-- = " + d-- );
// teraz sprawdzamy co jest obecnie w zmiennych

        System.out.println( "Po obliczeniu tych wyrazen, same " + "zmienne maja wartosci\n"

                + "a = " + a
                + "b = " + b
                + "c = " + c
                + "d = " + d) ;

        a+=2;
        b -= 2;
        c *=2;
        d /=2;
        System.out.println( "Po obliczeniu tych wyrazen:\n"
                + "a +=2 " + a
                + "b -=2 " + b
                + "c *=2 " + c
                + "d /=2 " + d) ;

        Math.sqrt(1);

    }
}
