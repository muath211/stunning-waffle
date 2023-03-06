import java.util.ArrayList;

public class MinChange {

    public static void main(String[] args) {

//        int change = change(32, new int[]{25, 10, 5, 1});
        int change = change(6, new int[]{1, 3, 4});
        System.out.println(change);


    }

    public static int change(int x, int[] coins) {
        if (x == 0) {
            return 0;
        }

        int min = x;
        for (int coin : coins) {
            if (x - coin >= 0) {
                int c = change(x - coin, coins);
                if (min > c + 1) {
                    min = c + 1;
                }
            }
        }
        return min;
    }


}
