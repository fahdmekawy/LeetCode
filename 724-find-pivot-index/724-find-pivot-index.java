class Solution {
    public int pivotIndex(int[] nums) {
        
        if(nums.length == 0) return -1;

        int left = 0;
        int right = SumOfRight(nums);
        
        
        for(int i =0 ; i <nums.length; i ++){
            right -= nums[i];
            if( left == right ){
                return i;
            }
            left += nums[i];
        }
        return -1;
        
        
    }
    
    
    
    
        
    public static int SumOfRight(int[] arr){
        int sum = 0;
        for(int num : arr) sum+=num ; return sum;

    }
}