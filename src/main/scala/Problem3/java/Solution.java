package Problem3.java;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int lengthOfLongestSubstring(String s) {

        if (s.isEmpty()) {
            return 0;
        }

        int max = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0, j = i; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                j = Math.max(j, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i + 1 - j);
        }

        return max;
    }
}
