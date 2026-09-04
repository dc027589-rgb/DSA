class Solution {
    private boolean isPossible(int [] weights, int days,int mid){
        int day =1;
        int curr = 0;
        for(int w: weights){
            if(curr+w >mid){
                day++;
                curr =w;
            }
            else{
                curr += w;
            }
        }
        return day <= days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int l=0;
        int r = 0;
        
        for(int i=0;i<weights.length;i++){
            l= Math.max(weights[i],l);
          r +=weights[i];


        }
        while(l<r){
            int mid = l+(r-l)/2;
            if(isPossible(weights,days,mid)){
                r= mid;
            }
            else{
                l=mid+1;
            }


        }
        return l;

        
    }
}