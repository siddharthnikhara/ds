package com.example.matrix;

public class NumberOfIsland {
    public static void main(String[] args) {
        char M[][] = new char[][] { { '1', '1', '0', '0', '0' },
                { '0', '1', '0', '0', '1' },
                { '1', '0', '0', '1', '1' },
                { '0', '0', '0', '0', '0' },
                { '1', '0', '1', '0', '1' } };
        System.out.println("Number of islands is: " + numsOfIsland(M));
    }
   static int numsOfIsland(char[][] grid){
        int ans=0;
        int n=grid.length;
        int m =grid[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    ans++;
                    numsOfIslandRec(i,j,n,m,grid);
                }
            }
        }
        return ans;
    }

  static  private void numsOfIslandRec(int i, int j, int n, int m, char[][] grid) {
        grid[i][j]='0';
        if(isValid(i+1,j,n,m,grid)){
            numsOfIslandRec(i+1,j,n,m,grid);
        }
        if(isValid(i-1,j,n,m,grid)){
            numsOfIslandRec(i-1,j,n,m,grid);
        }
        if(isValid(i,j+1,n,m,grid)){
            numsOfIslandRec(i,j+1,n,m,grid);
        }
        if(isValid(i,j-1,n,m,grid)){
            numsOfIslandRec(i,j-1,n,m,grid);
        }
    }
   static boolean isValid(int i, int j, int n, int m, char[][] grid){
        if(i>=0 && i<n && j>=0 &&j<m && grid[i][j]=='1'){
            return true;
        }else{
            return false;
        }
    }
}
