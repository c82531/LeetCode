import java.util.ArrayList;
import java.util.List;

public class WordBreak {
    public static boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        boolean [] dp = new boolean[n+1];
        dp[0] = true;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n+1; j++) {
                if (dp[i] && wordDict.contains(s.substring(i,j))){
                    dp[j] = true;
                }
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        String s = "aaaaaaa";
        List<String> wordDict = new ArrayList<>(List.of("aaaa","aaa"));
        System.out.println(wordBreak(s, wordDict));
    }
}
