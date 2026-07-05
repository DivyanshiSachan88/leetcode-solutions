import java.util.*;

class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        backtrack(s, 0, 0, "", result);
        return result;
    }

    private void backtrack(String s, int index, int part, String current, List<String> result) {
        if (part == 4 && index == s.length()) {
            result.add(current.substring(0, current.length() - 1));
            return;
        }

        if (part == 4 || index == s.length()) {
            return;
        }

        for (int len = 1; len <= 3 && index + len <= s.length(); len++) {
            String segment = s.substring(index, index + len);

            if ((segment.length() > 1 && segment.charAt(0) == '0') ||
                Integer.parseInt(segment) > 255) {
                continue;
            }

            backtrack(s, index + len, part + 1, current + segment + ".", result);
        }
    }
}