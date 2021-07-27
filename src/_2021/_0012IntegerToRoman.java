package _2021;

public class _0012IntegerToRoman {
    public static void main(String[] args) {
        System.out.println(intToRoman(3));
        System.out.println(intToRoman(4));
        System.out.println(intToRoman(9));
        System.out.println(intToRoman(58));
        System.out.println(intToRoman(1994));
    }

    public static String intToRoman(int num) {
        String result = "";
        int number = num;
        while (number != 0) {

            int n = num / 10;
        }

        return "";
    }

    public char integerToRoman(int num) {
        switch (num) {
            case 1: return 'I';
            case 5: return 'V';
            case 10: return 'X';
            case 50: return 'L';
            case 100: return 'C';
            case 500: return 'D';
            case 1000: return 'M';
        }
        return '\0';
    }
}
