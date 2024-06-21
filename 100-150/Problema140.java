// Resuelto

import java.util.Scanner;
import java.util.Stack;

public class Problema140 {
    static Scanner in = new Scanner(System.in);
    public static void main (String [] args)
    {
        while (in.hasNext())
        {
            Stack<Integer> pila = new Stack<Integer>();
            int n = in.nextInt();
            if(n < 0){break;}
            String res = "";
            int sum = 0;

            while(n/10 > 0)
            {
                pila.push(n%10);
                n /= 10;
            }
            pila.push(n%10);

            while(!pila.isEmpty())
            {
                int aux = pila.pop();
                sum += aux;
                res += aux;
                if(!pila.isEmpty()){res += " + ";}
            }

            res += " = ";
            System.out.println(res + sum);
        }
    }
}
