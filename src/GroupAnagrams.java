import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        return new ArrayList<>(Arrays.stream(strs)
                .collect(Collectors.groupingBy(str -> {
                    int[] counter = new int[26];
                    for (int i = 0; i < str.length(); i++) {
                        counter[str.charAt(i) - 'a']++;
                    }
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < 26; i++) {
                        if (counter[i] != 0) {
                            sb.append((char) ('a' + i));
                            sb.append(counter[i]);
                        }
                    }
                    return sb.toString();
                })).values());
    }

    public static void main(String[] args) {
        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));
    }
}
