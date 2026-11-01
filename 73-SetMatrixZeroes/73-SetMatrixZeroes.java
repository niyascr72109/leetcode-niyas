// Last updated: 11/1/2026, 10:12:20 AM
1class Solution {
2    public void setZeroes(int[][] matrix) {
3        int col0 = 1;
4        int row = matrix.length;
5        int col = matrix[0].length;
6        for(int i=0;i<row;i++){
7            for(int j=0;j<col;j++){
8                if(matrix[i][j] == 0){
9                    matrix[i][0] = 0;
10                    if(j == 0) col0 = 0;
11                    else matrix[0][j] = 0;
12                }
13            }
14        }
15
16        for(int i=1;i<row;i++){
17            for(int j=1;j<col;j++){
18                if(matrix[i][j] != 0){
19                    if(matrix[0][j] ==0 || matrix[i][0] == 0){
20                        matrix[i][j]=0;
21                    }
22                }
23            }
24        }
25        if(matrix[0][0]==0){
26            for(int j=0;j<col;j++){
27                matrix[0][j] = 0;
28            }
29        }
30
31        if(col0 == 0){
32            for(int i=0;i<row;i++){
33                matrix[i][0] = 0;
34            }
35        }
36    }
37}