class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int sum = 0;
        int i = piles.length - 2;

        for(int j = 0; j < piles.length/3; j++){
            sum = sum + piles[i];
            i = i - 2;
        }

        return sum;
        
    }
}