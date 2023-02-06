class Solution {
    public int[] shuffle(int[] nums, int n) {
         if(n==1) return nums;
        
        int[] newArr = new int[nums.length];
        int p1=0,p2=n;
        
        for(int i =0;i<2*n;i++){
            if(i%2 ==0){
                newArr[i] = nums[p1];
                p1++;
            }else{
                newArr[i] = nums[p2];
                p2++;
            }
        }
        return newArr;
        

    }
}