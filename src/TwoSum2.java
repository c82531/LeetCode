import java.util.Arrays;

public class TwoSum2 {
    public static int[] towSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length-1;
        int sum = numbers[i] + numbers[j];
        while (sum != target){
            if (sum < target){
                i++;
            }else {
                j--;
            }
            sum = numbers[i] + numbers[j];
        }
        return new int[]{i+1,j+1};
    }

    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(towSum(numbers, target)));
    }
}
