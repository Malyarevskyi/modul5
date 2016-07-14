package dz5_1;

import java.util.Arrays;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {

        System.out.println("Для ввода масива в ручнею нажмите 1 \n" +
                "Для генерации массива нажмите 2 \n" +
                "Для выхода нажмите 0\n");
        Scanner scanner = new Scanner(System.in);
        int inputmenu = scanner.nextInt();
        System.out.println("Введите длину массива:");
        int size = scanner.nextInt();
        int array[] = new int[size];

            if (inputmenu == 1) {
            System.out.println("Введите элементы массива:");
                for (int i = 0; i < size; i++) {
                    array[i] = scanner.nextInt();
                }
                System.out.print("Введенный массив элементов:");
                for (int i = 0; i < size; i++) {
                    System.out.print(" " + array[i]);
                }

            }
            if (inputmenu == 2) {
                for (int i = 0; i < size; i++) {
                array[i] = (int) (Math.random() * 100);
            }
            System.out.print("Рендомный массив элементов:");
            for (int i = 0; i < size; i++) {
                System.out.print(" " + array[i]);
            }

            }
            if (inputmenu == 0) {
                System.exit(0);
            }
        System.out.println("\nМинимальный элемент массива: " + ArrayUtils.MinOfArray(array)
                +"\nМаксимальный элемент массива: "+ ArrayUtils.MaxOfArray(array)+ "\n");

        System.out.println("Для сортировки масива методом пузырька нажмите 1 \n" +
                "Для сортировки масива встроенным методом Array.sort() нажмите 2 \n" +
                "Для выхода нажмите 0\n");
        int inputmenu2 = scanner.nextInt();
        int [] rezerMassort = array.clone();
        if (inputmenu2 == 1){
            Sorter.BubbleSort(rezerMassort);
        }
        if (inputmenu2 == 2){
            Arrays.sort(rezerMassort);
        }
        if (inputmenu2 == 0){
            System.exit(0);
        }
        System.out.print("Отсортированный массив элементов:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + rezerMassort[i]);
        }
    }

}
