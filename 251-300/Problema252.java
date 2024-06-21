// Resuelto

import java.util.Scanner;

public class Problema252 {
    static Scanner in = new Scanner(System.in);

    public static void main (String [] args)
    {
        while (in.hasNextLine())
        {
            String s = in.nextLine();
            if(s.equals("XXX")){break;}
            else{s = s.toUpperCase().trim().replace(" ", "");}

            String res = "";

            for(int i = s.length() - 1; i >= 0; i--)
            {
                res += s.charAt(i);
            }

            if(res.equals(s)){System.out.println("SI");}
            else {System.out.println("NO");}
        }
    }
}
