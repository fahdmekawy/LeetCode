class Solution {
  public int searchInsert(int[] nums, int target) {
    int left = 0;
    int right = nums.length;

    while (left < right) {
      final int middle = (left + right) / 2;
      if (nums[middle] == target)
        return middle;
      if (nums[middle] < target)
        left = middle + 1;
      else
        right = middle;
    }

    return left;
  }
}