class Solution {
    public boolean checkDivisibility(int n) {

        int sum=0;
        int multiply= 1;
        int temp =n;

        while(temp>0){
            int digit = temp%10;
            sum += digit;
            multiply *= digit;
            temp = temp/10;

        }
        int total = sum+multiply;

       
        return n%total ==0;
    }
}