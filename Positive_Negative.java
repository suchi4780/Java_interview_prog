import java.util.Scanner;
public class Positive_Negative {
    public static void main(String[] args) {
        int number;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number:");
        number=sc.nextInt();

        if(number>0){
            System.out.println("The number is positive");
        }
        else if(number<0){
            System.out.println("The number is negative");
            }
            else{
                System.out.println("The number is zero");
                }
    }
}
