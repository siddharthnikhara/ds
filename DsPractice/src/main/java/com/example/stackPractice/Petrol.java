package com.example.stackPractice;

public class Petrol {
    static class petrolPump {
        int petrol;
        int distance;

        public petrolPump(int petrol, int distance) {
            this.petrol = petrol;
            this.distance = distance;
        }
    }

    static int printTour(petrolPump arr[], int n) {
        int extraFuel = 0;
        int requiredFuel = 0;
        int start = 0;
        for (int i = 0; i < arr.length; i++) {
            extraFuel += (arr[i].petrol - arr[i].distance);
            if (extraFuel < 0) {
                requiredFuel += extraFuel;
                start = i+1;
                extraFuel = 0;
            }
        }
        if (extraFuel + requiredFuel >= 0) {
            return start;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        petrolPump[] arr = {new petrolPump(6, 4), new petrolPump(3, 6), new petrolPump(7, 3)};

        int start = printTour(arr, arr.length);

        System.out.println(start == -1 ? "No Solution" : "Start = " + start);
    }
}