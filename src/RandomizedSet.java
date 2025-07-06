import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RandomizedSet {
    static int[] nums = new int[200010];
    Random random = new Random();
    Map<Integer, Integer> map = new HashMap<>();
    int idx = -1;
    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }
        nums[++idx] = val;
        map.put(val, idx);
        return true;
    }
    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        }
        int loc = map.remove(val);
        if (loc != idx) {
            map.put(nums[idx], loc);
        }
        nums[loc] = nums[idx--];
        return true;
    }
    public int getRandom() {
        return nums[random.nextInt(idx + 1)];
    }

    public static void main(String[] args) {
        RandomizedSet randomizedSet = new RandomizedSet();
        randomizedSet.insert(1); // 向集合中插入 1 。返回 true 表示 1 被成功地插入。
        System.out.println(randomizedSet.remove(2)); // 返回 false ，表示集合中不存在 2 。
        randomizedSet.insert(2); // 向集合中插入 2 。返回 true 。集合现在包含 [1,2] 。
        randomizedSet.getRandom(); // getRandom 应随机返回 1 或 2 。
        randomizedSet.remove(1); // 从集合中移除 1 ，返回 true 。集合现在包含 [2] 。
        randomizedSet.insert(2); // 2 已在集合中，所以返回 false 。
        randomizedSet.getRandom();
    }
}
