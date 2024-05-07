def longestPalindrome(self, s):
    chars = {}
    for c in s:
        if c not in chars:
            chars[c] = 1
        else:
            chars[c] += 1

    result = 0
    odd = 0
    for count in chars.values():
        if count > 1:
            if count % 2 == 0:
                result += count
            else:
                result += count - 1
                odd += 1
        else:
            odd += 1

    if odd > 0:
        result += 1

    return result



