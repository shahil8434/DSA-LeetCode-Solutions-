class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(int rank:ranks){
            map1.put(rank, map1.getOrDefault(rank, 0) + 1);
        }
        for(char suit : suits){
           map2.put(suit, map2.getOrDefault(suit, 0) + 1);
        }
        if(map2.size() == 1){
            return "Flush";
        }else if(map1.containsValue(3) || map1.containsValue(4)){
            return "Three of a Kind";
        }else if(map1.containsValue(2)){
            return "Pair";
        }
        return "High Card";
    }
}