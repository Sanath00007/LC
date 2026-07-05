class Solution {
    public int numberOfBeams(String[] bank) {
        int t=0,p=0;
        for(int j=0;j<bank.length;j++){
            
            int d=0;
            for(int i=0;i<bank[j].length();i++){
                if(bank[j].charAt(i)=='1')d++;
            }
            
            t+=d*p;
            if(d!=0)p=d;
        }
        return t;
    }
}