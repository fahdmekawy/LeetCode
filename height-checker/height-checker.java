class Solution {
    public int heightChecker(int[] heights) {
       
        int[] copiedHeights = new int[heights.length];
        
        for (int i = 0; i < heights.length; i++) {
            copiedHeights[i] = heights[i];
        }
        
        Arrays.sort(copiedHeights);
        
        int notMatched = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != copiedHeights[i]) {
                notMatched++;
            }
        }
        
        return notMatched;
    }
}