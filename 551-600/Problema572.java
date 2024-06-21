// Resuelto

import java.util.Scanner;

public class Problema572 {
    static Scanner in = new Scanner(System.in);

    public static void casoDePrueba()
    {
        boolean zero = false;
        boolean nine = false;

        for(int i = 0; i < 5; i++)
        {
            double aux = in.nextDouble();
            if(aux == 0.0){zero = true;}
            if(aux >= 9.0){nine = true;}
        }

        if(!(zero && (!nine))){System.out.println("MEDIA");}
        else{System.out.println("SUSPENSO DIRECTO");}
    }

    public static void main(String [] args)
    {
        int reps = in.nextInt();
        for(int iii = 0; iii < reps; iii++){casoDePrueba();}
    }
}
