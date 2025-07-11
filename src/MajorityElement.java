public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int cand = nums[0], count = 1;
        for (int i = 1; i < nums.length; ++i) {
            if (cand == nums[i]) {
                ++count;
            }
            else if (--count == 0) {
                cand = nums[i];
                count = 1;
            }
        }
        return cand;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}
