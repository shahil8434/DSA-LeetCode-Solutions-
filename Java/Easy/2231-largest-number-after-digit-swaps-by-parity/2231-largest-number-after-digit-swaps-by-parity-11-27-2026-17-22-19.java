class Solution {
    public int largestInteger(int num) {

        String str = num + "";

        int[] arr = new int[str.length()];

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {

            int ele = str.charAt(i) - '0';

            if (ele % 2 == 0) {
                even.add(ele);
            } else {
                odd.add(ele);
            }

            arr[i] = ele;
        }

        Collections.sort(even, Collections.reverseOrder());
        Collections.sort(odd, Collections.reverseOrder());

        int[] ans = new int[arr.length];

        int e = 0;
        int o = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                ans[i] = even.get(e++);
            } else {
                ans[i] = odd.get(o++);
            }
        }

        int result = 0;

        for (int digit : ans) {
            result = result * 10 + digit;
        }

        return result;
    }
}
