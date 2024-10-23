class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length + nums2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < nums1.length && j < nums2.length){
            if(nums1[i] <= nums2[j]){
                result[k] = nums1[i];
                i++;
            }else {
                result[k] = nums2[j];
                j++;
            }
            k++;
        }

        while( i < nums1.length) {
            result[k++] = nums1[i++];
        };

        while( j < nums2.length) {
            result[k++] = nums2[j++];
        }
        int resultLength = result.length;
        if(resultLength % 2 == 0){
            int first = resultLength/2 - 1;
            int second = resultLength/2;

            int final2 = result[first] + result[second];
            double answer = final2/2.0;

            return answer;
        }else {
            return result[resultLength/2];
        }
    }
}