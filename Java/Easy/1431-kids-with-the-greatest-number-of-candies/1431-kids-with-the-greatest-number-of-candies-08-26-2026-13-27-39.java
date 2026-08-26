class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<>();
        int max = 0;
        for(int candie : candies){
            max = Math.max(candie, max);
        }
        
        for (int candie : candies) {
            int sum = candie + extraCandies;
            list.add(sum >= max);
        }
        return list;
    }
}