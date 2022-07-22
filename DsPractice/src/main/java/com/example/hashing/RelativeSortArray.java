package com.example.hashing;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class RelativeSortArray {
    public static void main(String[] args) {
        int arr1[] = {2,3,1,3,2,4,6,7,9,2,19,19}, arr2[] = {2,1,4,3,9,6};
        int res[]=relativeSortArray(arr1,arr2);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
    static int[] relativeSortArray(int a[], int b[]){
        int result[]= new int[a.length];
        int co=-1;
        Map<Integer,Integer> map = new TreeMap<>();
        for(int i=0;i<a.length;i++){
            if(map.containsKey(a[i])){
                map.put(a[i],map.get(a[i])+1);
            }else{
                map.put(a[i],1);
            }
        }
        for(int i=0;i<b.length;i++){
                int data = map.get(b[i]);
                while (data > 0) {
                    if(data!=1) {
                        result[++co] = b[i];
                        data--;
                        map.put(b[i], data);
                    }else{
                        result[++co] = b[i];
                        data--;
                        map.remove(b[i]);
                    }
                }
        }
        while (!map.isEmpty()){
            Iterator itr=map.entrySet().iterator();
            while(itr.hasNext()){
                Map.Entry<Integer,Integer> map1 = (Map.Entry<Integer, Integer>) itr.next();
                while(map1.getValue()>0) {
                    result[++co] = map1.getKey();
                    map.put(map1.getKey(),map1.getValue()-1);
                }
            }
            break;
        }

        return result;
    }
}
