class Solution {
    public String addBinary(String s1, String s2) {
        
    StringBuilder result = new StringBuilder();
        
    int i = s1.length() - 1, j = s2.length() -1, carry = 0;
        
        
    while (i >= 0 || j >= 0) {
        
        int sum = carry;
        //  java convert string to int automatically,Thus "0" = 48 and "1"=49
        if (j >= 0) sum += s2.charAt(j--) - '0';
        if (i >= 0) sum += s1.charAt(i--) - '0';
        result.append(sum % 2); // if sum = 2 then 
        carry = sum / 2;
    }
    if (carry != 0) result.append(carry);
    return result.reverse().toString();
}
}