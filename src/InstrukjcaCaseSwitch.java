public class InstrukjcaCaseSwitch
{
    public static void main(String[] args) {

        //jeżeli liczba jest mniejsza od 10 wypisz liczba mniejsza, w przeciwnym wypadku "wieksza"
        int i = 7;
        if (i < 10 ) System.out.println("Mniejsza");
        else System.out.println("Wieksza");

        String napis  = (i < 10 ) ? "Mniejsza" : "Większa";
        System.out.println(napis);

        int liczba  = (i < 10) ? 7: -5;


        int przycisk =0;
        if(przycisk == 1)
        {
            System.out.println("cos 1");
        }
        if(przycisk == 2)
        {
            System.out.println("cos 2");
        }
        if(przycisk == 3)
        {
            System.out.println("cos 3");
        }
        if(przycisk == 4)
        {
            System.out.println("cos 4");
        }
        if(przycisk == 5)
        {
            System.out.println("cos 5");
        }
        //------------------------------------------------

        char znak;
        znak ='c';
        switch (znak)
        {
            case 'c':
            {
                System.out.println("czerwony");
                break;
            }
            case 'b':
            {
                System.out.println("biały");
                break;
            }
            case 'z':
            {
                System.out.println("zielony");
                break;
            }
            case 'p':
            {
                System.out.println("pomaranczowy");
                break;
            }
            case 'n':
            {
                System.out.println("niebieski");
                break;
            }
            default:
                System.out.println("inny kolor");
        }

        int wybor = 1;
        switch (wybor)
        {
            case 1 -> {
                System.out.println("Pierwszy program");
            }
            case 2 -> {
                System.out.println("Drugi program");
            }
            case 3 -> {
                System.out.println("Trzeci program");
            }
            case 4 -> {
                System.out.println("Czwarty program");
            }
            default -> System.out.println("Inny program");

        }

    }
}
