package com.roshka.bootcamp;

import java.util.*;
public class CuentaNumeros {

    public static void main(String [] args) {
        CuentaNumeros.findAll(10, 3);
    }
    public static List<Long> findAll(final int sumDigits, final int numDigits) {
        final int maxDigit = 9; // el digito minimo
        final int minDigit = 1; // el digito maximo

        int maxNum = maxDigit;  // el numero maximo para el ciclo
        int minNum = 1;         // el numero minimo para el ciclo

        // los valores para el retorno
        long cant = 0L, min = 0L, max = 0L;


        // valida que sumDigits o numDigits no sea CERO.
        if (sumDigits < 1 || numDigits < 1) {
            return new ArrayList<>(0);
        }

        /* se construye el minimo y maximo numero.
        * Para 3 digitos: minNum = 111 y maxNum = 999
        * */
        for(int i = 1; i < numDigits; i++) {
            maxNum *= 10;
            maxNum += maxDigit;

            minNum *= 10;
            minNum += minDigit;
        }

        /* se itera desde el minimo hasta el maximo numero permitido */
        for(long num = minNum; num <= maxNum; num++) {
            /* valida que el numero sea creciente e igual a la suma de digitos */
            if(esCreciente(num, numDigits) && esIgual(num, sumDigits, numDigits)) {

                if(cant == 0) { // si es el primer numero que se encuentra, inicializa las variables.
                    min = num;
                    max = num;
                } else if(num > max) { // si encuentra un nuevo MAX
                    max = num;
                } else if(num < min) { // si encuentra un nuevo MIN
                    min = num;
                }

                cant++;
            }
        }

        /* valida si se encontro alguna coincidencia */
        if(cant == 0) {
            return new ArrayList<>(0);
        }

        return Arrays.asList(cant, min, max);

    }

    private static boolean esIgual(long number, long sum, int numDigits) {
        /* verifica que la la suma de los digitos de 'number' sea igual a numDigits */
        long sumAux = 0;
        String numberText = String.valueOf(number);

        for(int i = 0; i < numDigits; i++) {
            sumAux += Integer.parseInt(numberText.charAt(i) + ""); // suma los digitos del numero
        }

        return sum == sumAux;
    }

    private static boolean esCreciente(long num, int numDigits) {
        /* verifica que 'num' sea creciente */
        String numberText = String.valueOf(num);
        int digit = Integer.parseInt(numberText.charAt(0) + ""); // primer digito.

        for(int i = 1; i < numDigits; i++) {
            int aux = Integer.parseInt(numberText.charAt(i) + "");
            if(aux < digit) {
                return false;
            }
            digit = aux;
        }

        return true;
    }

}
