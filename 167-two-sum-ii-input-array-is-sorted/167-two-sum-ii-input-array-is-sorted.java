class Solution {
        public int[] twoSum(int[] nums, int target) {
                int [] result = new int[2];
                int left = 0; 
                int right = nums.length-1;
                
                while(left < right){
                        int l = nums[left];
                        int r = nums[right];
                        if(l+r == target){
                                result[0] = left +1;
                                result[1] = right +1;
                                break;

                        }else if (l+r < target){
                                left++;
                        }else {
                                right--;
                        }
                }return result;
        }
}