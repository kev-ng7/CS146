import java.util.HashMap;

public class HW8 {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> chars = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (!chars.containsKey(c)) {
                chars.put(c, 1);
            } else {
                chars.put(c, chars.get(c) + 1);
            }
        }

        int result = 0;
        int odd = 0;
        for (int count : chars.values()) {
            if (count > 1) {
                if (count % 2 == 0) {
                    result += count;
                } else {
                    result += count - 1;
                    odd += 1;
                }
            } else {
                odd += 1;
            }
        }

        if (odd > 0) {
            result += 1;
        }
        return result;
    }
}
