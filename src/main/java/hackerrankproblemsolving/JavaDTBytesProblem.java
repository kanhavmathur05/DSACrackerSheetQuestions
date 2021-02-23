package hackerrankproblemsolving;

import java.util.Scanner;

public class JavaDTBytesProblem {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        long number[]=new long[n];
        for(i=0;i<n;i++)
        {
            number[i]=sc.nextLong();
        }
        for (i = 0; i < n; i++) {
            try {
                System.out.println("x can be fitted in:");
                if (number[i] >= Byte.MIN_VALUE && number[i] <= Byte.MAX_VALUE) {
                    System.out.println("*Byte");
                }
                if (number[i] >= Short.MIN_VALUE && number[i] <= Short.MAX_VALUE) {
                    System.out.println("*Float");
                }
                if (number[i] >= Integer.MIN_VALUE && number[i] <= Integer.MAX_VALUE) {
                    System.out.println("*Integer");
                }
                if (number[i] >= Long.MIN_VALUE && number[i] <= Long.MAX_VALUE) {
                    System.out.println("*Long");
                }
            } catch (Exception e) {
                System.out.println(sc.next()+"can't be fitted anywhere");
            }
        }
        sc.close();

    }
}
