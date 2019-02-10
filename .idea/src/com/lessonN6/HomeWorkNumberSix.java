package com.lessonN6;

public class HomeWorkNumberSix {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 5, 9, 15, 28, 33};
        int[] newArr = {7, 55, 14, 28, 3};

        findIndexOfElement(arr, 15);

        findValueInArray(newArr, 15);

        findValueInArray2(newArr, 15);

        printEverySecondElementOfArr(arr);

        System.out.println(); // Перенос строки

        maxValueInArr(arr, arr[0]);

        outputItemInOrder(arr);

        System.out.println();// Перенос строки

        outputItemsInReverseOrder(arr);
    }

    //Найти индекс элемента, значение которого равно 15.
    private static void findIndexOfElement(int[] arr, int value) { //Value - нужное нам значение
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                System.out.println("Element index whose value is 15 = " + i);
            }
        }
    }

    // 2. То же самое, но чтобы 15 не было в массиве,
    // т е пройтись по всем элементам, ничего не найти и вывести в консоль, что ничего не нашли.
    private static int findValueInArray(int[] newArr, int value) {
        int counter = 0; // Счетчик
        for (int i = 0; i < newArr.length; i++) {
            if (newArr[i] == value) {
                System.out.println("Index - " + i + " Value - " + newArr[i]);
                return i;
            } else {
                counter++;
            }
        }
        if (counter == newArr.length) {
            System.out.println("Value 15 does not exist");
        }
        return -1;
    }

    //While // 2. То же самое, но чтобы 15 не было в массиве
    private static int findValueInArray2(int[] newArr, int value) {
        int i = 0;
        int counter = 0; // Счетчик
        while (i < newArr.length) {
            if (newArr[i] == value) {
                System.out.println("Index - " + i + " Value - " + newArr[i]);
                return i;
            } else {
                counter++;
            }
            i++;
        }
        if (counter == newArr.length) {
            System.out.println("Value 15 does not exist");
        }
        return -1;
    }

    // Каждый второй элемент массива
    private static void printEverySecondElementOfArr(int[] arr) {
        System.out.print("Every second element of arr: ");
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    // Максимальный элемент в массиве
    private static int maxValueInArr(int[] arr, int maxValue) {
        for (int i = 0; i < arr.length; i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }
        }
        System.out.println("Max value in the array: " + maxValue);
        return maxValue;
    }

    //Вывести все элементы на консоль по порядку в формате [1,2,3,4,5]
    private static void outputItemInOrder(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1)
                System.out.print(arr[i] + "]");
            else
                System.out.print(arr[i] + ", ");
        }
    }

    //Вывести все элементы на консоль в обратном порядке
    private static void outputItemsInReverseOrder(int[] arr) {
        System.out.print("[");
        for (int i = arr.length - 1; i != -1; i--) {
            if (i == 0)
                System.out.print(arr[i] + "]");
            else
                System.out.print(arr[i] + ", ");
        }
    }
}
