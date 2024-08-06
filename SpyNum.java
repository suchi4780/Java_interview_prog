import java.util.Scanner;

public class SpyNum {
    static boolean isSpyNumber(int num) {
        int sum = 0;
        int product = 1;
        int temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }

        return sum == product;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's a Spy number: ");
        int number = scanner.nextInt();

        if (isSpyNumber(number)) {
            System.out.println(number + " is a Spy number.");
        } else {
            System.out.println(number + " is not a Spy number.");
        }
    }
}


/*
 A Spy number is a number where the sum of its digits equals the product of its digits.
  For example, 1124 is a Spy number because the sum of its digits (1 + 1 + 2 + 4 = 8) 
  is equal to the product of its digits (1 * 1 * 2 * 4 = 8).
 */