public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        s = s.trim();
        s = s.toLowerCase();
        int i = 0;
        int j = s.length()-1;
        boolean flag = true;
        while (i < j){
            while(i < s.length() && !Character.isLetter(s.charAt(i)) && !Character.isDigit(s.charAt(i))){
                i++;
            }
            while(j>=0 && !Character.isLetter(s.charAt(j)) && !Character.isDigit(s.charAt(j))){
                j--;
            }
            if (i<j && s.charAt(i) != s.charAt(j)){
                flag = false;
                break;
            }
            i++;
            j--;
        }
        return flag;
    }

    public static void main(String[] args) {
        String s = ".,";
        System.out.println(isPalindrome(s));
    }
}