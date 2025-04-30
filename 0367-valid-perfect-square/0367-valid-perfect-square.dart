class Solution {
  bool isPerfectSquare(int num) {
    int left = 1;
    int right = num;

    while (left <= right) {
      int mid = (left + right) ~/ 2;
      if (mid * mid == num) {
        return true;
      } else if (mid * mid < num) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    return false;
}
}