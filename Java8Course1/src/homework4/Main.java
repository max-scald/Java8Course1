package homework4;

import homework5.ReturnArrayRange0To100;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("1--------------------------------------------");

        // Тестируем соединение двух массивов double[] в одном и обратную сортировку
        double[] a = MergeAndReverseTwoArrays.createArray(5);
        double[] b = MergeAndReverseTwoArrays.createArray(10);

        System.out.println("a[] = " + Arrays.toString(a));
        System.out.println("b[] = " + Arrays.toString(b));

        double[] c = MergeAndReverseTwoArrays.mergeTwoArrays(a,b);

        System.out.println("c[] = " + Arrays.toString(c));

        Arrays.sort(c);

        System.out.println("c[] = " +  Arrays.toString(c));

        MergeAndReverseTwoArrays.reverse(c);
        System.out.println("c[] = " +  Arrays.toString(c));

        System.out.println("2--------------------------------------------");

        // Тестируем соединение двух массивов String[] через разделитель
        // и с переводом строки после каждой пары эелементов

        String[] key = {"чай","сахар","лед"};
        String[] value = {"горячий","белый","холодный"};
        String delimiter = " - ";

        System.out.println(TwoStringArraysPlusDelimiter.twoStringArraysPlusDelimiter(key,value,delimiter));

        System.out.println("3--------------------------------------------");
       // Тестируем возвращение массива в дипазоне 0 < x < 100

        int[] d = ReturnArrayRange0To100.createArray(30);
        System.out.println("d[] = " + Arrays.toString(d));

        int[] e = ReturnArrayRange0To100.returnArrayRange0To100(d);
        System.out.println("e[] = " + Arrays.toString(e));

    }
}
