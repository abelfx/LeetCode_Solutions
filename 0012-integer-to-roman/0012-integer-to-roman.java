class Solution {
    public String intToRoman(int num) {
        int intValue[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String code[] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<intValue.length;i++) {
            while(num>=intValue[i]) {
                sb.append(code[i]);
                num=num-intValue[i];
            }
        }
        return sb.toString();
    }
}