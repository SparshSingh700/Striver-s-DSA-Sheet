//Leetcode 1759. Count Number of Homogenous Substrings
class Solution {
    public int countHomogenous(String s) {
        int mod = 1_000_000_007;
        long ans = 0;
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                ans += (long) count * (count + 1) / 2;
                count = 1;
            }
        }

        // for addinf last element if different(ab) and block if same(aaa)
        ans += (long) count * (count + 1) / 2;

        return (int)(ans % mod);
    }
}
