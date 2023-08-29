package ru.yandex.sprint2.model;

import ru.yandex.sprint2.model.constants.Discount;

public class Water extends Food{
    private static boolean isGasInWater;

    public Water(int amount, double price, boolean isGasInWater) {
        super(amount,price,true);
        this.isGasInWater = isGasInWater;
    }

    public boolean isGasInWater() {
        return isGasInWater;
    }
    @Override
    public double getDiscount(){
        if (isGasInWater) {
            return Discount.DISCOUNT_20;
        } else {
            return super.getDiscount();
        }
    }
}
