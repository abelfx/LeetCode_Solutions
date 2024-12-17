class Solution {
    public void sortColors(int[] nums) {
        
        Sort(nums);
    }
    
    private void Sort(int[] array){
        
        int length = array.length;
        if(length <= 1){
return;}
        int middle = array.length/2;
        int right = length - middle;
        
        int[] leftArray = new int[middle];
        int[] rightArray = new int[right];
        
        int i = 0;
        int j = 0;
        
        while( i<length){
            if(i < leftArray.length){
                leftArray[i] = array[i];
            }else {
                rightArray[j] = array[i];
                j++;
            }
            i++; 
        }
        
        Sort(leftArray);
        Sort(rightArray);
        merger(leftArray, rightArray, array);
    }
    
    
        private void merger(int[] leftArray, int[] rightArray, int[] array){
          int leftLength = leftArray.length;
          int rightLength = rightArray.length;
          
          int l = 0;
          int r = 0;
          int j = 0;
          while(l < leftLength && r < rightLength){
              if(leftArray[l] < rightArray[r]){
                  array[j] = leftArray[l];
                  l++;
              }else {
                  array[j] = rightArray[r];
                  r++;
              }
              j++;
          }
            
          while( l < leftLength){
              array[j] = leftArray[l];
              j++;
              l++;
          }
          
          while( r < rightLength){
              array[j] = rightArray[r];
              j++;
              r++;
          }
        }
}