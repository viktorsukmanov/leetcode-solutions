class Solution {
    public int maxSubArray(int[] nums) {
        int cur_prefix = 0;
        int min_prefix = 0;
        int answer = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
           cur_prefix += nums[i];
           answer = Math.max(answer, cur_prefix - min_prefix);
           if(cur_prefix < min_prefix){
            min_prefix = cur_prefix;
           }    
        }

        return answer;
    }
}