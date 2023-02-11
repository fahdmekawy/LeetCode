class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        
        int[] results = new int[queries.length];
        Arrays.sort(nums);
        
        for(int i =0;i<queries.length;i++){
            results[i] = lessThanQuery(nums,queries[i]);
        }
        return results;
    }
    
    private int lessThanQuery(int[]nums,int query){
        int sum =0;
        for(int i =0;i<nums.length;i++){
            sum +=nums[i];
            if(sum> query){
                return i;
            }
        }
        return nums.length;
    }
}