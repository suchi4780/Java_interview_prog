import java.util.Scanner;

public class SwapOfTwo2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        
        System.out.println("Befor swapping");
        System.out.println(" a= "+ a);
        System.out.println(" b= "+ b);

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("After swapping");
        System.out.println(" a= "+ a);
        System.out.println(" b= "+ b);
    }
}

/*
 Public class SwapOfTwo2{
 public static void main(String[] args){
 int a=10,b=20
 a=a+b;
 b=a-b;
 a=a-b;
  System.out.println(a);
        System.out.println(b);}
 }
 */
