public class NumberOfOnes {

    public static void main(String[] args) {

        int change = change(6);
        System.out.println(change);


    }

    public static int change(int x) {

        int sum =0;
        while (x > 0){
            System.out.println(x & 0b1);
            sum += x & 1;
            x >>= 1;
        }
        return sum;
    }


}
