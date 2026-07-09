class Solution {
    public boolean isHappy(int k) {
       HashSet<Integer> set=new HashSet<>();
            int sum=k,n=0;
            while(sum!=1){
                n=sum;
                if(set.contains(n))return false;
                sum=0;
                set.add(n);
                while(n>0){
                    int d=n%10;
                    sum+=d*d;
                    n/=10;
                }
            }
            return true;
    }
}