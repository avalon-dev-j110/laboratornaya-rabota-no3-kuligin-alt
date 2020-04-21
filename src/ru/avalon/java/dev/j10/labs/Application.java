package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.initialization.*;
import ru.avalon.java.dev.j10.labs.sort.*;

public class Application {

    public static void main(String[] args) {
        int[] array = new int[20];
        
        FibonacciInitializer fiboDemo = new FibonacciInitializer();
        
        System.out.println("Массив, заполненый числами фибоначи:");
        fiboDemo.initialize(array);
          
        // Вычисление суммы элементов массива:
        int sum = 0; 
        for(int x : array) {
            sum = sum + x;
        }
        
        System.out.println("Сумма элементов массива, заполненного числами фибоначи: " + sum);
        System.out.println();
        
        
        RandomInitializer randomArray = new RandomInitializer(-50, 50);
        
        System.out.println("Массив, заполненный случайными числами:");
        randomArray.initialize(array);
        System.out.println();
        
        BubbleSort bubbleDemo = new BubbleSort();
        System.out.println("Пузырьковая сортировка:");
        bubbleDemo.sort(array); // Демонстрация пузырьковой сортировки массива.  
        System.out.println();
        
        
        System.out.println("Массив, заполненный случайными числами:");
        randomArray.initialize(array);
        System.out.println();
        
        SelectionSort selectDemo = new SelectionSort();
        System.out.println("Сортировка выбором:");
        selectDemo.sort(array); // Демонстрация сортировки выбором.  
        System.out.println();
        
          
        System.out.println("Массив, заполненный случайными числами:");
        randomArray.initialize(array);
        System.out.println();
        
        ShellSort shellDemo = new ShellSort();
        System.out.println("Сортировка Шелла:");
        shellDemo.sort(array); // Демонстрация сортировки.

	    /*
	     * TODO(Студент): Выполнить действия над массивом чисел
	     *
	     * 0. Инициализировать переменную array массивом из 20 целых чисел.
	     *
	     * 1. Проинициализировать массив значениями
	     *    последовательности чисел Фибоначчи.
	     *
	     * 2. Найти сумму элементов массива.
	     *
	     * 3. Проинициализировать массив последовательностью
	     *    случайных чисел в диапазоне от -50 до 50.
	     *
	     * 4. Отсортировать массив с использованием
	     *    пузырьковой сортировки.
	     *
         * 5. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         *
         * 6. Отсортировать массив с использованием
         *    сортировки выбором.
         *
         * 7. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         *
         * 8. Отсортировать массив с использованием
         *    сортировки Шелла.
	     */
    }
}
