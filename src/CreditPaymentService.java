public class CreditPaymentService {
    public int aPay(double percent, int credit, int years) {
        double monthPercent = percent / 12 / 100;
        int month = years * 12;
        double value = 1 + monthPercent;
        double degree = Math.pow(value, month);
        int result = (int) (credit * monthPercent * degree / (degree - 1));
        return result;
    }
}
