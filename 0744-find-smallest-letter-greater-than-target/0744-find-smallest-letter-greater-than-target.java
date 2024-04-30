class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (letters[middle] <= target) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        if ( start < letters.length){
            return letters[start];
        }
        else {
            return letters[0];
        }
    }
}
