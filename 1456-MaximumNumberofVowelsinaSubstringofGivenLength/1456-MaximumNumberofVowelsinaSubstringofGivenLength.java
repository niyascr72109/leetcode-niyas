// Last updated: 9/3/2026, 9:25:25 AM
1class Solution {
2    public int totalFruit(int[] fruits) {
3        int l = 0;
4        int r = 0;
5        int max = 0;
6        int len = 0;
7        HashMap<Integer,Integer> h = new HashMap<>();
8        while(r<fruits.length){
9            h.put(fruits[r],h.getOrDefault(fruits[r],0)+1);
10            while(h.size()>2){
11                h.put(fruits[l],h.getOrDefault(fruits[l],0)-1);
12                if(h.get(fruits[l]) == 0){
13                    h.remove(fruits[l]);
14                }
15                l++;
16            }
17            max=Math.max(max,r-l+1);
18            r++;
19        }
20        return max;
21    }
22}