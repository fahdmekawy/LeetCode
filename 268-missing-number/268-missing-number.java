public class Solution {
    public int missingNumber(int[] nums) {
        
        boolean[] indexChacker = new boolean[nums.length+1];
        for(int num:nums){
            indexChacker[num] = true;
        }
        int i;
        for(i=0;i<indexChacker.length;i++)
            if(!indexChacker[i])
                return i;
        return i;
    }
}