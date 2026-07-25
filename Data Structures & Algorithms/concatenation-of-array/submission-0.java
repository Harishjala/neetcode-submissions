class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans=new int[2*nums.length];
        int index=nums.length;
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];

        }
        for(index=0;index<nums.length;index++){
            ans[index+nums.length]=nums[index];
        }
        return ans;
        
    }
}