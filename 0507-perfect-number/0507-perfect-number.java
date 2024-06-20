import java.util.ArrayList;

class Solution {
    public boolean checkPerfectNumber(int num) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 1; i <= num/2; i++){
            if(num % i == 0){
                list.add(i);
            }
        }

        int sum = 0;

        for(Integer i: list){
            sum += i;
        }

        if(sum == num){
            return true;
        }

        return false;
        
    }
}