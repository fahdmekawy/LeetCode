class Solution {
  List<String> summaryRanges(List<int> nums) {
    final result = <String>[];
    final n = nums.length;

    for (int i = 0; i < n; i++) {
      final start = nums[i];

      while (i + 1 < n && nums[i + 1] == nums[i] + 1) {
        i++;
      }

      final end = nums[i];
      result.add(start == end ? "$start" : "$start->$end");
    }

    return result;
  }
}