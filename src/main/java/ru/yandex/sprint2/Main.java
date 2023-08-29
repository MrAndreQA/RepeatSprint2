package ru.yandex.sprint2;

import ru.yandex.sprint2.model.Apple;
import ru.yandex.sprint2.model.Food;
import ru.yandex.sprint2.model.Meat;
import ru.yandex.sprint2.model.Water;
import ru.yandex.sprint2.model.constants.Colour;
import ru.yandex.sprint2.service.ShoppingCart;

public class Main {
    public static void main(String[] args) {

        Meat meat = new Meat(5, 100);
        Apple redApple = new Apple(10, 50, Colour.RED_COLOUR);
        Apple greenApple = new Apple(8, 60, Colour.GREEN_COLOUR);
        Water water = new Water(10,50,true);

        Food[] foods = {meat,redApple,greenApple,water};
        ShoppingCart shoppingCart = new ShoppingCart(foods);

        System.out.println("Общая сумма товаров в корзине без скидки: " + shoppingCart.getTotalSum());
        System.out.println("Общая сумма товаров в корзине со скидкой: " + shoppingCart.getDiscountTotalSum());
        System.out.println("Общая сумма всех вегетарианских продуктов в корзине без скидки: " + shoppingCart.getVeganTotalSum());

        // сумма веганский продуктов со скидкой
        System.out.println("Общая сумма всех вегетарианских продуктов в корзине со скидкой: " + shoppingCart.getVeganWithDiscount());
        // сумма не веганских продуктов без скидки
        System.out.println("Общая сумма всех Невегетарианских продуктов в корзине без скидки: " + shoppingCart.getNoVeganTotalSum());
        }
    }