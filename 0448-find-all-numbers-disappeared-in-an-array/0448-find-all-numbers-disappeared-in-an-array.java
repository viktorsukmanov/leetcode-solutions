class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> answer = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            int value = Math.abs(nums[i]);
            nums[value - 1] = Math.abs(nums[value - 1]) * -1;
        }

        for(int i = 1; i <= nums.length; i++){
            if(nums[i - 1] > 0) answer.add(i);
        }

        return answer;
    }
}