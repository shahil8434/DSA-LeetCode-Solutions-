class Solution {
    public int totalNumbers(int[] digits) {
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int digit : digits){
            map.put(digit, map.getOrDefault(digit, 0) + 1);
        }

        int i = 100;

        while(i <= 999){
            if(i % 2 == 0){
                int a = i / 100;
                int b = (i / 10) % 10;
                int c = i % 10;

                HashMap<Integer, Integer> temp = new HashMap<>(map);

                if (temp.getOrDefault(a, 0) > 0) {
                    temp.put(a, temp.get(a) - 1);
                } else {
                    i++;
                    continue;
                }

                if (temp.getOrDefault(b, 0) > 0) {
                    temp.put(b, temp.get(b) - 1);
                } else {
                    i++;
                    continue;
                }

                if (temp.getOrDefault(c, 0) > 0) {
                    temp.put(c, temp.get(c) - 1);
                     ans++;
                }
            }
            i++;
        }
        return ans;
    }
}