import java.util.Scanner;

public class Uri1007 {

    public static int diff(int a, int b, int c, int d) {
        return (a * b) - (c * d);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int diff = diff(a, b, c, d);

        System.out.println("DIFERENCA = " + diff);

    }
}