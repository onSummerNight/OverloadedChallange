public class Main {
    public static void main(String[] args) {
        System.out.println("Convert result is :" + convertToCentimeters(25));
        System.out.println("Convert result is :" + convertToCentimeters(5,8));

    }

    public static double convertToCentimeters(int onInches){
        double convertResult = (double) onInches * 2.54;
        return convertResult;
    }

    public static double convertToCentimeters(int onFeet, int onInches){
        double convertResult = (double) (onFeet * 12 ) + (onInches * 2.54);
        return convertResult;
    }
}
