import java.util.Scanner;
import java.util.Locale;

public class Uri1010 {
    public static double getValueToPayPerPiece(int quantity, double price) {
        return quantity * price;
    }
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int firstPieceCode = sc.nextInt();
        int firstPieceQuantity = sc.nextInt();
        double firstPiecePrice = sc.nextDouble();

        int secondPieceCode = sc.nextInt();
        int secondPieceQuantity = sc.nextInt();
        double secondPiecePrice = sc.nextDouble();

        double valueToPay = getValueToPayPerPiece(firstPieceQuantity, firstPiecePrice)
                + getValueToPayPerPiece(secondPieceQuantity, secondPiecePrice);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valueToPay);
    }
}