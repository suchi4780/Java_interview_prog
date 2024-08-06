public class factorial {

    public static long Factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; 
        } else {
            return n * Factorial(n - 1); 
        }
    }
    public static void main(String[] args) {
        int number = 10; 
        long fact = Factorial(number);
        System.out.println("Factorial of " + number + " is: " + fact);
    }
}
