class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int minSum= 0;
        int maxSum = 0;
        int currentMax= 0; 
        int currentMin =0;
        for(int x: nums){
            currentMax = Math.max(x,currentMax+x);
            maxSum = Math.max(currentMax,maxSum);
            currentMin = Math.min(x,currentMin+x);
            minSum = Math.min(currentMin,minSum);
        }

        return Math.max(maxSum,Math.abs(minSum));



    }
}