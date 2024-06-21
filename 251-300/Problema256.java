// Resuelto

import java.util.Scanner;

public class Problema256 {
    static Scanner in = new Scanner(System.in);

    public static void main (String [] args)
    {
        while (in.hasNext())
        {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int res = 0;
            boolean cont = true;
            int p = 1;

            while((((a) != 0) || ((b) != 0) || ((c) != 0)) && cont)
            {
                int a_aux = a % 10;
                int b_aux = b % 10;
                int c_aux = c % 10;

                if(a_aux == b_aux){res += (a_aux * p);}
                else if (a_aux == c_aux){res += (a_aux * p);}
                else if (b_aux == c_aux){res += (b_aux * p);}
                else{cont = false;}

                a = a/10;
                b = b/10;
                c = c/10;
                p*=10;
            }

            if(cont){System.out.println(res);}
            else{System.out.println("RUIDO COSMICO");}
        }
    }
}
