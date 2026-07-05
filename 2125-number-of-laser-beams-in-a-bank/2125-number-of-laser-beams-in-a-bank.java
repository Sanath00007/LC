class Solution {
    public int numberOfBeams(String[] bank) {
        int t=0,p=0;
        for(int j=0;j<bank.length;j++){
            char[] c=new char[bank.length];
            c=bank[j].toCharArray();
            int d=0;
            for(int i=0;i<c.length;i++){
                if(c[i]=='1')d++;
            }
            
            t+=d*p;
            if(d!=0)p=d;
        }
        return t;
    }
}