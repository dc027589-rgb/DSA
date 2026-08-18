class Solution {
    public int maximumSum(int[] arr) {
        int n = arr.length;
        
        int noDelete = arr[0];
        int oneDelete = 0; 
        int maxOverall = arr[0];
        
        for (int i = 1; i < n; i++) {
            int x = arr[i];
            
        
            oneDelete = Math.max(noDelete, oneDelete + x);
            noDelete = Math.max(x, noDelete + x);
            
            maxOverall = Math.max(maxOverall, Math.max(noDelete, oneDelete));
        }
        
        return maxOverall;
    }
}