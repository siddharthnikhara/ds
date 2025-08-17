package com.adapter;

public class WeightMachineAdapterImpl implements WeightMachineAdapter{
    @Override
    public double weighMachineInKg() {
        WeightMachineInPound weightMachineInPound = new WeightMachineInPound();
        int t = weightMachineInPound.weighMachinePound();
        return t*1.5;
    }

    public static void main(String[] args) {
        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl();
        System.out.println(weightMachineAdapter.weighMachineInKg());
    }
}
