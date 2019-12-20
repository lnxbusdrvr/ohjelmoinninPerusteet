package harjoituksia;

public class AACKymmenenKertaWhile {

    public static void main(String[] args)
    {
        int i, j=1, k=1;
        System.out.println("For:");
        System.out.println("\n");
        for(i=0; i<10; i++)
        {
            System.out.println("Ohjelmointi on kivaa");
        }
        System.out.println("\n");
        System.out.println("While");
        System.out.println("\n");

        while(j<10)
        {
            System.out.println("Ohjelmointi on vielä kivaa");
            j++;
        }
        System.out.println("\n");
        System.out.println("DoWhile:");

        do
        {
            System.out.println("Ohjelmointi ovc vielä kivempaa");
            k++;
        }while(k<10);
        System.out.println("\n");
    }
}
