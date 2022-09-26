# Fielo Test - Looking for Bananas in the Monkeys island

## Problem Statment
You have been given an N x M matrix filled with integer numbers, find the maximum sum that can be obtained from a path starting from any cell in the first row to any cell in the last row.
From a cell in a row, you can move to another cell directly below that row, right or diagonally below right. So from a particular cell (row, col), we can move in three directions i.e.

```python    
    [ 1 2 3 ]                 [ 1 2 3 ]               [ 1 2 3 ]
A = [ 4 5 6 ]  7 (2,0)   =>   [ 4 5 6 ]  8 (2,1)  =>  [ 4 5 6 ]  9 (2,2)
    [ 7 8 9 ]                 [ * * 9 ]               [ * * * ] 

Total is 24 bananas, for example.
````

- Down: (row+1, col)
- Rigth: (row, col+1)
- Down right diagonal: (row+1, col+1)


### Input Format :
The first line contains an integer 'T', which denotes the number of test cases or queries to be run. Then the test cases follow.
The first line of each test case contains two Integers 'N' and 'M' where 'N' denotes the number of rows in the given matrix. And 'M' denotes the number of columns in the given matrix.
The next 'N' line of each test case contains 'M' space-separated integers denoting the cell elements.


### Output Format :
For each test case/query, print the maximum sum that can be obtained by taking a path as described above.
Output for every test case will be printed in a separate line.

### Solution:
This problem can be solved using dynamic programming. The excavation procedure is said to be complete only when we reach the bottom. So the smallest problem is when we are already in the last column.
The largest/biggest problem is when we are in the first column. So the resolution direction will be from the last column to the first column.
Also, the last column will have the same values as the last column of the input matrix.
Thus, we have identified the direction of solving and we have also filled in the last column.

### Final Analysis:
Time Complexity is O(N x M), where N and M are the dimensions of the matrix to traversing.

Space Complexity of the above solution is also O(N x M).