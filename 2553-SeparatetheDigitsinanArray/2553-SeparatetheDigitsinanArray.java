// Last updated: 9/30/2026, 9:17:51 AM
1class Solution {
2    public int[] separateDigits(int[] nums) {
3        ArrayList<Integer> l = new ArrayList<>();
4        for(int num : nums){
5            String s = String.valueOf(num);
6            for(int i=0;i<s.length();i++){
7                l.add(s.charAt(i)-'0');
8            }
9        }
10        int res[] = new int[l.size()];
11        for(int i=0;i<res.length;i++) res[i] = l.get(i);
12        return res;
13    }
14}