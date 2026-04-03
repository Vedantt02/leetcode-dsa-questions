class Solution {
    public boolean isHappy(int n) {
        
        HashSet<Integer> found = new HashSet<>();

        while (n != 0 && ! found.contains(n)) {
            found.add(n);

            int Sum = 0;
            while (n > 0) {
                int digit = n % 10;
                Sum += digit * digit;
                n = n / 10;
            }
            n = Sum;
        }
        return n == 1;
    }
}