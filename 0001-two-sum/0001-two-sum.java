class Solution {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        for(int i = 0; i < length-1; i++) {
            for(int j = i+1; j<length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[0];
    }
}