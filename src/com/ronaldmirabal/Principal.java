package com.ronaldmirabal;

public class Principal {
    public static void main(String[] args) {
        //enteros
        byte number1 = 1;
        short number2 = 8;
        int number3 = 35;
        long number4 = 55666;

        //flotantes
        float decimal1 = 86.5f;
        double decimal2 = 556.36;

        //caracter
        char caracter = 'b';

        //booleanos
        boolean verdadero = true;
        boolean falso = false;

        //cadenas
        String nombreCompleto = "Ronald Mirabal";

        //envoltorio
        Integer number5 = null;
        Long number6 = 3L;

        System.out.println("byte: "+ number1);
        System.out.println("short: "+ number2);
        System.out.println("int: "+ number3);
        System.out.println("long: "+ number4);

        System.out.println("float: "+ decimal1);
        System.out.println("double: "+ decimal2);

        System.out.println("char: "+ caracter);

        System.out.println("boolean: "+ verdadero);

        System.out.println("String: "+ nombreCompleto);

        System.out.println("Integer: "+ number5);
        System.out.println("Long: "+ number6);
    }
}
