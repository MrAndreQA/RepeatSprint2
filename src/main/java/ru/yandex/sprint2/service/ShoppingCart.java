package ru.yandex.sprint2.service;

import ru.yandex.sprint2.model.Apple;
import ru.yandex.sprint2.model.Food;
import ru.yandex.sprint2.model.Water;



public class ShoppingCart {

    private final Food[] foods;

    public ShoppingCart(Food[] foods) {
        this.foods = foods;
    }

    public double getTotalSum() {
        int totalSum = 0;
        for (Food food : this.foods) {
            totalSum += food.getAmount() * food.getPrice();
        }
        return totalSum;
    }

    public double getDiscountTotalSum() {
        double totalSum = 0;
        for (Food food : foods) {
            double discountPercent = (100 - food.getDiscount()) / 100.0;
            double priceWithDiscount = food.getAmount() * food.getPrice() * discountPercent;
            totalSum = totalSum + priceWithDiscount;
        }
        return totalSum;
    }

    public double getVeganTotalSum() {
        int veganTotalSum = 0;
        for (Food food : this.foods) {
            if (food.isVegetarian()) {
                veganTotalSum += food.getAmount() * food.getPrice();
            }
        }
        return veganTotalSum;
    }

    public double getVeganWithDiscount() {
        double totalSum = 0;
        for (Food food: this.foods) {
            if (food.isVegetarian()) {
                double discountPercent = (100 - food.getDiscount()) / 100.0;
                double priceWithDiscount = food.getAmount() * food.getPrice() * discountPercent;
                totalSum = totalSum + priceWithDiscount;
            }
        }
        return totalSum;
    }

    public double getNoVeganTotalSum() {
        double totalSum = 0;
        for (Food food: this.foods) {
            if (!food.isVegetarian()) {
                totalSum = totalSum + food.getAmount()*food.getPrice();
            }
        }
        return totalSum;
    }

}