// Resuelto

import java.util.Scanner;

public class Problema564 {
    static Scanner in = new Scanner(System.in);

    public static void casoDePrueba()
    {
        int n = in.nextInt();
        int res = n / 3;
        System.out.println(res);
    }
    public static void main(String [] args)
    {
        int reps = in.nextInt();
        for(int i = 0; i < reps; i++){casoDePrueba();}
    }
}
