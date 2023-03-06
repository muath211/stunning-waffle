package tree;

import java.util.Arrays;

public class Dice {

    public static void main(String[] args) {
//        Solution.numRollsToTarget(1, 6, 3);
        int i = Solution.numRollsToTarget(30, 30, 500);
        System.out.println(i);
    }


    static class Solution {

        public static int numRollsToTarget(int n, int faces, int target) {
            int[][] mem = new int[n+1][target+1];

            for (int[] subarray : mem)
                Arrays.fill(subarray, -1);

            return hi(n, faces, target, mem);

    }

    public static int hi(int n, int faces, int target, int[][] mem) {



        if(n== 0 && target == 0){
            return 1;
        }


        if(n < 0 || target < 0){
            return 0;
        }

        if(mem[n][target] != -1){
            return mem[n][target];
        }



        int s = 0;
        for(int i= 1; i <= faces; i++){
            s = (s + hi(n - 1, faces, target - i, mem))%1000000007;
        }

        mem[n][target] = s;



        return s%1000000007;

    }
}

}
