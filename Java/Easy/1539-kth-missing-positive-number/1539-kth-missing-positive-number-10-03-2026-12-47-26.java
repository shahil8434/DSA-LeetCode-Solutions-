class Solution {
    public int findKthPositive(int[] arr, int k) {
        int total = arr[arr.length - 1] + k;
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < arr.length; i++){
            set.add(arr[i]);
        }
        int i = 1;
        int count  = 0;
        int ans = 0;
        while(i <= total){
            if(!set.contains(i)){
                count++;
                if(count == k){
                    ans = i;
                    break;
                }
            }
            i++;
        }
        return ans;
    }
}