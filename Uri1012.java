import java.util.Scanner;

public class Uri1012 {
    public static double triangleRectArea(double a, double c) {
        return (a * c) / 2;
    }
    public static double circleArea(double c) {
        return 3.14159 * (Math.pow(c, 2));
    }
    public static double trapezeArea(double a, double b, double c) {
        return ((a + b) * c) / 2;
    }
    public static double squareArea(double b) {
        return b * b;
    }
    public static double rectArea(double a, double b) {
        return a * b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        System.out.printf("TRIANGULO: %.3f%n", triangleRectArea(a, c));
        System.out.printf("CIRCULO: %.3f%n", circleArea(c));
        System.out.printf("TRAPEZIO: %.3f%n", trapezeArea(a, b, c));
        System.out.printf("QUADRADO: %.3f%n", squareArea(b));
        System.out.printf("RETANGULO: %.3f%n", rectArea(a, b));
    }
}