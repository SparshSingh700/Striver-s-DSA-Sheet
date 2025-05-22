//leetcode 451. Sort Characters By Frequency
class Solution {
    public String frequencySort(String s) {
        // Step 1: Count frequencies and track max freq
        HashMap<Character, Integer> map = new HashMap<>();
        char[] arr = s.toCharArray();
        int max = 0;
        for (char c : arr) {
            int freq = map.getOrDefault(c, 0) + 1;
            map.put(c, freq);
            max = Math.max(max, freq);
        }

        // Step 2: Create buckets where index = frequency
        List<Character>[] buckets = new List[max + 1];
        for (char c : map.keySet()) {
            int freq = map.get(c);
            if (buckets[freq] == null) {
                buckets[freq] = new ArrayList<>();
            }
            buckets[freq].add(c);
        }

        // Step 3: Build result from high freq to low
        StringBuilder str = new StringBuilder();
        for (int i = max; i >= 1; i--) {
            if (buckets[i] != null) {
                for (char c : buckets[i]) {
                    str.append(String.valueOf(c).repeat(i));
                }
            }
        }

        return str.toString();
    }
}
