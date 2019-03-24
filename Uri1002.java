import java.util.Scanner;
import java.util.Locale;

public class Uri1002 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double radius = sc.nextDouble();
        double pi = 3.14159;
        double area = pi * (Math.pow(radius, 2));

        System.out.printf("A=%.4f", area);
    }
}