package com.testing.myself;

public class NoOfIsland {
    public static void main(String[] args) {

    }

    void dfs(int grid[][], int r, int c) {
        int row = grid.length;
        int col = grid[0].length;

        if(r<0 || c <0 || r>=row || c >= col || grid[r][c] == 0){
            return;
        }
        grid[r][c] = 0;
        dfs(grid,r-1,c);
        dfs(grid,r+1,c);
        dfs(grid,r,c-1);
        dfs(grid,r,c+1);
    }

    int noOfIsland(int grid[][], int r, int c) {
        int count = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if(grid[i][j]==1){
                    count++;
                    dfs(grid, i, j);
                }
            }
        }
        return count;
    }
}
