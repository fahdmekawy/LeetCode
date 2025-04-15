class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int i = 0;
        int j = 0;
        int wordOneLength = word1.length();
        int wordTwoLength = word2.length();

        while(i < wordOneLength && j < wordTwoLength){
            merged.append(word1.charAt(i++));
            merged.append(word2.charAt(j++));
        }
        while (i < wordOneLength) {
            merged.append(word1.charAt(i++));
        }
        while (j < wordTwoLength) {
            merged.append(word2.charAt(j++));
        }

        return merged.toString();

    }
}