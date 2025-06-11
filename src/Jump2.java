public class Jump2 {
    public static int jump(int[] nums) {
        int n = nums.length;
        int max = 0;
        int end = 0;
        int jump = 0;
        for (int i = 0; i < n-1; i++) {
            max = Math.max(max, nums[i]+i);
            if (i == end){
                jump++;
                end = max;
            }
        }
        return jump;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,3,1,1,4};
        System.out.println(jump(nums));
    }
}
