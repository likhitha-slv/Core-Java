package LeetCodeJava;

class StringToSubString {

    public static void main(String[] args) {
        String str = "babad";
        String max = "";

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {

                String s = str.substring(i, j);

                if (isPalindrome(s) && s.length() > max.length()) {
                    max = s;
                }
            }
        }

        System.out.println("Longest Palindrome: " + max);
    }

    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}