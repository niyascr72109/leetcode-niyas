// Last updated: 11/1/2026, 10:48:39 AM
1class Solution {
2
3    void reverse(int matrix[][], int row, int left, int right) {
4        while(left < right) {
5            int temp = matrix[row][left];
6            matrix[row][left] = matrix[row][right];
7            matrix[row][right] = temp;
8
9            left++;
10            right--;
11        }
12    }
13
14    public void rotate(int[][] matrix) {
15
16        int row = matrix.length;
17        int col = matrix[0].length;
18
19        for(int i = 0; i < row; i++) {
20            for(int j = i + 1; j < col; j++) {
21                int temp = matrix[i][j];
22                matrix[i][j] = matrix[j][i];
23                matrix[j][i] = temp;
24            }
25        }
26
27        for(int i = 0; i < row; i++) {
28            reverse(matrix, i, 0, col - 1);
29        }
30    }
31}