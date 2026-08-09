class Solution {
    public int subtractProductAndSum(int n) {
        int s=0;
        int p=1;
        while(n>0){
            int d=n%10;
            p*=d;
            s+=d;
            n/=10;
        }
        return p-s;
    }
}