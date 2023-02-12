class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int result = 0;
        for(String operation :operations)
          result += operation.charAt(1) == '+' ? 1 : -1;
        
        return result;
    }
}