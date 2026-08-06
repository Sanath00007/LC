class Solution {
    public int smallestNumber(int n, int t) {
        if(n%10==0)return n;
        while(n<101){
            int num=n;
            int p=1;
            while(num>0){
                int d=num%10;
                p*=d;
                num/=10;
            }
            if(p%t==0)return n;
            n++;
        }
        return n;
    }
}