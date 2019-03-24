public class EntradaDeDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lê nome completo, quantidade de quartos na casa e preço do produto em linhas separadas
        String fullName = sc.nextLine();
        int qtBedrooms = sc.nextInt();
        double productPrice = sc.nextDouble();

        // Lê último nome, idade e altura da mesma linha
        String lastName = sc.next();
        int age = sc.nextInt();
        double height = sc.nextDouble();

        System.out.println(fullName);
        System.out.println(qtBedrooms);
        System.out.println(productPrice);

        System.out.println(lastName);
        System.out.println(age);
        System.out.println(height);

        sc.close();
    }
}