import java.util.Arrays;

public class ProductExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        ans[n-1] = nums[n-1];
        for (int i = n-2; i >= 0; i--) {
            ans[i] = nums[i] * ans[i+1];
        }
        ans[0] = ans[1];
        int tmp = nums[0];
        for (int i = 1; i < n-1; i++) {
            ans[i] = tmp * ans[i+1];
            tmp = tmp * nums[i];
        }
        ans[n-1] = tmp;
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}
