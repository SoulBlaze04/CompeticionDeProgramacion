// Resuelto

import java.util.Scanner;

public class Problema397 {
    static Scanner in = new Scanner(System.in);

    public static void main (String [] args)
    {
        int reps = in.nextInt();
        for(int iii = 0; iii < reps; iii++)
        {
            casoDePrueba();
        }
    }

    public static void casoDePrueba()
    {
        int n = in.nextInt();

        if(n%3 == 1){System.out.println("NO");}
        else{System.out.println("SI");}
    }
}
