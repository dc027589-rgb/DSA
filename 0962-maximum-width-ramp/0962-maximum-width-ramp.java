class Solution {
    public int maxWidthRamp(int[] arr) {
       int pairs [][] = new int[arr.length][2];

       for(int i=0;i<arr.length;i++){
        pairs[i][0]=arr[i];
        pairs[i][1]=i;
       }

       Arrays.sort(pairs,(a,b) -> Integer.compare(a[0],b[0]));

       int minIndx= arr.length;
       int maxWidth = 0;

       for(int i=0;i<pairs.length;i++){

       
        int width = pairs[i][1]-minIndx;

        maxWidth = Math.max(width,maxWidth);
          minIndx= Math.min(minIndx,pairs[i][1]);
        
       }


       return maxWidth;

       

    


     
    }
}