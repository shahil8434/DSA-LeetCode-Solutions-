class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        int n = nums.length;
        
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
            if(nums[i] == key){
                   if(Math.abs(j - i) <= k){
                    set.add(j);
                   }
                }
            }
        }
        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        return list;
    }
}