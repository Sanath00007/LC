class Solution {
    public String interpret(String command) {
        int c=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<command.length();i++){
            if(Character.isLetter(command.charAt(i)))
            {sb.append(command.charAt(i));c=0;}
            else if(command.charAt(i)=='('&&command.charAt(i+1)==')')sb.append('o');


        }
        return sb.toString();
    }
}