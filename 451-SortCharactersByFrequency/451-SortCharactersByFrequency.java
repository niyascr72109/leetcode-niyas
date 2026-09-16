// Last updated: 9/16/2026, 9:46:15 AM
1class Solution {
2    public String frequencySort(String s) {
3        HashMap<Character,Integer> h = new HashMap<>();
4        for(char ch : s.toCharArray()){
5            h.put(ch,h.getOrDefault(ch,0)+1);
6        }
7        StringBuilder str = new StringBuilder();
8        Character arr[] = h.keySet().toArray(new Character[0]);
9        Arrays.sort(arr,(a,b) -> h.get(b) - h.get(a));
10        for(char ch : arr){
11            for(int i=0;i<h.get(ch);i++){
12                str.append(ch);
13            }
14        }
15        return str.toString();
16    }
17}