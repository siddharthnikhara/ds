package com.example.recursion;

public class RemoveDuplicatesInString {
    static boolean map[] = new boolean[26];

    public static void main(String[] args) {
        String st= "axabbcdc";
        removeDuplicatesInString(st,0,"");
    }
    static void removeDuplicatesInString(String s, int index,String newString){
        if(index==s.length()-1){
            System.out.println(newString);
            return;
        }
        if(!map[s.charAt(index)-'a']==true){
            newString+=s.charAt(index);
            map[s.charAt(index)-'a']=true;
            removeDuplicatesInString(s,index+1,newString);

        }else{
            removeDuplicatesInString(s,index+1,newString);
        }

    }
}
