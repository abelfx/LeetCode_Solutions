class Solution {
    public int maxVowels(String s, int k) {
        HashSet<Character> set = new HashSet();
        
        set.add('a'); set.add('e'); set.add('i'); set.add('o'); set.add('u');
        
        int counter = 0;
        for(int i = 0; i < k; i++){
            if(set.contains(s.charAt(i))){
                counter++;
            }
        }
        
        int max = counter;
        
        for(int i = k; i < s.length(); i++){
            if(set.contains(s.charAt(i - k))){
                counter--;
            }
            if(set.contains(s.charAt(i))){
                counter++;
            }
            
            max = Math.max(max, counter);
        }
        
        return max;
        
    }
}