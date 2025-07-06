public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        if (s.equals("")){
            return true;
        }
        if (t.equals("")){
            return false;
        }
        int j = 0;
        boolean flag = false;
        for (int i = 0; i < s.length(); i++) {
            char cs = s.charAt(i);
            flag = false;
            for (; j < t.length(); j++) {
                char ct = t.charAt(j);
                if (cs == ct){
                    j++;
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }
}
