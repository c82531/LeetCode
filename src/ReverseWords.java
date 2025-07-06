public class ReverseWords {
    public static String reverseWords(String s) {
        s = s.trim();
        String[] strArr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = strArr.length-1; i >= 0; i--) {
            String word = strArr[i];
            if (!word.equals("")){
                sb.append(word).append(" ");
            }
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String s = "a good   example";
        System.out.println(reverseWords(s));
    }
}
