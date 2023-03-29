package com.hedima.presentacion;

public class ProbarEstructuraIF {

    public static void main(String[] args) {
        //En base a una variable decir si es mayor o menor que 18
        int edad = 15;
        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }

        //Declarar una variable y decir si es un numero positivo o negativo
        //Declarar una variable y decir si es un numero par o impar

        byte numero = -10;
        if (numero > 0) {
            System.out.println("Es un numero positivo");
        }    else {
                System.out.println("Es un numero negativo");
            }

        int numero1 = 9;
        if (numero1 % 2 == 0) {
            System.out.println("Es un numero par");
        } else {
            System.out.println("Es un numero impar");
        }

    }
}
