public class MaxArea {
    public static int maxArea(int[] height) {
        int i = 0;
        int j = height.length-1;
        int area = 0;
        while (i < j){
            int w = j-i;
            int tmp = 0;
            if (height[i] < height[j]){
                tmp = w * height[i];
                i++;
            }else {
                tmp = w * height[j];
                j--;
            }
            if (tmp > area){
                area = tmp;
            }
        }
        return area;
    }
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}
