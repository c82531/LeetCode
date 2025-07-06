public class MinSubArrayLen {
    public static int minSubArrayLen(int target, int[] nums) {
         int i = 0;
         int j = 0;
         int n = nums.length;
         int sum = 0;
         int min = Integer.MAX_VALUE;
         while (i < n && j < n){
             while (sum < target && j < n){
                 sum += nums[j++];
             }

             while (sum >= target){
                 min = Math.min(j - i, min);
                 sum -= nums[i++];
             }
         }
         return min == Integer.MAX_VALUE?0:min;
    }

    public static void main(String[] args) {
        int target = 11;
        int[] nums = {1,1,1,1,1,1,1,1};
        System.out.println(minSubArrayLen(target, nums));
    }
}
