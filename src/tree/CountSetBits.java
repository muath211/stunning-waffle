package tree;

public class CountSetBits {
    public static int countOnes(int n) {
        int count = 0;
        while (n != 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 18; // binary representation is 10010
        int count = countOnes(n);
        System.out.println("Number of ones in binary representation of " + n + " is " + count);
    }
}
