public class IDCardNumber {
    private static int getLetterValue(char letter) {
        char[] characters = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
                'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
                'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        for (int i = 0; i < characters.length; i++) {
            if (letter == characters[i]) {
                return i;
            }
        }

        return -1;
    }

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

    private static boolean isValid2(String number) {
        number = number.toUpperCase().trim().replaceAll("\\s+", "");
        Integer controlDigit = getLetterValue(number.charAt(3));

        int controlSum = getLetterValue(number.charAt(0)) * 7 +
                         getLetterValue(number.charAt(1)) * 3 +
                         getLetterValue(number.charAt(2)) +
                         getLetterValue(number.charAt(4)) * 7 +
                         getLetterValue(number.charAt(5)) * 3 +
                         getLetterValue(number.charAt(6)) +
                         getLetterValue(number.charAt(7)) * 7 +
                         getLetterValue(number.charAt(8)) * 3;

        return controlSum % 10 == controlDigit;
    }

    private static boolean isValid3(String number) {
        number = number.toUpperCase().trim().replaceAll("\\s+", "");
        Integer controlDigit = Character.getNumericValue(number.charAt(3));
        char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        int sum = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if(number.charAt(i) == alphabet[j]) {
                    int charValue = j+10;
                    switch (i) {
                        case 0:
                            sum += charValue * 7;
                            break;
                        case 1:
                            sum += charValue * 3;
                            break;
                        case 2:
                            sum += charValue;
                            break;
                    }
                }
            }
        }

        for (int i = 4; i < 9; i++) {
            switch (i) {
                case 4:
                    sum += Character.getNumericValue(number.charAt(i)) * 7;
                    break;
                case 5:
                    sum += Character.getNumericValue(number.charAt(i)) * 3;
                    break;
                case 6:
                    sum += Character.getNumericValue(number.charAt(i));
                    break;
                case 7:
                    sum += Character.getNumericValue(number.charAt(i)) * 7;
                    break;
                case 8:
                    sum += Character.getNumericValue(number.charAt(i)) * 3;
                    break;
            }
        }

        return sum % 10 == controlDigit;
    }

    public static void main(String[] args) {
        String number = "ABS 123456";
        System.out.println("Is " + number + " valid? " + isValid(number));
        System.out.println("Is " + number + " valid? " + isValid2(number));
        System.out.println("Is " + number + " valid? " + isValid3(number));
    }
}
