public class IDCardNumber {
    private static boolean isValid(String number) {
        number = number.toUpperCase().trim().replaceAll("\\s+", "");
        Integer controlDigit = Character.getNumericValue(number.charAt(3));
        int asciiStep = 55;

        int controlSum = (((int) number.charAt(0)) - asciiStep) * 7 +
                (((int) number.charAt(1)) - asciiStep) * 3 +
                (((int) number.charAt(2)) - asciiStep) +
                Character.getNumericValue(number.charAt(4)) * 7 +
                Character.getNumericValue(number.charAt(5)) * 3 +
                Character.getNumericValue(number.charAt(6)) +
                Character.getNumericValue(number.charAt(7)) * 7 +
                Character.getNumericValue(number.charAt(8)) * 3;

        return controlSum % 10 == controlDigit;
    }

    public static void main(String[] args) {
        String number = "ABS 123456";
        System.out.println("Is " + number + " valid? " + isValid(number));
    }
}
