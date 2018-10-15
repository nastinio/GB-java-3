package com.nastinio;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        String[] arr = {"a","b","c","d"};
        System.out.println(main.swapItems(arr,0,3));
    }

    // Task 1
    // Метод, который меняет два элемента массива местами.(Массив может быть любого ссылочного типа)
    public <E> boolean swapItems(E[] input, int indexFirst, int indexSecond)  {
        System.out.print("input:  ");
        printArray(input);
        if (input.length == 0 || indexFirst >= input.length || indexSecond >= input.length) {
            return false;
        }else{
            E temp = input[indexFirst];
            input[indexFirst] = input[indexSecond];
            input[indexSecond] = temp;
            System.out.print("result: ");
            printArray(input);
            return true;
        }

    }

    public <E> void printArray(E[] input){
        for(E temp:input){
            System.out.print(temp + " ");
        }
        System.out.println();
    }

    // Task 2
    // Метод, который преобразует массив в ArrayList;
    public <T> ArrayList<T> castArrayToArrayList(T[] input) {
        // boolean isInputPrimitive = input.getClass().getComponentType().isPrimitive();
        ArrayList<T> arrayList = new ArrayList<>();
        for (T temp : input) {
            arrayList.add(temp);
        }
        return arrayList;
    }

}
