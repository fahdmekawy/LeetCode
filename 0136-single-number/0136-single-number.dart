class Solution {
  int singleNumber(List<int> nums) {
  int singleNumber = nums[0];
  for (int index = 1; index < nums.length; index++) {
    singleNumber ^= nums[index];
  }
  return singleNumber;
  }
}