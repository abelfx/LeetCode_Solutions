class Solution {
    public int maximumCount(int[] array) {
        int positive = 0;
        int negative = 0;
        for(int i = 0; i < array.length; i++ ){
            if ( array[i] > 0){
                positive ++;
            }
            else if ( array[i] < 0){
                negative ++;
            }
        }

        if (positive >= negative){
            return positive;
        }
        return negative;
        
    }
}