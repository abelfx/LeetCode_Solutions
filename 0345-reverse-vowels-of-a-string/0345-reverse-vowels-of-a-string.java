class Solution {
    public String reverseVowels(String s) {
        StringBuilder result = new StringBuilder(s);
        StringBuilder vowels = new StringBuilder();
        String vowel = "aeiouAEIOU";

        for (int i = 0; i < s.length(); i++) {
            if (vowel.indexOf(s.charAt(i)) != -1) {
                vowels.append(s.charAt(i));
            }
        }

        vowels.reverse();

    
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (vowel.indexOf(s.charAt(i)) != -1) {
                result.setCharAt(i, vowels.charAt(index));
                index++;
            }
        }

        return result.toString();
    }
}
