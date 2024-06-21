// Resuelto

import java.util.Scanner;

public class Problema373
{    
    static Scanner in;

    public static void casoDePrueba()
    {
        long dim = in.nextLong();

        long newDim = dim - 2;
        long res = (dim*dim*dim) - (newDim*newDim*newDim);
        System.out.println(res);
        
    }

    public static void main(String [] args)
    {
        in = new Scanner(System.in);
        int reps = in.nextInt();

        for (int i = 0; i < reps; i++)
        {
            casoDePrueba();
        }
    }
}
