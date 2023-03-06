// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(int[] A, int F, int M) {
        // Implement your solution here


        int sum =0;
        for (int i = 0; i < A.length; i++){
            sum += A[i];
        }

        String s =  ss(A, F, M, sum, "", F);

        if(s == null){
            return new int[]{0};
        }

        int [] res = new int[F];
        int c = 0;

        for (char r : s.toCharArray()){
            res[c] = Integer.parseInt(r+"");
            c++;

        }
        return res;
    }

    public String ss(int[] A, int F, int M, int sum, String k, int l) {
        // Implement your solution here

        if(((sum + 0.1 - 0.1) / (A.length + l)) == M && F == 0){
            System.out.println(sum + ";hoho;" + k + ";;"+ (A.length + l));
            return k;
        }

        if(F <= 0){
            return "";
        }

        System.out.println(sum + ";;" + k + ";;"+ F);

        for (int j =1; j<= 6; j++) {
            String trt = ss(A, F - 1, M, sum + j, k + j, l);
            if(trt != null && !trt.isEmpty()){
                return trt;
            }
        }

        return null;
    }
}
