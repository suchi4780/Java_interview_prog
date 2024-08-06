import java.util.Scanner;
public class SunnyNum {
    static boolean isPerfectSquare(int num) {
        double sqrt = Math.sqrt(num);
        return (sqrt - Math.floor(sqrt) == 0);
    }

    static boolean isSunnyNumber(int num) {
        return isPerfectSquare(num + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check sunny number: ");
        int number = sc.nextInt();

        if (isSunnyNumber(number)) {
            System.out.println(number + " is a sunny number.");
        } else {
            System.out.println(number + " is not a sunny number.");
        }
    }
}


/* A sunny number is a number where the next consecutive number is a perfect square. For example,
 8 is a sunny number because 9 (8 + 1) is a perfect square (3 * 3). */