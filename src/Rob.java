public class Rob {
    public static int rob(int[] nums) {
//        int n = nums.length;
//        int[][] dp = new int[n][2];
//        dp[0][1] = nums[0];
//        for (int i = 1; i < n; i++) {
//            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1]);
//            dp[i][1] = dp[i-1][0] + nums[i];
//        }
//
//        return Math.max(dp[n-1][0], dp[n-1][1]);

        int pass = 0;
        int rob = 0;
        for (int num : nums) {
            int tmp_pass = Math.max(pass, rob);
            int tmp_rob = pass + num;
            pass = tmp_pass;
            rob = tmp_rob;
        }
        return Math.max(pass, rob);
    }

    public static void main(String[] args) {
        int []nums = new int[]{1,2,3,1};
        System.out.println(rob(nums));
    }
}
