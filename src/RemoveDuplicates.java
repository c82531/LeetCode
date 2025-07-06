import java.util.Arrays;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 1;
        int n = nums.length;
        while (i < n && j < n){
            if (nums[i] < nums[j]){
                nums[++i] = nums[j];
            }
            j++;
        }
//        System.out.println(Arrays.toString(nums));
        return i+1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
}
