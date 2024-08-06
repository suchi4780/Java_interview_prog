import java.util.Scanner;

public class PetersonNum {
    static int factorial(int digit) {
        int factorial = 1;
        for (int i = 1; i <= digit; i++) {
            factorial *= i;
        }
        return factorial;
    }

    static boolean isPetersonNumber(int num) {
        int Number = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }

        return sum == Number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it's a Peterson number: ");
        int number = sc.nextInt();

        if (isPetersonNumber(number)) {
            System.out.println(number + " is a Peterson number.");
        } else {
            System.out.println(number + " is not a Peterson number.");
        }
    }
}
/*
 A Peterson number (or a Krishnamurthy number) is a number in which the sum of the factorials
  of each digit equals the number itself. For example, 145 is a Peterson number because 
1! + 4! + 5! = 1 + 24 + 120 = 145.
 */