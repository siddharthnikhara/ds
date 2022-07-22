package com.example.stackPractice;

public class CircularTourPetrol {
    public static void main(String[] args) {
        int Petrol[] = {4, 6, 7, 4};
        int Distance[] = {6, 5, 3, 5};
        System.out.println(circularTourPetrol(Petrol,Distance));
    }

    static int circularTourPetrol(int petrol[], int distance[]) {
        int idx = 0;
        int requiredFuel = 0;
        int extraFuel =0;
        for (int i = 0; i < petrol.length; i++) {
            extraFuel += (petrol[i]-distance[i]);
            if (extraFuel < 0) {
                requiredFuel += extraFuel;
                idx=i+1;
                extraFuel=0;
            }
        }
        if(extraFuel+requiredFuel>=0){
            return idx;
        }else{
            return -1;
        }
    }
}
