class Solution {
  int findTheDistanceValue(List<int> arr1, List<int> arr2, int d) {
    arr2.sort();
    int count = 0;

    for (int a in arr1) {
      if (_isValid(a, arr2, d)) {
        count++;
      }
    }

    return count;
  }

    bool _isValid(int target, List<int> arr2, int d) {
    int left = 0;
    int right = arr2.length - 1;

    while (left <= right) {
      int mid = (left + right) ~/ 2;
      int diff = (arr2[mid] - target).abs();

      if (diff <= d) {
        return false;
      }

      if (arr2[mid] < target) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    return true;
  }
}