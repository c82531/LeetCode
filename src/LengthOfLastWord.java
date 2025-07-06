public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        s = s.trim();
        int n = s.length();
        int l = 0;
        for (int i = n-1; i >= 0; i--) {
            if (s.charAt(i) == ' '){
                break;
            }
            l++;
        }
        return l;
    }

    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));
    }
}
