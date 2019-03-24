import java.util.Scanner;

public class Uri1003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int value1 = sc.nextInt();
        int value2 = sc.nextInt();

        int sum = value1 + value2;

        System.out.println("SOMA = " + sum);

        sc.close();
    }
}