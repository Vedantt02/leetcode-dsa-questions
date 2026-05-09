class Solution:
    def isLongPressedName(self, name: str, typed: str) -> bool:

        i = 0   # pointer for name
        j = 0   # pointer for typed

        while j < len(typed):

            # characters match
            if i < len(name) and name[i] == typed[j]:
                i += 1
                j += 1

            # long press case
            elif j > 0 and typed[j] == typed[j - 1]:
                j += 1

            # invalid character
            else:
                return False

        # all characters of name must be used
        return i == len(name)