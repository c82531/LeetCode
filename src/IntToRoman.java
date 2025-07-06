public class IntToRoman {
    private static final String[][] R = new String[][]{
            {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"}, // 个位
            {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"}, // 十位
            {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"}, // 百位
            {"", "M", "MM", "MMM"}, // 千位
    };

    public static String intToRoman(int num) {
        return R[3][num / 1000] + R[2][num / 100 % 10] + R[1][num / 10 % 10] + R[0][num % 10];
    }

    public static void main(String[] args) {

    }
}
