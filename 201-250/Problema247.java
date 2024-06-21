// Resuelto

import java.util.Scanner;

public class Problema247 {
    static Scanner in;

    public static void main(String [] args)
    {
        in = new Scanner(System.in);
        while(in.hasNextLine())
        {
            int reps = in.nextInt();
            if(reps == 0){break;}
            int current = in.nextInt();
            boolean comprobar = true;

            for(int i = 1; i < reps; i++){
                int next = in.nextInt();
                if(current > next || current == next){comprobar = false;}
                current = next;
            }

            if(comprobar){System.out.println("SI");}
            else{System.out.println("NO");}
        }
    }
}