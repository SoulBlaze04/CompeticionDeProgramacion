// Resuelto

import java.util.Scanner;

public class Problema635
{
    static Scanner in;

    public static void casoDePrueba()
    {
        int year = in.nextInt();
        int century = year/100;
        int aux = year%100;
        if(aux != 0){century++;}
        System.out.println(century);
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