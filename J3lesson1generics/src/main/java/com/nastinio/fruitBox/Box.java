package com.nastinio.fruitBox;

import java.util.ArrayList;

public class Box<E extends Fruit> {
    public ArrayList<E> fruitBox;
    private int countFruit;
    private String classBox;

    Box() {
        this.fruitBox = new ArrayList<>();
        this.countFruit = 0;
        this.classBox = null;
    }

    public void add(E fruit) {
        if (fruit == null) return;
        if (fruitBox.size() == 0) {
            // Определим класс хранящихся в коробке объектов
            classBox = fruit.getClass().getName();
            System.out.println("Кладем в коробку: " + classBox);
        }
        fruitBox.add(fruit);
        countFruit++;
    }

    public float getWeight() {
        if (fruitBox.size() == 0) return 0;
        return countFruit * fruitBox.get(0).getWeight();
    }

    public boolean compare(Box box) {
        return this.getWeight() == box.getWeight();
    }

    public void addAllFrom(Box box) {
        if (!this.classBox.equals(box.classBox)) return;
        fruitBox.addAll(box.fruitBox);
        this.countFruit += box.countFruit;
        box.cleanOutBox();
    }

    public void cleanOutBox() {
        this.fruitBox.clear();
        this.classBox = null;
        this.countFruit = 0;

    }

    public void printFruitBox() {
        System.out.println("Тип фруктов: " + classBox);
        System.out.println("Общий вес:   " + getWeight());
    }

}
