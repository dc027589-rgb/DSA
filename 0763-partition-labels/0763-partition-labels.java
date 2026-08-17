class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] lastIndex = new int[26];
        
       
        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }
        
        List<Integer> result = new ArrayList<>();
        int start = 0;
        int maxBoundary = 0;
        
       
        for (int i = 0; i < s.length(); i++) {
            maxBoundary = Math.max(maxBoundary, lastIndex[s.charAt(i) - 'a']);
            
          
            if (i == maxBoundary) {
                result.add(i - start + 1);
                start = i + 1;
            }
        }
        
        return result;
    }
}