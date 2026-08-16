class Solution {
    public int maxProduct(int[] nums) {
        int bestmin = nums[0];
        int bestmax = nums[0];
        int res =nums[0];
        for(int i=1;i<nums.length;i++){
            int v1 = nums[i];
            int v2 = bestmin*nums[i];
            int v3 = bestmax*nums[i];

            bestmin = Math.min(v1,Math.min(v2,v3));
            bestmax= Math.max(v1,Math.max(v2,v3));
            res = Math.max(res,bestmax);
        }
        return res;
    }
}