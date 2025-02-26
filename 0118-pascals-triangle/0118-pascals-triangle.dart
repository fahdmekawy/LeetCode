class Solution {
  List<List<int>> generate(int numRows) {
  List<List<int>> triangle = [];

  for (int i = 0; i < numRows; i++) {
    List<int> row = [1];
    for (int j = 1; j < i; j++) {
      row.add(triangle[i - 1][j - 1] + triangle[i - 1][j]);
    }
    if (i > 0) row.add(1);
    triangle.add(row);
  }

  return triangle;
  }
}