class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<>();

        int max = 0;

        for(int i : candies){
            max = Math.max(max, i);
        }

        for(int i : candies){
            if(i + extraCandies >= max){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }

        return list;
    }
}