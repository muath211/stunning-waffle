public class NonRepeatedCharacter {

    public static Character firstNonRepeatedCharacter(String str) {

        int[] charCount = new int[256];
        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)]++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (charCount[str.charAt(i)] == 1) {
                return str.charAt(i);
            }
        }
        return null;
    }
}

