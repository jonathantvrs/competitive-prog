import java.util.Scanner;
import java.util.Locale;

public class Uri1008 {

    public static double salaryCalc(int workedHours, double hourValue) {
        return workedHours * hourValue;
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int employeeNumber = sc.nextInt();
        int workedHours = sc.nextInt();
        double hourValue = sc.nextDouble();

        double salary = salaryCalc(workedHours, hourValue);

        System.out.println("NUMBER = " + employeeNumber);
        System.out.printf("SALARY = U$ %.2f%n", salary);
    }
}