class Solution {
    public double findMaxAverage(int[] nums, int k) {
       double count = 0;
       double avg = 0;

       if(nums.length < k){
        return 0;
       }

       for(int i = 0; i < k; i++){
        count += nums[i];
       }

       avg = count/k;
    
    int l = 0;
    int r = k - 1;

    while(r + 1 < nums.length){
        count -= nums[l];
        count += nums[r + 1];
        avg = Math.max(avg, count/k);
        l++;
        r++; 
    }
    return avg;
    }
}