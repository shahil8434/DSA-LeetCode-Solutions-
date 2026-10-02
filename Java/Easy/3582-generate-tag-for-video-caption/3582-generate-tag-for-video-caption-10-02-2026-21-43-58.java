class Solution {
    public String generateTag(String caption) {

        StringBuilder sb = new StringBuilder();

        sb.append('#');

        int i = 0;

        // Skip leading spaces
        while (i < caption.length() && caption.charAt(i) == ' ') {
            i++;
        }

        // Empty / only spaces
        if (i == caption.length()) {
            return "#";
        }

        // First character
        sb.append(Character.toLowerCase(caption.charAt(i)));
        i++;

        while (i < caption.length() && sb.length() < 100) {

            if (caption.charAt(i) == ' ') {
                i++;
                continue;
            }

            if (caption.charAt(i - 1) == ' ') {
                sb.append(Character.toUpperCase(caption.charAt(i)));
            } else {
                sb.append(Character.toLowerCase(caption.charAt(i)));
            }

            i++;
        }

        return sb.toString();
    }
}