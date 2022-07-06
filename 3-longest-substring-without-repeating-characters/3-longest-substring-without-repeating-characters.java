class Solution {
    public int lengthOfLongestSubstring(String s) {
            if(s == null || s.equals("")){return 0;}
            
            int start =0,end =0,maxLength = 0;
            
            Set<Character> uniqueSet = new HashSet<>();
            
            while(end<s.length()){
                    if(uniqueSet.add(s.charAt(end))){
                            end++;
                            maxLength =Math.max(maxLength,uniqueSet.size());
                    }else{
                            uniqueSet.remove(s.charAt(start));
                            start++;
                    }
            }
            
            return maxLength;
            
            
        
    }
}