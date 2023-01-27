package Lesson4.Exercise6;

public class Calculator extends BillCalculator {
    public static void main(String[] args) {

        double bill = 50.0d;
        float paymentForService = 15.0f;
        double total = BillCalculator.calculate(bill, paymentForService);

        System.out.println("Wartość rachunku:" + total);

        double discount = 0.2d;
        total = BillCalculator.calculate(bill, paymentForService);

        System.out.println("Wartość rachunku ze zniżką:" + total);

        short takeOutCharge = 5;
        total = BillCalculator.calculate(bill, paymentForService, takeOutCharge);

        System.out.println("Wartość z opłatą za opakowania na wynos:" + total);
    }
}