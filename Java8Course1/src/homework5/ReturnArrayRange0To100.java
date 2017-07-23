package homework5;

import java.util.Random;

public class ReturnArrayRange0To100 {

    public static int [] createArray(int size){
        int[] a = new int[size];
        Random random = new Random();
        int lowerCase = - 100;
        int maxCase = 1000;

        for (int i = 0; i < size; i++) {
            a[i] = lowerCase + random.nextInt(maxCase - lowerCase);
        }

        return a;
    }

    public static int[] returnArrayRange0To100(int[] a){
        // Cчетчик входного массива
        int count = a.length;
        // Создаём временный массив куда собираем числа
        // из диапазона 0 < a[i] < 100
        int[] tmp = new int[count];
        // Cчетчик временного массива, чтобы заполнять без "дырок"
        int next = 0;
        for (int i = 0; i < count; i++) {
            if(0 < a[i] && a[i] < 100){
                tmp[next] = a[i];
                next++;
            }

        }

        // Создаем выходной массив длиной счётчику
        // заполненных элементов временного массива,
        // заполняем и возвращаем
        int[] b = new int[next];
        for (int g = 0; g < next; g++) {
            b[g] = tmp[g];
        }
        return b;
    }
}
