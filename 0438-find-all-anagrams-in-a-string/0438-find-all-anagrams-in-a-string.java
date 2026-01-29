class Solution {
    public List<Integer> findAnagrams(String s, String p) {
            List<Integer> result = new ArrayList<>();
        if(s.length() < p.length()){
            return result;
        }

        Map<Character, Integer> counterP = new HashMap<>();
        Map<Character, Integer> counterS = new HashMap<>();
        for(int i = 0; i < p.length(); i++){
            counterP.put(p.charAt(i), counterP.getOrDefault(p.charAt(i), 0) + 1);
        }
        for(int i = 0; i < p.length(); i++){
            counterS.put(s.charAt(i), counterS.getOrDefault(s.charAt(i), 0) + 1);
        }

        if(counterP.equals(counterS)) result.add(0);

        int l = 0;
        int r = p.length() - 1;
        while(r + 1 < s.length()){
            Character charToAdd = s.charAt(r + 1);
            Character charToRemove = s.charAt(l);
            counterS.put(charToAdd, counterS.getOrDefault(charToAdd, 0) + 1);
            counterS.put(charToRemove, counterS.get(charToRemove) - 1);
            r++;
            l++;
            if(sameCounters(counterP, counterS)) result.add(l);
        }
        return result;
    }

    private boolean sameCounters(Map<Character, Integer> counter1, Map<Character, Integer> counter2){
        for(Map.Entry<Character, Integer> entry : counter1.entrySet()){
            if(!counter2.getOrDefault(entry.getKey(), 0).equals(entry.getValue())){
                return false;
            }
        }

        for(Map.Entry<Character, Integer> entry : counter2.entrySet()){
            if(!counter1.getOrDefault(entry.getKey(), 0).equals(entry.getValue())){
                return false;
            }
        }
        return true;
    }
}