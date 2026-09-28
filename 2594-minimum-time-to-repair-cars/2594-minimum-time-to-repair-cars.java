class Solution {
    public long repairCars(int[] ranks, int cars) {
        long l =0;
        long maxi =0;
        for(int i=0;i<ranks.length;i++){
            maxi=Math.max(ranks[i],maxi);

        }
        long h = maxi*cars*cars;
        long ans = h;
        while(l<=h){
            long m = l+(h-l)/2;

            if(canRepair(ranks,cars,m)){
                ans = m;
                h= m-1;

            }
            else{
                l= m+1;
            }
        }
        return ans;
    }
    private boolean canRepair(int[] ranks, int totalCars, long maxTimeAllowed) {
        long carsRepaired = 0;

        for (int rank : ranks) {
            
            carsRepaired += (long) Math.sqrt((double) maxTimeAllowed / rank);
            
            if (carsRepaired >= totalCars) {
                return true;
            }
        }

        return carsRepaired >= totalCars;
}
}