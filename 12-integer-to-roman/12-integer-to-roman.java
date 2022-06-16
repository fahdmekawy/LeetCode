 class Solution {
 	public String intToRoman(int num) {
        String[] roman = {"M", "CM","D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV","I"};
int[] n = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
 		StringBuilder sb = new StringBuilder();
 		int index = 0;
 		while(num != 0){
 			while(num >= n[index]){
 				sb.append(roman[index]);
 				num -= n[index];
 			}
 			index++;
 		}
 		return sb.toString();
 	}
 }