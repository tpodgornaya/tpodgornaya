package com.playtika.automation.pizza;

public class PizzaAutomat {

    private final PizzaMakerFactory pizzaMakerFactory;

    public PizzaAutomat(PizzaMakerFactory pizzaMakerFactory) {
        this.pizzaMakerFactory = pizzaMakerFactory;
    }

    public String getPizza(Button button) {
        AbstractPizzaMaker maker = pizzaMakerFactory.getPizzaMaker(button);
        return maker.makePizza();
    }

    public static void main(String[] args) {
        PizzaAutomat automat = new PizzaAutomat(new UkrainMakerFactory());
        String pizza = automat.getPizza(Button.BUTTON_3);
        System.out.println("Сьели, ням-ням-ням " + pizza);

    }

}
