import java.util.HashMap;
import java.util.Map;

class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

       
        Map<Character, Integer> targetMap = new HashMap<>();
        for (char c : t.toCharArray()) {
            targetMap.put(c, targetMap.getOrDefault(c, 0) + 1);
        }

        int required = targetMap.size(); 
        int formed = 0;                 
        Map<Character, Integer> windowMap = new HashMap<>();

        int left = 0, right = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        while (right < s.length()) {
            char c = s.charAt(right);
            windowMap.put(c, windowMap.getOrDefault(c, 0) + 1);

           
            if (targetMap.containsKey(c) && 
                windowMap.get(c).intValue() == targetMap.get(c).intValue()) {
                formed++;
            }

            
            while (left <= right && formed == required) {
                c = s.charAt(left);

                
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                
                windowMap.put(c, windowMap.get(c) - 1);
                if (targetMap.containsKey(c) && 
                    windowMap.get(c) < targetMap.get(c)) {
                    formed--;
                }

                left++;
            }

            right++;
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}