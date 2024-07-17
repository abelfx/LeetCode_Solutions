class Solution {
    public int reverse(int x) {
        
        long reversed = 0;

        while(Math.abs(x)>0){
            int lastdig = x % 10;
            reversed +=lastdig;
            reversed = reversed * 10;
            x = x/10;
        }

        reversed = reversed/10;

        if(reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE){
            return 0;
        }

        if(x != Math.abs(x)) {
            reversed = (int)(-1 * reversed);
            
        }
        return (int) reversed;
        
    }
}