import java.util.Scanner;

public class Uri1012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        System.out.printf("TRIANGULO: %.3f%n", (a*c)/2);
        System.out.printf("CIRCULO: %.3f%n", 3.14159 * (Math.pow(c, 2)));
        System.out.printf("TRAPEZIO: %.3f%n", ((a+b)*c)/2);
        System.out.printf("QUADRADO: %.3f%n", b*b);
        System.out.printf("RETANGULO: %.3f%n", a*b);
    }
}
