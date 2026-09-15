class Solution {
    public static Boolean selfCheck(int n){
            int temp = n;
            int k;
            while(temp != 0){
                k = temp % 10;
                if(k == 0 || n % k != 0){
                    return false;
                } 
                temp = temp / 10;
            }
             return true;
     }

    public List<Integer> selfDividingNumbers(int left, int right) {

        ArrayList<Integer> list = new ArrayList<>();
        while (left <= right) {
            if (selfCheck(left)) {
                list.add(left);
            }
            left++;
        }
        return list;
    }
}