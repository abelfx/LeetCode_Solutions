class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }

        String totalComb = s + s;
        
        return totalComb.contains(goal);

    }
}