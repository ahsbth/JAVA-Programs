
public class Wrapper {
    public static void main(String[] args) {
        int numInt = 42;
        System.out.println("Original int value: " + numInt);

        // int to Integer
        Integer numInteger = Integer.valueOf(numInt);
        System.out.println("int to Integer: " + numInteger);

        // Integer to String
        String numString = numInteger.toString();
        System.out.println("Integer to String: " + numString);

        // String to int
        int convertedInt = Integer.parseInt(numString);
        System.out.println("String to int: " + convertedInt);

        // int to String
        String convertedString = String.valueOf(numInt);
        System.out.println("int to String: " + convertedString);

        // String to Integer
        Integer convertedInteger = Integer.valueOf(convertedString);
        System.out.println("String to Integer: " + convertedInteger);

        // Integer to int
        int backToInt = convertedInteger.intValue();
        System.out.println("Integer to int: " + backToInt);
    }
}
