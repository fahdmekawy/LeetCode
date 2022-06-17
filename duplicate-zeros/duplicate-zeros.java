class Solution {
  public void duplicateZeros(int[] arr) {
    int numOfZeros = numZeros(arr);

    int i = arr.length - 1;
    int j = arr.length + numOfZeros - 1;
    while (i != j) {
      insert(arr, i, j--);
      if (arr[i] == 0) {
        insert(arr, i, j--);
      }
      i--;
    }
  }
  
    public void insert(int[] arr, int i, int j) {
    if (j < arr.length) {
      arr[j] = arr[i];
    }
  }
    public static int numZeros(int[] arr) {
        int numZeros = 0;
        for (int num : arr) {
            numZeros += num == 0 ? 1 : 0;
        }
        return numZeros;

    }

}