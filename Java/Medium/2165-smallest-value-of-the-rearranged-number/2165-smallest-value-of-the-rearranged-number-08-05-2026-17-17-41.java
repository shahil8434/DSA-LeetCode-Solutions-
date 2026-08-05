class Solution {
    public long smallestNumber(long num) {
        ArrayList<Integer> list = new ArrayList<>();
        boolean negative = num < 0;
        long temp = Math.abs(num);

        while (temp > 0) {
            list.add((int) (temp % 10));
            temp /= 10;
        }

        Collections.sort(list);
        if (num == 0)
            return 0;
        if (negative == true) {
            Collections.reverse(list);
        } else {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) != 0) {
                    Collections.swap(list, 0, i);
                    break;
                }
            }
        }
        long ans = 0;

        for (int digit : list) {
            ans = ans * 10 + digit;
        }
        if(negative){
        return -ans;
        }
        return ans;
    }
}