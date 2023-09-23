class Solution {
    // function to return sum of  1, 2, ... n
    long seriesSum(int n) {
        // code here
        long num=1;
        if(n==1){
            return 1;
        }
        return n*(n+1L)/2;
    }
}