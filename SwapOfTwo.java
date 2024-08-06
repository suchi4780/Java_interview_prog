//Swap of two numbers using temporary variable
import java.util.Scanner;

public class SwapOfTwo {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number:");
        int a=sc.nextInt();
        System.out.println("Enter Second Number:");
        int b=sc.nextInt();
        int temp;

        System.out.println("Before Swapping");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        temp=a;
        a=b;
        b=temp;

        System.err.println("AfternSwapping");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

        }

        /*public class swap {
    public static void main(String[] args) {
        int a=10,b=20;
        int temp;
         temp=a;
         a=b;
         b=temp;
         System.out.println(a);
         System.out.println(b);
    }
    
}*/

