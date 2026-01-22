class Solution {
    public int subarraySum(int[] nums, int k) {
        int answer = 0; //1

        for(int i = 0; i < nums.length; i++){
            int sum = nums[i]; //1
            if(nums[i] == k){
                answer++;
            }
            for(int j = i + 1; j < nums.length; j++){
                sum += nums[j]; //3
                if(sum == k){
                    answer++;
                }
            }
        }
        return answer;
    }
}