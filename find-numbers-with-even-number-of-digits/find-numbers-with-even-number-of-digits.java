class Solution {
    public int findNumbers(int[] nums) {
        
        if(nums.length ==0){
            return 0;
        }
        int count = 0 ;
        for(int i = 0; i <nums.length; i ++){
            int NumsOfDigit = String.valueOf(nums[i]).length();
              if(NumsOfDigit %2 ==0){
                count ++;
            }
        }
        return count;
    }
    
    
  
}