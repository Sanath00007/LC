class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int[] a=new int[releaseTimes.length];int ind=0;
        a[0]=releaseTimes[0];
        int max=releaseTimes[0];
        for(int i=1;i<releaseTimes.length;i++){
            a[i]=releaseTimes[i]-releaseTimes[i-1];
            
        }int ind2=0,f=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                 
                max=a[i];
                
                ind=i;
            }else if (a[i] == max&&keysPressed.charAt(i) > keysPressed.charAt(ind))
              ind = i;
}
return keysPressed.charAt(ind);
        }
        
        
        
        
    }
