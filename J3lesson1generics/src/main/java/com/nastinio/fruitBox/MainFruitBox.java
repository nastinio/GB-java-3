package com.nastinio.fruitBox;

public class MainFruitBox {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        int countApples = 5;
        for(int i = 0; i< countApples; i++){
            appleBox.add(new Apple());
        }
        appleBox.printFruitBox();
        System.out.println("---------------");

        Box<Orange> orangeBox1 = new Box<>();
        int countOranges1 = 7;
        for(int i = 0; i< countOranges1; i++){
            orangeBox1.add(new Orange());
        }
        orangeBox1.printFruitBox();
        System.out.println("---------------");

        System.out.println("orangeBox1 == appleBox: " + orangeBox1.compare(appleBox));

        Box<Orange> orangeBox2 = new Box<>();
        int countOranges2 = 3;
        for(int i = 0; i< countOranges2; i++){
            orangeBox2.add(new Orange());
        }
        orangeBox2.printFruitBox();
        System.out.println("---------------");

        System.out.println("Пересыпем");
        orangeBox1.addAllFrom(orangeBox2);
        orangeBox1.printFruitBox();
        orangeBox2.printFruitBox();

    }
}
