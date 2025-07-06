import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public static boolean wordPattern(String pattern, String s) {
        Map<Character, String> p2s = new HashMap<>();
        Map<String, Character> s2p = new HashMap<>();
        String[] words = s.split(" ");
        int n = pattern.length();
        int m = words.length;
        if(n != m){
            return false;
        }
        char ch;
        String word;
        for(int i = 0; i < n; i++){
            ch = pattern.charAt(i);
            word = words[i];
            if((p2s.containsKey(ch) && !p2s.get(ch).equals(word)) || (s2p.containsKey(word) && s2p.get(word) != ch)){
                return false;
            }
            p2s.put(ch, word);
            s2p.put(word, ch);
        }
        return true;
    }

    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        System.out.println(wordPattern(pattern, s));
    }
}
