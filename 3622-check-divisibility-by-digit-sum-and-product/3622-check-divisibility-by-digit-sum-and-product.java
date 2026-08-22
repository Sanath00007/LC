class Solution {
    public boolean checkDivisibility(int n) {
        int s=0,p=1;
        int num=n;
        while(n>0){
            int d=n%10;
            s+=d;
            p*=d;
            n/=10;
        }
        return (num%(s+p)==0)?true:false;
    }
}