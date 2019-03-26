public class ContaBancaria {
    private double saldo;

    public ContaBancaria() {
        this.saldo = 0;
    }
    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }
    public double getSaldo() {
        return this.saldo;
    }
    public void getMoney(double money) {
        this.saldo = saldo - money;
    }
    public void putMoney(double money) {
        this.saldo = saldo + money;
    }

    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();
        System.out.println(conta1.getSaldo());
        conta1.putMoney(2100.00);
        System.out.println(conta1.getSaldo());
        conta1.getMoney(1500.00);
        System.out.println(conta1.getSaldo());
    }
}
