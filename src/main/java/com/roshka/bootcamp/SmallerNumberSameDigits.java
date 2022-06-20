package com.roshka.bootcamp;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class SmallerNumberSameDigits {
    public static long nextSmaller(long n)
    {
        String textOrigen = String.valueOf(n);
        char [] arrOrigen = textOrigen.toCharArray();
        sort(arrOrigen); //ordenar

        for(long i = n-1; i >= 1; i--) {
            String textFin = String.valueOf(i);
            char [] arrFin = textFin.toCharArray();
            sort(arrFin); //ordenar

            if(Arrays.equals(arrOrigen, arrFin)) {
                return i;
            }
        }

        return -1;
    }

}
