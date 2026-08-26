class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int i=0;
        int j=0;
        int k=0;
        int res[]= new int[n1+n2];
        while(i<n1 && j<n2){
            if(nums1[i]<nums2[j]){
                res[k]= nums1[i];
                i++;
                k++;
            }
            else{
                res[k]=nums2[j];
                j++;
                k++;
            }
        }
            while(i<n1){
                res[k]=nums1[i];
                i++;
                k++;
            }
             while(j<n2){
                res[k]=nums2[j];
                j++;
                k++;
            }

        
        int n= res.length;
       
            if(n%2 == 1){
                return res[n/2];
            }
           
        else{
            return (res[n/2-1]+res[n/2])/2.0;
        }


    }
}