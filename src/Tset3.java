public class Tset3 {

    public static void main(String[] args) {
        String acbdacbd = new Solution().solution("ACBDACBD");
        System.out.println(acbdacbd);

    }

    static class Solution {
        public String solution(String S) {
            // Implement your solution here
            if (S == null || S.isEmpty()) {
                return "";
            }
            for (int i = 0; i < S.length() - 1; ) {
                if ((S.charAt(i) == 'A' && S.charAt(i + 1) == 'B')
                        || (S.charAt(i) == 'B' && S.charAt(i + 1) == 'A')
                        || (S.charAt(i) == 'C' && S.charAt(i + 1) == 'D')
                        || (S.charAt(i) == 'D' && S.charAt(i + 1) == 'C')) {
                    S = S.substring(0, i) + S.substring(i + 2);
                    if (i - 1 >= 0) {
                        i -= 1;
                    }
                } else {
                    i++;
                }

            }
            return S;

        }
    }


}
