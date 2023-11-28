public class Maksymalna
{
    public static void main(String[] args) {


        //wybór maksymalnej liczby z pośród 3
//        int a = 9, b=11,c =11;
//
//        if ((a >= b) && (a >= c))
//            System.out.println("Liczba a jest najwieksza " + a );
//        else
//            if ((b >= a) && (b >= c))
//                 System.out.println("Liczba b jest najwieksza " + b );
//            else
//            if ((c >= a) && (c >= b))
//                System.out.println("Liczba c jest najwieksza " + c );

                int a = 9, b=11,c =11, d = 8;

        if ((a >= b) && (a >= c) && (a>=d))
            System.out.println("Najwieksza " + a );
        else
            if ((b >= a) && (b >= c) && (b >= d))
                 System.out.println("Najwieksza " + b );
            else
            if ((c >= a) && (c >= b) && (c >= d))
                System.out.println("Najwieksza " + c );
            else
            if ((d >= a) && (d >= b) && (d >= c))
                System.out.println("Najwieksza " + d );

            int max  = a;
            if(b > max)
                max = b;
            if (c > max)
                max = c;
            if (d > max)
                max = d;
            System.out.println(" Max innym sposobem " + max );

        System.out.println("max za pomocą Math.max() " + Math.max(Math.max(a,b), c));
    }
}
