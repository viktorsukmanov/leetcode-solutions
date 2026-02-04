class Solution {
    public int totalFruit(int[] fruits) {
        int l = 0;
        int r = 0;
        int maxLength = 0;

        Map<Integer, Integer> map = new HashMap<>();

        while(r < fruits.length){
            map.put(fruits[r], map.getOrDefault(fruits[r], 0) + 1);
            while(map.size() >= 3){
                map.put(fruits[l], map.get(fruits[l]) - 1);
                if(map.get(fruits[l]) == 0) map.remove(fruits[l]);
                l++;
            }
            int currentLength = r - l + 1;
            maxLength = Math.max(maxLength, currentLength);
            r++;
        }
        return maxLength;
    }
}