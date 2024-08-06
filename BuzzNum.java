import java.util.Scanner;

public class BuzzNum {
    static boolean isBuzzNumber(int num) {
        return (num % 7 == 0) || (num % 10 == 7);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's a Buzz number: ");
        int number = scanner.nextInt();

        if (isBuzzNumber(number)) {
            System.out.println(number + " is a Buzz number.");
        } else {
            System.out.println(number + " is not a Buzz number.");
        }
        
        scanner.close();
    }
}

/*
 A Buzz number is a number that is either divisible by 7 or ends with the digit 7. 
 For example, 14 and 17 are Buzz numbers because 14 is divisible by 7 and 17 ends with 7
 */