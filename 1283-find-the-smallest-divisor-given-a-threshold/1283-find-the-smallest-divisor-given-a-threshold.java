class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int l =1;
        int h =0;
      
        
        for(int num:nums){
            h = Math.max(num,h);
            
        }
          int ans =h;
        while(l<=h){
            int mid = l+(h-l)/2;
            int sum =0;
            for(int i=0;i<nums.length;i++){
                sum +=(int) Math.ceil((double)nums[i]/mid);
            }
                if(sum<=threshold){
                    h=mid-1;
                    ans= mid;

                }
                else{
                    l=mid+1;
                }
            }
        
        return ans;

    }
}