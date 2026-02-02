class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double resault = 0;
        double count = 0;

        for(int i = 0; i < k; i++){
            count += nums[i];
        }

        resault = count / k;

        int l = 0;
        int r = k - 1;

        while(r + 1 < nums.length){
            count -= nums[l];
            count += nums[r + 1];
            resault = Math.max(resault, count / k);
            l++;
            r++;
        }
        return resault;
    }
}