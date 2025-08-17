package com.abstractfactory;

public class AbstractFactoryVehicle {
    VehicleFactory getProductType(String type){
        if(type == "luxury") {
            return new LuxuryVehicleFactory();
        } else {
            return new OrdinaryVehicleFactory();
        }
    }

    public static void main(String[] args) {
        AbstractFactoryVehicle abstractFactoryVehicle = new AbstractFactoryVehicle();
        abstractFactoryVehicle.getProductType("luxury").getVehicle("mercedes").start();
    }
}
