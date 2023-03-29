package com.hedima.presentacion;

public class Main {
    public static void main(String[] args) {
//        Metodos metodos de la clase String
        String frase = "La casa verde";
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
        System.out.println("Longitud de la frase: " + frase.length());
        System.out.println("("+frase.substring(0, 2)+")");
        System.out.println("("+frase.substring(3, 7)+")");
        System.out.println("posicion de la s: " + frase.indexOf("s"));;
        System.out.println("posicion de la a: " + frase.indexOf("a"));;
        System.out.println("posicion de la a: " + frase.lastIndexOf("a"));;
        String frase2 = "La casa verde";
        System.out.println(frase.equals(frase2));

        String frase3 = "Nunca mates una mosca sobre la cabeza de un tigre.";
        System.out.println(frase3.toUpperCase());
        System.out.println(frase3.toLowerCase());
        System.out.println(frase3.substring(0, frase3.indexOf(" ")));
        System.out.println("("+frase3.substring(0, 5)+")");
        System.out.println("("+frase3.substring(16, 21)+")");
        System.out.println("("+frase3.substring(31, 37)+")");
        System.out.println("posicion de la m: " + frase3.indexOf("m"));;
        System.out.println("Longitud de la cadena: " + frase3.length());










    }
}