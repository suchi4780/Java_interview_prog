import java.util.Scanner;

public class ArmStrongNum {
    static boolean isArmstrongNumber(int num) {
        int Number = num;
        int numOfDigits = String.valueOf(num).length();
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numOfDigits);
            num /= 10;
        }

        return sum == Number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it's an Armstrong number: ");
        int number = sc.nextInt();

        if (isArmstrongNumber(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
        
   }
}
/*
 *An Armstrong number (also known as a narcissistic number or pluperfect number) for a given number of digits is an integer such that the sum of its digits each raised to the power of the number of digits is equal to the number itself. For example, 153 is an Armstrong number because 
* 153 = 1^3 + 5^3 + 3^3
 */