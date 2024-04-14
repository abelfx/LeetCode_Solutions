class Solution {
    public int[] sortArray(int[] array) {
        int arraylength = array.length;
        int middle = arraylength/2;
        
        if (arraylength == 1) return array;
        
        int[] leftarray = new int[middle];
        int[] rightarray = new int[arraylength - middle];
        
        for(int i = 0; i < middle; i++){
            leftarray[i] = array[i];
        }
        for(int i = middle; i<array.length; i++){
            rightarray[i - middle] = array[i];
        }
        
        sortArray(leftarray);
        sortArray(rightarray);
        
        int leftlength = leftarray.length;
        int rightlength = rightarray.length;
        
        int i = 0, j = 0, k = 0;
        
        while(i < leftlength && j  < rightlength){
            if (leftarray[i] < rightarray[j]){
                array[k] = leftarray[i];
                i++;
            }
            else {
                array[k] = rightarray[j];
                j++;
            }
            k++;
        }
        
        while(i<leftlength){
            array[k] = leftarray[i];
            i++;
            k++;
        }
         while(j<rightlength){
            array[k] = rightarray[j];
            j++;
            k++;
        }
        
        return array;
        
    }
    
}