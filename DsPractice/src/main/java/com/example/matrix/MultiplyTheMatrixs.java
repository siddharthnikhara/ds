package com.example.matrix;

public class MultiplyTheMatrixs {
    public static void main(String[] args) {
        int s1[][]={{1,2,3},{4,5,6}};
        int s2[][]={{1,2},{3,4},{5,6}};
        int res[][]=multiplyTheMatrixs(s1,s2);
        for(int i=0;i< res.length;i++){
            for(int j=0;j<res.length;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int[][] multiplyTheMatrixs(int s1[][], int s2[][]) {
        int n1, n2, m1, m2;
        //row
        n1 = s1.length;
        n2 = s2.length;

        //col
        m1 = s1[0].length;
        m2 = s2[0].length;
        int ans[][] = new int[2][2];
        if (m1 == n2) {
            for (int i = 0; i < n1; i++) {
                for (int j = 0; j < m2; j++) {
                    int sum = 0;
                    for (int k = 0; k < n2; k++) {
                        sum += (s1[i][k] * s2[k][j]);
                    }
                    ans[i][j] = sum;
                }
            }
        }
        return ans;
    }
}