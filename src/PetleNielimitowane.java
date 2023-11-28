public class PetleNielimitowane {
    public static void main(String[] args) {

        int minimum = 1;
        int maximum = 100;
        int losowa  = (int) (Math.random()*(maximum-minimum +1 ) + minimum);
        System.out.println("liczba losowa " + losowa);

        int los  = 0;
        for(int i = 0; i < 100; i++)
        {
            los = (int) (Math.random()*(maximum-minimum +1 ) + minimum);
            System.out.print(los + " ");
        }
        //Wypisz 20 liczb losowych z przedziału od 1 do 100 podzielnych przez 3
        // policz ilość losowań

        int iloscLiczb = 0;
        int liczba = 0;
        int iloscLosowan = 0;
        while (iloscLiczb <20)
        {
            liczba = (int) (Math.random()*(100) + 1);
            if(liczba % 3 == 0)
            {
                System.out.println("Liczba podzielna przez 3 " + liczba);
                iloscLiczb++;
            }
            iloscLosowan++;
        }
        System.out.println("ilosc losowan " + iloscLosowan);
    }
}
