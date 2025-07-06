import java.util.HashMap;

public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c: ransomNote.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        for(char c: magazine.toCharArray()){
            if (map.containsKey(c)){
                int times = map.get(c) - 1;
                if (times > 0){
                    map.put(c, times);
                }else {
                    map.remove(c);
                }
            }
        }
        if (map.keySet().isEmpty()){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";
        System.out.println(canConstruct(ransomNote, magazine));
    }
}
