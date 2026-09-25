class Solution {
    public int[] getConcatenation(int[] nums) {
        int copy[]=new int[nums.length];
        copy=Arrays.copyOf(nums,nums.length);

        int result[]=new int[nums.length+copy.length];

        for(int i=0;i<nums.length;i++){
            result[i]+=nums[i];
        }

        for(int j=0;j<copy.length;j++){
            result[nums.length+j]+=copy[j];
        }
        return result;
    }
}