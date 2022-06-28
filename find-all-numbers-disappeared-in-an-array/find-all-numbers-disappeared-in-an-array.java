class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        int[] temp=new int[nums.length+1];
        
        for(int i=0;i<nums.length;i++){
            temp[ nums[i] ]++;
        }
        
        List<Integer> list = new ArrayList<>();
        
        for(int i=1;i<temp.length;i++){
            if(temp[i]==0) list.add(i);
        }
        
        return list;
   }
}