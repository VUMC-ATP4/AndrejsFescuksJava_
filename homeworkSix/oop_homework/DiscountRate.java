package homeworkSix.oop_homework;

public class DiscountRate {
    private static double serviceDiscountPremium = 0.2;
    private static double serviceDiscountGold = 0.15;
    private static double serviceDiscountSilver = 0.1;
    private static int serviceDiscountNonCustomer = 0;

    private static double productDiscountPremium = 0.1;
    private static double productDiscountGold = 0.1;
    private static double productDiscountSilver = 0.1;
    private static double productDiscountNonCustomer = 0;

    public static double getServiceDiscountPremium() {
        return serviceDiscountPremium;
    }

    public static double getServiceDiscountGold() {
        return serviceDiscountGold;
    }

    public static double getServiceDiscountSilver() {
        return serviceDiscountSilver;
    }

    public static int getServiceDiscountNonCustomer() {
        return serviceDiscountNonCustomer;
    }

    public static double getProductDiscountPremium() {
        return productDiscountPremium;
    }

    public static double getProductDiscountGold() {
        return productDiscountGold;
    }

    public static double getProductDiscountSilver() {
        return productDiscountSilver;
    }

    public static double getProductDiscountNonCustomer() {
        return productDiscountNonCustomer;
    }
}
