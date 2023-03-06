public class TEst2 {

    public static void main(String[] args) {

//        String solution = new Solution().solution(5, 0, 2);
//        System.out.println(solution);
//        String solution = new Solution().solution(1, 2, 1);
        String solution = new Solution().solution(0, 0, 10);
        System.out.println(solution);
    }

    static class Solution {
        public String solution(int AA, int AB, int BB) {
            // Implement your solution here
            if (AA == 0 && AB == 0 && BB == 0) {
                return "";
            }
            if (AA != 0 && AB == 0 && BB == 0) {
                return "AA";
            }
            if (AA == 0 && AB == 0) {
                return "BB";
            }

            StringBuilder r = new StringBuilder();
            if (AB == 0 && AA > BB) {
                for (int i = 0; i < (AA - BB) + BB; i++) {
                    if (i % 2 == 0) {
                        r.append("AA");
                    } else {
                        r.append("BB");
                    }
                }
            } else if (AB == 0 && BB > AA) {
                for (int i = 0; i < (BB - AA) + AA; i++) {
                    if (i % 2 == 0) {
                        r.append("BB");
                    } else {
                        r.append("AA");
                    }

                }
            } else if (AB != 0) {
                for (int i = 0; i < AB; i++) {
                    r.append("AB");
                }
                if (AA > BB) {
                    for (int i = 0; i < (AA - BB) + BB; i++) {
                        if (i % 2 == 0) {
                            r.append("AA");
                        } else {
                            r.append("BB");
                        }
                    }
                } else if (BB > AA) {
                    for (int i = 0; i < (BB - AA) + AA; i++) {
                        if (i % 2 == 0) {
                            r.insert(0, "BB");
                        } else {
                            r.append("AA");
                        }
                    }
                } else {
                    for (int i = 0; i < BB + AA; i++) {
                        if (i % 2 == 0) {
                            r.insert(0, "BB");
                        } else {
                            r.append("AA");
                        }
                    }
                }


            }
            return r.toString();
        }
    }


}
