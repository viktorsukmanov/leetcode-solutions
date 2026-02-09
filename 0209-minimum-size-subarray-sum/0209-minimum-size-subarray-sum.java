class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0;
        int end = 0;
        int minLength = Integer.MAX_VALUE;
        int summ = 0;

        while(end < nums.length){
            summ += nums[end];
            while(summ >= target){
             minLength = Math.min(minLength, end - start + 1);
            
                summ -= nums[start];
                start ++;
            }
            end++;
        }
        if(minLength == Integer.MAX_VALUE) return 0;
        return minLength;
    }
}