class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<String, Integer> map = new HashMap();

        for(int[] row: grid){
            String rowstr = Arrays.toString(row);
            map.put(rowstr, map.getOrDefault(rowstr, 0) + 1);
        }

        int counter = 0;
        for(int i = 0; i < grid.length; i++){
            int[] col = new int[grid.length];
            for(int j = 0; j < grid.length; j++){
                col[j] = grid[j][i];

            }
            String colstr = Arrays.toString(col);
            counter += map.getOrDefault(colstr, 0);
        }

        return counter;
    }
}