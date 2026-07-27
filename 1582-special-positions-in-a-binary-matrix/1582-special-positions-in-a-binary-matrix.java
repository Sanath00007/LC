class Solution {
    public int numSpecial(int[][] mat) {
        int[] r=new int[mat.length];
        int[] c=new int[mat[0].length];
        for(int i=0;i<mat.length;i++){
            int sum=0;
            for(int j=0;j<mat[i].length;j++){
                sum+=mat[i][j];
                
            }
            r[i]=sum;
            
        }
        for(int i=0;i<mat[0].length;i++){
           int sum=0;
            for(int j=0;j<mat.length;j++){
                sum+=mat[j][i];
            }
            c[i]=sum;
        }
        int s=0;
        for(int i=0;i<r.length;i++){
            for(int j=0;j<c.length;j++){
                if(mat[i][j]==1&&r[i]==1&&c[j]==1)s++;
            }

        }
        return s;
    }
}