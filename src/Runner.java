public class Runner {

    public static void main(String[] args) {
        Inputs i = new Inputs();

//        SpeedConverter.printConversion(1.5); //1
//        SpeedConverter.printConversion(10.25); //6
//        SpeedConverter.printConversion(-5.6); //invalid
//        SpeedConverter.printConversion(25.42); //16
//        SpeedConverter.printConversion(75.114); //47

//        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
//        MegaBytesConverter.printMegaBytesAndKiloBytes(-1024);
//        MegaBytesConverter.printMegaBytesAndKiloBytes(5000);

//        System.out.println(BarkingDog.shouldWakeUp(true, 1));
//        System.out.println(BarkingDog.shouldWakeUp(false, 2));
//        System.out.println(BarkingDog.shouldWakeUp(true, 8));
//        System.out.println(BarkingDog.shouldWakeUp(true, -1));

//        System.out.println(LeapYear.isLeapYear(-1600));
//        System.out.println(LeapYear.isLeapYear(1600));
//        System.out.println(LeapYear.isLeapYear(2017));
//        System.out.println(LeapYear.isLeapYear(2000));
//        System.out.println(LeapYear.isLeapYear(1924));

//        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175));
//        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176));
//        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0));
//        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123));

        System.out.println(EqualSumChecker.hasEqualSum(1,1,1));
        System.out.println(EqualSumChecker.hasEqualSum(1,1,2));
        System.out.println(EqualSumChecker.hasEqualSum(1,-1,0));
    }

}
