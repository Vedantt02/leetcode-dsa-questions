# class Solution:
#     def firstUniqChar(self, s: str) -> int:
#         freq = {}
#         for char in s:
#             freq[char] = freq.get(char, 0) + 1

        # for i in range(0, len(s)):
        #      if freq[s[i]] == 1:
        #         return i
        # return -1
from collections import Counter
class Solution:
    def firstUniqChar(self, s: str) -> int:
        freq = Counter(s)

        for i in range(0, len(s)):
            if freq[s[i]] == 1:
                return i
        return -1
