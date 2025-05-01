import 'dart:math';

class Solution {
  int arrangeCoins(int n) {
    int left = 1;
    int right = n;
    int result = 0;

    while (left <= right) {
      int mid = (left + right) ~/ 2;
      int coins = mid * (mid + 1) ~/ 2;

      if (coins > n) {
        right = mid - 1;
      } else {
        result = mid;
        left = mid + 1;
      }
    }
    return result;
  }
}
