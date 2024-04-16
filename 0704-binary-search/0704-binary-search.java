class Solution {
    public int search(int[] array, int target) {
        int low = 0;
        int high = array.length -1;
        while (low <= high) {
            int middle = low + (high - low)/2;
            if (array[middle] == target){
                return middle;
            }
            else if (array[middle] > target){
                high = middle - 1;
            }
            else if (array[middle] < target){
                low = middle + 1;
            }
        }
        return -1;
        
    }
}