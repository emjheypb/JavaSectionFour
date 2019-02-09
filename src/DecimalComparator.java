public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        num1 = (int)(num1 * 1000 / 1) / 1000d;
        num2 = (int)(num2 * 1000 / 1) / 1000d;

        return num1 == num2;
    }

}
