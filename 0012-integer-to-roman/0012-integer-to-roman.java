class Solution {
    public String intToRoman(int num) {
        
        StringBuilder sb=new StringBuilder();
            for(int i=0;i<num/1000;i++){
                sb.append('M');
            }
            num=num%1000;
            if(num/100==9){
                sb.append("CM");
                num%=100;
            }
            else if(num/100==4){
                sb.append("CD");
                num%=100;
            }
            else if(num>=500){
                sb.append("D");
                num-=500;
            }
            if(num<400){
                for(int i=0;i<num/100;i++)
                sb.append("C");
                num%=100;
            }


             if(num/10==9){
                sb.append("XC");
                num%=10;
            }
            else if(num/10==4){
                sb.append("XL");
                num%=10;
            }
            else if(num>=50){
                sb.append("L");
                num-=50;
            }
            if(num<40){
                for(int i=0;i<num/10;i++)
                sb.append("X");
                num%=10;
            }

            
            if(num==9){
                sb.append("IX");
                num%=10;
            }
            else if(num==4){
                sb.append("IV");
                num%=100;
            }
            else if(num>=5){
                sb.append("V");
                num-=5;
            }
            if(num<4){
                for(int i=0;i<num;i++)
                sb.append("I");
                num%=10;
            }
            return sb.toString();


            }

    }
