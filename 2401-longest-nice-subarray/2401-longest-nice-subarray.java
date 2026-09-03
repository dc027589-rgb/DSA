class Solution {
    public int longestNiceSubarray(int[] nums) {

        int i=0;
        int j=0;
        int maxLen =0;
        int bits=0;
        
        while(j<nums.length){
            
            while((bits & nums[j]) != 0){
                bits ^= nums[i];
                
                i++;
            }
            bits |= nums[j];

            maxLen = Math.max(maxLen,j-i+1);

            j++;

                

            }
            return maxLen;

        
        
    }
}