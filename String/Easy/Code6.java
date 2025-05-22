//Leetcode 242. Valid Anagram
// class Solution {
//     public boolean isAnagram(String s, String t) {
//        HashMap<Character, Integer> map= new HashMap<>();
//        int l1=s.length();
//        int l2=t.length();
//        if(l1!=l2) return false;
//        for(int i=0; i<l1; i++){
//         char ch=s.charAt(i);
//         map.put(ch, map.getOrDefault(ch,0)+1);
//        }
//        for(int i=0; i<l1; i++){
//         char ch=t.charAt(i);
//         if(map.containsKey(ch)){
//             map.put(ch, map.get(ch)-1);
//             if(map.get(ch)==0){ map.remove(ch);}
//         }
//         else return false;
//        }
//        return map.isEmpty() ;
//     }
// }

//another way which is faster but works on small characters

class Solution {
    
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] arr = new int[26];
        char[] sa = s.toCharArray();
        char[] ta = t.toCharArray();
        for (int i = 0; i < sa.length; i++) {
            arr[sa[i] - 'a'] ++;
            arr[ta[i] - 'a'] --;
        }
        for (int i : arr) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}
