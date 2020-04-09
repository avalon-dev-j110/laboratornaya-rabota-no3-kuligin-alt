package ru.avalon.java.dev.j10.labs.sort;

import ru.avalon.java.dev.j10.labs.Sort;

/**
 * Сортировка Шелла (англ. Shell sort).
 *
 * <p>Алгоритм сортировки, являющийся усовершенствованным
 * вариантом сортировки вставками. Идея метода Шелла состоит
 * в сравнении элементов, стоящих не только рядом, но и на
 * определённом расстоянии друг от друга. Иными словами —
 * это сортировка вставками с предварительными «грубыми»
 * проходами. Аналогичный метод усовершенствования
 * пузырьковой сортировки называется сортировка расчёской.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A1%D0%BE%D1%80%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%BA%D0%B0_%D0%A8%D0%B5%D0%BB%D0%BB%D0%B0">Сортировка Шелла</a>
 */
public class ShellSort implements Sort {

    /**
     * {@inheritDoc}
     */
    public void sort(int[] array) {
        /*
         * TODO(Студент): Реализовать метод sort класса ShellSort
         */
        
        for (int inc = (array.length / 2); inc >= 1; inc = inc / 2) {
            for (int step = 0; step < inc; step++) {
                insertionSort (array, step, inc);
            }
        }
        // Вывод на экран отсортированного массива:
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    
    private void insertionSort (int[] array, int start, int inc) {
        int tmp;
        
        for (int i = start; i < array.length - 1; i += inc) {
            for (int j = Math.min(i+inc, array.length-1); j-inc >= 0; j = j-inc) {
                if (array[j-inc] > array[j]) {
                    tmp = array[j];
                    array[j] = array[j-inc];
                    array[j-inc] = tmp;
                } else break;
                
            }
        }
    }
}
