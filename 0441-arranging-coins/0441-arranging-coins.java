class Solution {
    public int arrangeCoins(int n) {
        int i=1;
        long num=0;
        while(num+i<=n){
            num+=i;
            i++;
        }
        return i-1;
        
    }
}