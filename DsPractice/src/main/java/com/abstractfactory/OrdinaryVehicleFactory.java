package com.abstractfactory;

public class OrdinaryVehicleFactory implements VehicleFactory{
    public Vehicle getVehicle(String model) {
        if (model == "nexon") {
            return new Nexon();
        } else {
            return new Safari();
        }
    }

//    public static void main(String[] args) {
//        OrdinaryVehicleFactory ordinaryVehicleFactory = new OrdinaryVehicleFactory();
//        ordinaryVehicleFactory.getVehicle("safari").start();
//    }
}
