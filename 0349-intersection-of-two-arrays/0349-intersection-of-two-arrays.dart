class Solution {
  List<int> intersection(List<int> nums1, List<int> nums2) {
    final Set<int> seen = {};
    final List<int> intersection = [];
    for (final num in nums1) {
      seen.add(num);
    }

    for (final num in nums2) {
      if (seen.contains(num)) {
        intersection.add(num);
        seen.remove(num);
      }
    }
    return intersection;
  }
}