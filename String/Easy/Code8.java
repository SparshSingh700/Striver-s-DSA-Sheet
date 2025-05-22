//leetcode 13. Roman to Integer
// almost same logic but edge case optimised 
class Solution {
    public int romanToInt(String s) {
        int ans = 0;
        int l = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        for (int i = 0; i < l; i++) {
            int current = map.get(s.charAt(i));
            int next = 0;

            if (i + 1 < l) {
                next = map.get(s.charAt(i + 1));
                if (current < next) {
                    ans += (next - current);
                    i++; // skip next char
                    continue;
                }
            }
            ans += current;
        }
        return ans;
    }
}



// class Solution {
//     public int romanToInt(String s) {
//        int ans=0;
//        int l=s.length()-1;
//        HashMap<Character, Integer> map=new HashMap<>();
//        map.put('I',1);
//        map.put('V',5);
//        map.put('X',10);
//        map.put('L',50);
//        map.put('C',100);
//        map.put('D',500);
//        map.put('M',1000);
//        if(l==0) return map.get(s.charAt(0));
//        for(int i=0; i<l; i++){
//         char ch1=s.charAt(i);
//         char ch2=s.charAt(i+1);
//         int first=map.get(ch1);
//         int sec=map.get(ch2);
//         if(sec>first){
//             first=sec-first;
//             i++;           
//         }
//         ans+=first;
//        }
//        if(map.get(s.charAt(l))<=map.get(s.charAt(l-1)))
//        ans+=map.get(s.charAt(l));
//         return ans;
//     }
// }
