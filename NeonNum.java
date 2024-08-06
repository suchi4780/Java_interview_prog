import java.util.Scanner;

public class NeonNum {
    static boolean isNeonNumber(int num) {
        int square = num * num;
        int sum = 0;

        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it's a neon number: ");
        int number = sc.nextInt();

        if (isNeonNumber(number)) {
            System.out.println(number + " is a neon number.");
        } else {
            System.out.println(number + " is not a neon number.");
        }
        
        }
}
/*
  A sunny number is a number where the next consecutive number is a perfect square.
  For example, 8 is a sunny number because 9 (8 + 1) is a perfect square (3 * 3).
 */