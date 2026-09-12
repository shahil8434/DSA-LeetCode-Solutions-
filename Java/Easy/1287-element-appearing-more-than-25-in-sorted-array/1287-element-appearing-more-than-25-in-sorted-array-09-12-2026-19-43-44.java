class Solution {
    public int findSpecialInteger(int[] arr) {
      int n = arr.length;
      int k = n / 4;
      HashMap<Integer, Integer> map = new HashMap<>();
      for(int ele : arr){
        map.put(ele, map.getOrDefault(ele, 0) + 1);
      }  
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
              int element = entry.getKey();
            int frequency = entry.getValue();

            if (frequency > k) {
                return element;
            }
        }
      return -1;
    }
}