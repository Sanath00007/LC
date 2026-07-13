class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int[][] arr=new int[strs.length][26];
        List<List<String>>list=new ArrayList<>();

        for(int i=0;i<strs.length;i++){
            for(int j=0;j<strs[i].length();j++){
                arr[i][strs[i].charAt(j)-'a']++;
            }    
        }
        int k=0;
        int[] f=new int[strs.length];
        for(int i=0;i<strs.length;i++){
            if(f[i]==1)continue;
            List<String> l=new ArrayList<>();
            l.add(strs[i]);
            f[i]=1;

            for(int j=i+1;j<arr.length;j++){
                if(f[j]==0&&Arrays.equals(arr[i],arr[j])){
                    l.add(strs[j]);
                    f[j]=1;
                }
            }
            list.add(l);

        }
        return list;

    }
}