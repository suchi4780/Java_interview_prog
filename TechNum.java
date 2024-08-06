import java.util.Scanner;

public class TechNum {
    static boolean isTechNumber(int num) {
        String numStr = Integer.toString(num);
        int length = numStr.length();

        if (length % 2 != 0) {
            return false;
        }

        int firstHalf = Integer.parseInt(numStr.substring(0, length / 2));
        int secondHalf = Integer.parseInt(numStr.substring(length / 2));

        int sum = firstHalf + secondHalf;
        return (sum * sum) == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it's a Tech number: ");
        int number = sc.nextInt();

        if (isTechNumber(number)) {
            System.out.println(number + " is a Tech number.");
        } else {
            System.out.println(number + " is not a Tech number.");
        }
        
    }
}

/*
 
A Tech number (or Technumber) is a number with an even number of digits that can be 
split into two equal halves, and the sum of these halves squared is equal to the original number.
 For example, 2025 is a Tech number because splitting it into two halves 
 (20 and 25) and adding them (20 + 25 = 45) and squaring the result (45^2 = 2025) yields the original number.
 */