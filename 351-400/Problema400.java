// Resuelto

import java.util.Scanner;

public class Problema400 {
    static Scanner in = new Scanner(System.in);
    public static void main (String [] args)
    {
        while(in.hasNextLine())
        {
            String camas = in.nextLine();
            int head = 0;
            int pos = 0;

            while((pos < camas.length()) && (camas.charAt(pos) == '.')){head++; pos++;}

            if(pos >= camas.length() - 1){System.out.println(head - 1);}
            else
            {
                int tail = 0;
                int max = head - 1;

                for(int i = pos + 1; i < camas.length(); i++)
                {
                    if(camas.charAt(i) == '.'){tail++;}
                    else
                    {
                        int aux = (tail - 1) / 2;
                        if (aux > max){max = aux;}
                        tail = 0;
                    }
                }

                if((tail - 1) > max){max = tail - 1;}
                System.out.println(max);
            }
        }
    }
}
