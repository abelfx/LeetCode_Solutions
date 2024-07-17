class Solution {
    public boolean isSameAfterReversals(int num) {
        if(num == reverse(reverse(num))){
            return true;
        }

        return false;
        
    }

    public int reverse(int num){
        int reversed = 0;
        while(num != 0){
            reversed = reversed * 10 + num % 10;
            num = num/10;
        }
        return reversed;
    }
}