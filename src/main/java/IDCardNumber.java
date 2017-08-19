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
                case 7:
                    sum += Character.getNumericValue(number.charAt(i)) * 7;
                    break;
                case 5:
                case 8:
                    sum += Character.getNumericValue(number.charAt(i)) * 3;
                    break;
                case 6:
                    sum += Character.getNumericValue(number.charAt(i));
                    break;
            }
        }

        return sum % 10 == controlDigit;
    }

    private static boolean validateId(String idNumber) {

        if (idNumber.length() != 9) {
            return false;
        }

        for (int i = 0; i< 3; i++) {
            int temp = idNumber.charAt(i);
            if (temp < 65 && temp > 90) {
                return false;
            }
        }

        for (int i=3; i < 9; i++) {
            int temp = idNumber.charAt(i);
            temp -= 48;
            if(temp < 0 && temp > 9) {
                return false;
            }
        }


        return true;
    }

    public static void main(String[] args) {
        String number = "ABS123456";
        System.out.println("Is " + number + " valid? " + validateId(number));
        System.out.println("Is " + number + " valid? " + isValid(number));
        System.out.println("Is " + number + " valid? " + isValid2(number));
        System.out.println("Is " + number + " valid? " + isValid3(number));
    }
}
