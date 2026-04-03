class Solution:
    def isHappy(self, n: int) -> bool:
        found = set()
        while n != 0 and n not in found:
            found.add(n)
        
            Sum = 0
            while n > 0:
                digit = n % 10
                Sum += digit * digit
                n = n // 10
            n = Sum

        return  n == 1