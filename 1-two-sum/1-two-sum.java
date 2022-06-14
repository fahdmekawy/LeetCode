class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer,Integer> num_Map = new HashMap<>();
            for(int i =0;i<nums.length;i++){
                int complement = target - nums[i];
                if(num_Map.containsKey(complement)){
                    return new int[]{num_Map.get(complement),i};
                }
                num_Map.put(nums[i], i);
            }
throw new  IllegalArgumentException("not match");
        }
}