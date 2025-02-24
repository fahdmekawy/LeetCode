class Solution {
  bool containsDuplicate(List<int> nums) {
  final set = <int>{};
  for (final num in nums) {
    if (!set.add(num)) {
      return true;
    }
  }
  return false;
}
}