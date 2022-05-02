public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        // System.out.println("Введите сумму кредита ");
        double sum = 1_000_000;
        //System.out.println("Введите срок кредита ");
        double period = 36;
        //System.out.println("Введите %-ую ставку кредита ");
        double percent = 9.99;
        double payment = service.calculate(sum, period, percent);
        System.out.println("Сумма ежемесячного платежа: " + payment);
    }
}
