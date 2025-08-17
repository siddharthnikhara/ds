package com.builder;

public class Car {
    private final String engine;
    private final String seat;

    private Car(CarBuilder carBuilder){
        this.engine = carBuilder.engine;
        this.seat = carBuilder.seat;
    }
    static class CarBuilder {
        private static String engine;
        private static String seat;

        CarBuilder setEngine(String engine){
            this.engine = engine;
            return this;
        }
        CarBuilder setSeat(String seat){
            this.seat = seat;
            return this;
        }

        Car build(){
           return new Car(this);
        }
    }

    public static void main(String[] args) {
        Car car = new CarBuilder().setEngine("kia").setSeat("leather").build();
        System.out.println(car);
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", seat='" + seat + '\'' +
                '}';
    }
}
