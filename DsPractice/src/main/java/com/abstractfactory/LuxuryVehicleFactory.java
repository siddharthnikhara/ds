package com.abstractfactory;

public class LuxuryVehicleFactory  implements VehicleFactory{
    public Vehicle getVehicle(String model) {
        if (model == "mercedes") {
            return new Mercedes();
        } else {
            return new BMW();
        }
    }
}
