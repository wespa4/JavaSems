package practice3;
import java.util.Arrays;
import java.util.Random;
/* Создать массив вещественных чисел случайным образом, вывести его на экран, отсортировать его,
и снова вывести на экран (использовать два подхода к генерации случайных чисел – метод random()
класса Math и класс Random)*/
public class ArrayRandom {
    public static void main(String[] args) {
        double[] array1 = new double[10];
        double[] array2 = new double[10];
        // Генерируем рандомные числа с помощью класса Random
        Random rand = new Random();
        for(int i = 0; i < array1.length; i++){
            array1[i] = rand.nextDouble() * 100;
        }
        // Генерируем рандомные числа с помощью метода Math.random()
        for (int i = 0; i < array2.length; i++) {
            array2[i] = Math.random() * 100;
        }

        System.out.println("Array 1 : "+Arrays.toString(array1));
        System.out.println("Array 2 : "+Arrays.toString(array2));

        Arrays.sort(array1);
        Arrays.sort(array2);

        System.out.println("Sorted Array 1 : "+Arrays.toString(array1));
        System.out.println("Sorted Array 2 : "+Arrays.toString(array2));
    }
}
