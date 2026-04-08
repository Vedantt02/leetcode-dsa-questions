2299
class Solution:
    def strongPasswordCheckerII(self, password: str) -> bool:
        if len(password) < 8:
            return False

        special = "!@#$%^&*()-+"
        lowercase = uppercase = digit = special_char = False
        
        for i in range(len(password)):
            if password[i].islower():
                lowercase = True
            elif password[i].isupper():
                uppercase = True
            elif password[i].isdigit():
                digit = True
            elif password[i] in special:
                special_char = True
            if i > 0 and password[i] == password[i-1]:
                return False

        return lowercase and uppercase and digit and special_char