public class CreditPaymentService {
    public float calculate(double sum, double period, double percent) {
        double payment=(((percent / 1200 * (Math.pow((1 + percent / 1200), period))) / (Math.pow((1 + percent / 1200), period) - 1)) * sum);
        return (float) payment;
    }
}