class Solution {
  double findMaxAverage(List<int> nums, int k) {

    double maxSum=0;
    double windowSum=0;

    for(int i=0 ; i<k ; i++){
        windowSum += nums[i];
    }
    maxSum = windowSum;

    for(int i= k ; i < nums.length ; i++){
        windowSum += nums[i] - nums[i-k];
        if(maxSum < windowSum) maxSum = windowSum;
    }
    return maxSum/k;
  }
}