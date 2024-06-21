// Resuelto

import java.util.Scanner;

public class Problema621 {
    static Scanner in;

    public static void casoDePrueba()
    {
        int pag = in.nextInt();
        if(pag >= 2 && pag <= 1000)
        {
            if(pag % 2 == 0){System.out.println(++pag);}
            else{System.out.println(--pag);}
        }
    }

    public static void main(String [] args)
    {
        in = new Scanner(System.in);
        int reps = in.nextInt();

        for(int i = 0; i < reps; i++)
        {
            casoDePrueba();
        }
    }
}
