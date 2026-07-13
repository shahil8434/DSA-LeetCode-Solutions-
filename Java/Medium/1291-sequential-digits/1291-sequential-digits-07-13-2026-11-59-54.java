class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        ArrayList<Integer> list = new ArrayList<>();
        int num = 0;
      
        String s = "123456789";
              for (int len = 2; len <= 9; len++) {
                for (int start = 0; start + len <= 9; start++) {    
                  String digit = s.substring(start, start + len);
                  num = Integer.parseInt(digit);
                  if(num >= low && num <= high){
                list.add(num);
               }
            }
            
        }
       Collections.sort(list);
        return list;
    }
}