package ru.yandex.sprint2.model;

import static ru.yandex.sprint2.model.constants.Colour.*;
import static ru.yandex.sprint2.model.constants.Discount.*;

public class Apple extends Food {
    private String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price,true);
        this.colour = colour;
    }
    @Override
    public double getDiscount() {
        if (colour.equals(RED_COLOUR)) {
            return DISCOUNT_60;
        } else {
            return super.getDiscount();
        }
    }

}
