class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        for(int i = 0; i <= arr.length - 3; i++){
            boolean exists = false;
            if(arr[i]%2 != 0 && arr[i + 1]%2 != 0 && arr[i+2]%2 != 0){
                exists = true;
            }

            if(exists == true){
                return true;
            }
        }
        return false;  
    }
}