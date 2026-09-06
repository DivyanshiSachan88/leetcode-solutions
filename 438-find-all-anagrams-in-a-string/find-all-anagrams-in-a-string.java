import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String r) {

        int ns = s.length();
        int nr = r.length();

        List<Integer> res = new ArrayList<>();

        if (ns < nr) {
            return res;
        }

        int[] reference = new int[26];
        int[] slidingCount = new int[26];
        for (char c : r.toCharArray()) {
            reference[c - 'a']++;
        }
        for (char c : s.substring(0, nr).toCharArray()) {
            slidingCount[c - 'a']++;
        }
        if (Arrays.equals(reference, slidingCount)) {
            res.add(0);
        }
        for (int i = 1; i < ns - nr + 1; i++) {
            slidingCount[s.charAt(i - 1) - 'a']--;
            slidingCount[s.charAt(i + nr - 1) - 'a']++;
            if (Arrays.equals(reference, slidingCount)) {
                res.add(i);
            }
        }

        return res;
    }
}
