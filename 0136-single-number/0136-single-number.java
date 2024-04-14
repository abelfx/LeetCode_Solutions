class Solution {
    public int singleNumber(int[] array) {
        for(int i = 0; i<array.length; i++){
            boolean duplicacy = false;
            for(int j = 0; j<array.length;j++){
                if( i != j && array[i] == array[j]){
                    duplicacy = true;
                    break;
                }
            }
            
            if(!duplicacy){
                return array[i];
            }
        } 
        return 0;   
    }
}