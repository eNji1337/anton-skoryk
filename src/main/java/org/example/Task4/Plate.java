package org.example.Task4;

public class Plate {
    private int amountOfFood;

    Plate(int amountOfFood) {
        this.amountOfFood = amountOfFood;
    }

    @Override
    public String toString() {
        return "PLATE: " + amountOfFood;
    }

    void decreaseFood(int appetite) {
        if (amountOfFood >= appetite) {
            amountOfFood -= appetite;
        }
    }

    int getAmountOfFood() {
        return amountOfFood;
    }

    void increaseFood(int amount) {  //метод, с помощью которого можно было бы добавлять еду в тарелку.
        amountOfFood += amount;
    }
}