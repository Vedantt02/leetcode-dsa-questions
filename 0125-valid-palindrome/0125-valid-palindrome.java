class Solution {
    public boolean isPalindrome(String s) {
        // StringBuilder sb = new StringBuilder();
        // for (char c: s.toCharArray()) {
        //     if (Character.isLetterOrDigit(c)) {
        //         sb.append(Character.toLowerCase(c));
        //     }
        // }
        // String clean = sb.toString();
        // String reversed = sb.reverse().toString();
        // return clean.equals(reversed);



        // Optimized code:-
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left ++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}