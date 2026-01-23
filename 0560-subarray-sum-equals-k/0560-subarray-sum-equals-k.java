class Solution {
    public int subarraySum(int[] nums, int k) {
        int answer = 0;
        int subarray_sum = 0;
        Map<Integer, Integer> count_sum = new HashMap<>();
        count_sum.put(0, 1);

        for(int i = 0; i < nums.length; i++){
            subarray_sum += nums[i];
            answer += count_sum.getOrDefault(subarray_sum - k, 0);
            count_sum.merge(subarray_sum, 1, Integer::sum);
        }
        return answer;        
    }
}