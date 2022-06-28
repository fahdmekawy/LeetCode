class Solution {
    public int search(int[] nums, int target) {
                int lower = 0;
        int upper = nums.length-1;
        int index = 0;

        while (true) {
            index =(lower + upper) /2 ;
            if(target == nums[index]){
                return index;
                
            }else if(lower > upper) {
                return -1;
            }

            else if(target>nums[index]){
                lower = index+1;
            }else if(target<nums[index]){
                upper = index -1;
            }
        }
        
    }
}