class Solution {
    public int largestAltitude(int[] gain) {

        int sum = 0;
        int max = -1;
        for(int i: gain){
            if( max < sum){
                max = sum;
            }
            sum += i;
        }

        if( max < sum){
                max = sum;
        }



        return max;
        
    }
}