import java.util.Scanner;

public class SmithNum {
    static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    static int sumOfPrimeFactors(int num) {
        int sum = 0;
        int originalNum = num;

        for (int i = 2; i * i <= num; i++) {
            while (num % i == 0) {
                sum += sumOfDigits(i);
                num /= i;
            }
        }
        
        if (num > 1 && num != originalNum) {
            sum += sumOfDigits(num);
        }
        
        return sum;
    }

    static boolean isSmithNumber(int num) {
        int sumOriginal = sumOfDigits(num);
        int sumFactors = sumOfPrimeFactors(num);
        
        return sumOriginal == sumFactors;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's a Smith number: ");
        int number = scanner.nextInt();

        if (isSmithNumber(number)) {
            System.out.println(number + " is a Smith number.");
        } else {
            System.out.println(number + " is not a Smith number.");
        }
        
        scanner.close();
    }
}

/*
 A Smith number is a composite number for which the sum of its digits is 
 equal to the sum of the digits of its prime factors, excluding 1 (since it's a composite number). 
 For example, 85 is a Smith number because its prime factors are 5 and 17, and 8+5=5+1+7=13.
 */