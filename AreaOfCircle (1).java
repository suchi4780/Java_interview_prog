
import java.util.*;
public class AreaOfCircle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Radius of the Circle:");
        double Radius = sc.nextDouble();

        double area = Math.PI*Math.pow(Radius, 2);

        System.out.println("The Area of the Circle:" +area);
        
    }
    
}
