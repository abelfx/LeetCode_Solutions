class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        	HashSet<Integer> set1 = new HashSet<>();
		HashSet<Integer> set2 = new HashSet<>();
		
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		ArrayList<List<Integer>> result = new ArrayList<>();
		
		for(int i: nums1) {
			set1.add(i);
		}
		for(int i: nums2) {
			set2.add(i);
		}
		
		for(Integer i: set1) {
			if(!set2.contains(i)) {
				list.add(i);
			}
		}
		for(Integer i: set2) {
			if(!set1.contains(i)) {
				list2.add(i);
			}
		}
		
		result.add(list);
		result.add(list2);
		
		return result;
    }
}