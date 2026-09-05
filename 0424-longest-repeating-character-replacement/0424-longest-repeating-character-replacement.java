class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int maxCount = 0;
        int maxLength = 0;
        int[] freq = new int[26];

        for (int h = 0; h < s.length(); h++) {
            char ch = s.charAt(h);
            freq[ch - 'A']++;
            maxCount = Math.max(maxCount, freq[ch - 'A']);

            
            while ((h - l + 1) - maxCount > k) {
                freq[s.charAt(l) - 'A']--;
                l++;
            }

            maxLength = Math.max(maxLength, h - l + 1);
        }

        return maxLength;
    }
}