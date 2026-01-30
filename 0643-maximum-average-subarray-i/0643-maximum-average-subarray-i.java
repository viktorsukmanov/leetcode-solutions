class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double answer = 0; //0,5
        double counter = 0; // 2  51
        if(nums.length < k) {return answer;}

        for(int i = 0; i < k; i++){
            counter += nums[i];
        }

        answer = counter / k;

        int l = 0;
        int r = k -1; //3

        while(r + 1 < nums.length){
            counter -= nums[l];
            counter += nums[r + 1];
            answer = Math.max(answer, counter / k);
            l++;
            r++;
        }

        return answer;
    }
}