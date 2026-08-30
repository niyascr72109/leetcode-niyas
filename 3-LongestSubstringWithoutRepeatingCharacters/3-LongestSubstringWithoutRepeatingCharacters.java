// Last updated: 8/30/2026, 3:33:56 PM
1class Solution {
2    public int totalFruit(int[] fruits) {
3        int max = 0;
4        int l = 0;
5        int r = 0;
6        HashMap<Integer,Integer> m = new HashMap<>();
7        while(r<fruits.length){
8            m.put(fruits[r],m.getOrDefault(fruits[r],0)+1);
9            if(m.size()>2){
10                m.put(fruits[l],m.get(fruits[l])-1);
11                if(m.get(fruits[l])==0) m.remove(fruits[l]);
12                l++;
13            }
14            max=Math.max(max,r-l+1);
15            r++;
16        }
17        return max;
18    }
19}
20