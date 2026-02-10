class Solution {
    public String largestNumber(int[] nums) {
        String[] numsString = new String[nums.length];
        for(int i = 0; i < nums.length; i++){
            numsString[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(numsString, (a, b) -> {
            String order1 = a + b;
            String order2 = b + a;
            return order2.compareTo(order1);
        });

        if(numsString[0].equals("0")) return "0";

        StringBuilder answer = new StringBuilder();

        for(String s : numsString){
            answer.append(s);
        }

        return answer.toString();
    }
}