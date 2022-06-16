class Solution {
    public boolean isPalindrome(int x) { 
        if(x <0) return false;
        int result=1;
        int holder =x;
        int digit =1;
        result =holder%10;
        holder=holder/10;
        while (holder != 0){
            result= result *10+holder%10;
            holder=holder/10;
            
            
        }
        if(result ==x){
            return true;
        }else return false;
        
    }
}