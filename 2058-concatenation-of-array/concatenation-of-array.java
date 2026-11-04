class Solution {
    public int[] getConcatenation(int[] nums) {
        int nums2[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            nums2[i]=nums[i];
        }
        int tot[]=new int[nums.length+nums2.length];
        for(int i=0;i<nums.length;i++){
            tot[i]=nums[i];
        }
        for(int j=0;j<nums2.length;j++){
            tot[nums.length+j]=nums2[j];
        }
        return tot;
    }
}