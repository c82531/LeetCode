import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static List<String> summaryRanges(int[] nums) {
        int i = 0;
        int j = 0;
        int n = nums.length;
        List<String> res = new ArrayList<>();
        while (i < n && j < n){
            while (j < n - 1 && nums[j] + 1 == nums[j+1]){
                j++;
            }
            res.add(format(nums, i, j));
            i = ++j;
        }
        return res;
    }

    private static String format(int[] nums, int i, int j){
        if (i != j){
            return String.format("%d->%d", nums[i], nums[j]);
        }
        else {
            return String.valueOf(nums[i]);
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,4,5,7};
        System.out.println(summaryRanges(nums));
    }
}
