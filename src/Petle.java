public class Petle
{
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10)
        {
            System.out.println("Kolejne i w petli while to: " + i);
            i++;
        }
        i = 1;
        do
        {

            System.out.println("Kolejne i w petli do while to: " + i);
            i++;
        }
        while (i <=10);

        for(i = 1; i <=10; i++)
        {
            System.out.println("Kolejne i w petli for to: " + i);
        }
//----------------------------------
        int x = 1;
        for( ; ; )
        {
           if(x <=10) {
               System.out.println("Kolejne x w petli for to: " + x);
               x++;
           }
           else 
               break;
        }
        
        //wypisz liczby parzyste od 0 do 50
        //wypisz liczby od 20 do 1  i wyszpisz KABUM
        //wypisz dokładnie 20 liczb począwszy od 150 z krokiem -5
        //Policz sumę 10 kolejnych liczb począwszy od 0;
        //Wypisz liczby od 10 do 100, pomiń liczby z przedziału [50,60]. Użyj "continue";
        //wypisz kwadrat z gwizadek 5x5
        //  *****
        //  *****
        //  *****
        //  *****
        //  *****

        //Wypisz choinkę
        //  *
        //  **
        //  ***
        //  ****
        //  *****

        //Wypisz choinkę
        //  *****
        //  ****
        //  ***
        //  *
        //  *
    }
}
