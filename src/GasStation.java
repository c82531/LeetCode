public class GasStation {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        for (int i = 0; i < n; i++) {
            int remain = gas[i] - cost[i];
            int j = i;
            while (remain >= 0){
                j = (j+1) % n;
                remain = remain + gas[j] - cost[j];
                if (j == i){
                    return i;
                }
            }
            if (j < i){
                return -1;
            }else if (j > i){
                i = j;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] gas = new int[]{1,2,3,4,5};
        int[] cost = new int[]{3,4,5,1,2};
        System.out.println(canCompleteCircuit(gas, cost));
    }
}
