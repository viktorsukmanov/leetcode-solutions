class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> answer = new ArrayList();
        if(s.length() < p.length()){
            return answer;
        }

        Map<Character, Integer> sCounter = new HashMap<>();
        Map<Character, Integer> pCounter = new HashMap<>();
        for(int i = 0; i < p.length(); i++){
            sCounter.put(s.charAt(i), sCounter.getOrDefault(s.charAt(i),0) + 1);
        }
        for(int i = 0; i < p.length(); i++){
            pCounter.put(p.charAt(i), pCounter.getOrDefault(p.charAt(i),0) + 1);
        }
    
        if(sameCounters(sCounter, pCounter)){
        answer.add(0);
         }

        int left = 0;
        int right = p.length() - 1;

        while(right + 1 < s.length()){
        Character charToAdd = s.charAt(right + 1);
        Character charToRemove = s.charAt(left);
        sCounter.put(charToAdd, sCounter.getOrDefault(charToAdd,0)+1);
        sCounter.put(charToRemove, sCounter.get(charToRemove) - 1);
        left++;
        right++;
        if(sameCounters(sCounter, pCounter)){
            answer.add(left);
        }

    }
    return answer;
    }
    private boolean sameCounters( Map<Character, Integer> counter1,
                         Map<Character, Integer> counter2){

            for(Map.Entry<Character, Integer> entry : counter1.entrySet()){
                if(!counter2.getOrDefault(entry.getKey(),0).equals(entry.getValue())){
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