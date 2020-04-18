package ru.avalon.java.dev.j10.labs.initialization;

import java.util.Arrays;
import ru.avalon.java.dev.j10.labs.Initializer;

/**
 * Инициализатор, выполняющий инициализацию массива
 * значениями последовательности случайных чисел.
 *
 * <p>Экземпляры класса можно использовать многократно для
 * инициализации любого числа массивов.
 *
 * <p>Диапазон, в пределах которого будут получены случайные
 * значения, передаётся в конструктор класса при
 * инициализации.
 */
public class RandomInitializer implements Initializer {
    int a; // Нижняя граница диапазона случайных чисел
    int b; // Верхняя граница диапазона случайных чисел

    public RandomInitializer(int a, int b) {
        this.a = a;
        this.b = b;
    }

    /**
     * Выполняет инициализацию массива, значениями
     * последовательности случайных чисел.
     *
     * @param array массив, подлежащий инициализации
     */
    @Override
    public void initialize(int[] array) {
        /*
         * TODO(Студент): Реализовать метод initialize класса RandomInitializer
         */
        int c = b - a; // Диапазон случайных чисел
        
        for (int i = 0; i < array.length; i++) {
            array[i]  = (int) Math.round((Math.random() * c) + a);
        }
        
        System.out.println(Arrays.toString(array));
    }
}
