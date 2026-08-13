class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int n1= nums1.length;
       int n2 = nums2.length;
        int result[]= new int[n1+n2];
        int i=0,j=0,k=0;
       while(i<n1 && j<n2){
        if(nums1[i] <nums2[j]){
            result[k]=nums1[i];
          i++; 
          k++;

        }
        else{
            result[k]=nums2[j];
          j++;
          k++;
        }
       }
       while(i<n1){
        result[k]=nums1[i];
        i++;
        k++;
       }
       while(j<n2){
        result[k]=nums2[j];
       j++;
       k++;
       }
       int n= result.length;
          if(n%2==1){ //median formula for odd
        return result[n/2];

       }
       else{
        return(result[n/2-1]+result[n/2])/2.0;  // median for even
       }

    }
}