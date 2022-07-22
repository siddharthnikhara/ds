package com.example.hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.abs;

public class FindPositiveAndNegativePair {
    public static void main(String[] args) {
    long a [ ] = {1, -3, 2, 3, 6, -1, -3, 3};
    long n = 8;
    long c[]=PosNegPair(a,n);
        for(int i=0;i<c.length;i++){
            if(c[i]!=0) {
                System.out.print(c[i] + " ");
            }
        }
    }

    public static long[] PosNegPair(long a[], long n) {

        long a1[] = new long[8];
        long answer[] = new long[8];
        int j = 0;
        Map<Long, Integer> map = new HashMap();
        for (int i = 0; i < n; i++) {
            if (a[i] < 0) {
                a1[j] = a[i];
                j++;
            } else if (a[i] >= 0) {
                if (map.containsKey(a[i])) {
                    map.put(a[i], map.get(a[i]) + 1);
                } else {
                    map.put(a[i], 1);
                }
            }
        }
        Arrays.sort(a1);
        int k=-1;
        for(int i=a1.length-1;i>= 0;i--){
            long data=abs(a1[i]);
            if(map.containsKey(data)){
                long temp =a1[i];
                if (map.get(data)>0){
                    answer[++k]=temp;
                    answer[++k]=data;
                    int m=map.get(data);
                    m-=1;
                }

            }
        }
        return answer;
    }
}
