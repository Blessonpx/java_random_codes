class Solution {
    // function to return sum of  1, 2, ... n
    long seriesSum(int n) {
        // code here
        long num=1;
        if(n==1){
            return 1;
        }
        for(int i=2;i<n+1;i++){
            num=num+i;
        }
        return num;
    }
}