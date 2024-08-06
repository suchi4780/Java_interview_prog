import java.util.Scanner;
public class DuckNum {
    static boolean isDuckNumber(int num) {
        String numStr = Integer.toString(num);

        if (numStr.charAt(0) == '0') {
            return false;
        }

        return numStr.contains("0");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it's a Duck number: ");
        int number = sc.nextInt();

        if (isDuckNumber(number)) {
            System.out.println(number + " is a Duck number.");
        } else {
            System.out.println(number + " is not a Duck number.");
        }
    }
}

/*
  Duck number is a positive number which has zeroes present in it, 
  but there should be no zero present in the beginning of the number. 
  For example, 3210, 8050896 are Duck numbers, while 01203, 034, 0000 are not.
 */