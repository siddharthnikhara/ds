package com.example.hashing;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class WinnerOfAnElection {
    public static void main(String[] args) {
        String Votes[] = {"john", "johnny", "jackie", "johnny", "john",
                "jackie", "jamie", "jamie", "john", "johnny", "jamie",
                "johnny", "john"};
        int n = 13;
        String s[]=winner(Votes,13);
        System.out.println(s[0]+ " "+ s[1]);

    }

    static String[] winner(String arr[], int n) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        Iterator itr = map.entrySet().iterator();
        int vote  =0;
        String name ="";
        while (itr.hasNext()) {
            Map.Entry<String, Integer> enttry = (Map.Entry<String, Integer>) itr.next();
            int value = enttry.getValue();
            String key = enttry.getKey();
            if(vote<value){
                vote=value;
                name=key;
            }else if(vote==value){
                if(name.length()>key.length()){
                    name=key;
                }
            }
        }
        String arr1[]=new String[2];
        arr1[0]=name;
        arr1[1]=String.valueOf(vote);
        return arr1;
    }
}
