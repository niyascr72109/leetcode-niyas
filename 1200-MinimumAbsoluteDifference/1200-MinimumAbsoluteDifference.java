// Last updated: 9/30/2026, 9:39:31 AM
1class Solution {
2    public List<List<Integer>> minimumAbsDifference(int[] arr) {
3        List<List<Integer>> l = new ArrayList<>();
4
5        Arrays.sort(arr);
6
7        int min_diff = arr[1]-arr[0];
8
9        for(int i=0;i<arr.length-1;i++){
10            int diff = arr[i + 1] - arr[i];
11
12            if (diff < min_diff) {
13                min_diff = diff;
14                l.clear();
15            }
16
17            List<Integer> lst = new ArrayList<>();
18            if(arr[i+1] - arr[i] <= min_diff){
19                min_diff = arr[i+1] - arr[i];
20                lst.add(arr[i]);
21                lst.add(arr[i+1]);
22            }
23            if(lst.isEmpty()) continue;
24            l.add(lst);
25        }
26        return l;
27    }
28}