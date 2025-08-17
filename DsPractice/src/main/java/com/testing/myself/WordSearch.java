package com.testing.myself;

public class WordSearch {
    public static void main(String[] args) {

    }

    public boolean exist(int grid[][], String word) {
        int row = grid.length;
        int col = grid[0].length;
        for(int i =0;i<row;i++) {
            for(int j=0;j<col;j++){
                if(dfs(grid, word, i, j, 0)){
                    return true;
                }
            }
        }
        return false;
    }

    boolean dfs(int grid[][], String word, int r, int c, int index) {
        int row=grid.length;
        int col= grid[0].length;
        if(r<0 || c<0 || r>=row || c>= col || grid[r][c] != word.charAt(index)) {
            return false;
        }
        int temp =  grid[r][c];
        grid[r][c]='#';
        boolean found  = dfs(grid, word, r-1, c, index+1) ||
                dfs(grid, word, r+1, c, index+1) || dfs(grid, word, r, c-1, index+1)
                || dfs(grid, word, r, c-+1, index+1);
        grid[r][c] = temp;
        return found;
    }



    static class DFSGrid {
        static void dfsGrid(int grid[][], int r, int c) {
            int row = grid.length;
            int col= grid[0].length;
            if (r<0 || c<0 || r>=row || c>= col || grid[r][c]==0){
                return;
            }
            grid[r][c]=0;
            dfsGrid(grid, r-1, c);dfsGrid(grid, r+1, c);
            dfsGrid(grid, r, c-1);dfsGrid(grid, r, c+1);
        }
    }
}
