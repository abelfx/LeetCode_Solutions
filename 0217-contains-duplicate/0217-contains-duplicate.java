class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> setter = new HashSet<>();
        
        for(int i: nums){
            setter.add(i);
        }
        
        if(setter.size() == nums.length){
            return false;
        }
        
        return true;
    }
}