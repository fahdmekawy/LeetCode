class Solution {
  int majorityElement(List<int> nums) {
    int candidate = nums[0];
    int count = 1;

    for (final num in nums.skip(1)) {
      if (num == candidate) {
        count++;
      } else {
        if (count == 0) {
          candidate = num;
          count = 1;
        } else {
          count--;
        }
      }
    }

    return candidate;
  }
}