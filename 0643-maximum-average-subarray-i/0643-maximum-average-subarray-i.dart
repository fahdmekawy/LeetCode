class Solution {
  double findMaxAverage(List<int> nums, int k) {
    if (k > nums.length) return -1; 
    double windowSum = nums.sublist(0, k).reduce((a, b) => a + b).toDouble();
    double maxSum = windowSum;
    for (int i = k; i < nums.length; i++) {
      windowSum += nums[i] - nums[i - k];
      maxSum = max(maxSum, windowSum);
    }
    return maxSum / k;
  }
}