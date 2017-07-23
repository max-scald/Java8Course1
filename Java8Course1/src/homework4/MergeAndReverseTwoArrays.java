package homework4;

import java.util.Random;

public class MergeAndReverseTwoArrays {
    public static double[] createArray(int numberElem){
        double[] newArray = new double[numberElem];
        int loverCase = 10;
        int maxCase = 100;
        Random random = new Random();

        for (int i = 0; i < numberElem; i++) {
            newArray[i] = loverCase + random.nextInt(maxCase - loverCase);
        }

        return newArray;
    }

    public static double [] mergeTwoArrays(double[] a, double[] b){
        if(a.length == 0){
            return b;
        }else if(b.length == 0){
            return a;
        }else {
            int len = a.length + b.length;
            double[] c = new double[len];

            for (int i = 0; i < (a.length > b.length ? a.length: b.length); i++) {
                if(i < a.length){
                    c[i] = a[i];
                }
                if(i < b.length){
                    c[a.length + i] = b[i];
                }

            }
            return c;
        }
    }

    public static double[] reverse(double[] a){
        double tmp;
        int len = a.length;

        for (int i = 0; i < len/2; i++) {
            tmp = a[i];
            a[i] = a[len - 1 - i];
            a[len - 1 - i] = tmp;
        }
       return a;
    }
}
