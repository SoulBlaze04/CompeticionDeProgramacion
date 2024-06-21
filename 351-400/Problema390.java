// Resuelto

import java.util.Scanner;

public class Problema390 {
    static Scanner in = new Scanner(System.in);

    public static void main (String [] args)
    {
        int reps = in.nextInt();
        for(int iii = 0; iii < reps; iii++){casoDePrueba();}
    }

    public static void casoDePrueba()
    {
        int magenta = in.nextInt();
        int amarillo = in.nextInt();
        int cian = in.nextInt();

        String entry = in.next();
        // System.out.println("Entry" + entry.length());
        int count = 0;

        while((count < entry.length()) && (magenta >= 0) && (amarillo >= 0) && (cian >= 0))
        {
            char aux = entry.charAt(count);
            if(aux == 'M'){magenta--;}
            else if(aux == 'A'){amarillo--;}
            else if(aux == 'C'){cian--;}
            else if(aux == 'R'){magenta--; amarillo--;}
            else if(aux == 'V'){amarillo--; cian--;}
            else if(aux == 'L'){magenta--; cian--;}
            else if(aux == 'N'){magenta--; amarillo--; cian--;}
            count++;
            // System.out.println("Count: " + count);
        }

        if((magenta >= 0) && (amarillo >= 0) && (cian >= 0)){System.out.println("SI " + magenta + " " + amarillo + " " + cian);}
        else{System.out.println("NO");}
    }
}
