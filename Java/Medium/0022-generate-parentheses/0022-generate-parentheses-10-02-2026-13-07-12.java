class Solution {
    int n;
    ArrayList<String> list = new ArrayList<>();

    public void recursion(String curr, int open, int close) {
        if (curr.length() == 2 * n) {
            list.add(curr);
            return;
        }
        if (open < n) {
            recursion(curr + "(", open + 1, close);
        }
        if (close < open) {
            recursion(curr + ")", open, close + 1);
        }
    }

    public List<String> generateParenthesis(int n) {

        this.n = n;
        recursion("", 0, 0);
        
        return list;
    }
}