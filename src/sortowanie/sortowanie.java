package sortowanie;

import java.util.Arrays;
import java.util.Collections;

public class sortowanie {
    public static void main(String[] args) {
        Integer[] tab = {9,3,5,6,7,6,54,5};

        System.out.println(Arrays.toString(tab));

       Integer[] kopia;
       kopia = tab;
       tab[0] = 999;
       System.out.println("Kopiwanie referenycjne");
       System.out.println(Arrays.toString(tab));
       System.out.println(Arrays.toString(kopia));

       kopia = Arrays.copyOf(tab, tab.length);
        tab[0] = -888;
        System.out.println("Fizyczna kopia tablicy");
        System.out.println(Arrays.toString(tab));
        System.out.println(Arrays.toString(kopia));

        System.out.println("Sortowanie tablic");
        Arrays.sort(tab);
        System.out.println(Arrays.toString(tab));
        System.out.println(Arrays.toString(kopia));
        System.out.println("sortowanie malejąco");
        Arrays.sort(tab, Collections.reverseOrder());
        System.out.println(Arrays.toString(tab));
        System.out.println(Arrays.toString(kopia));




    }
}
