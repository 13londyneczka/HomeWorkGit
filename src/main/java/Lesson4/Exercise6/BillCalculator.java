package Lesson4.Exercise6;

public class BillCalculator {

   public static double calculate(double bill, float serviceCharge){
       return bill + serviceCharge;

   }

   public static double calculate(double bill, float paymentForService, double discount){
       return bill * (1 - discount) + paymentForService;
   }

   public static double calculate(double bill, float paymentForService, short takeOutCharge){
       return bill + paymentForService + takeOutCharge;
   }

}
