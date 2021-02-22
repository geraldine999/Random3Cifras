package com.company;

import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        /* Crear un sistema que genere números aleatorios
         de 3 cifras y guardarlos en un conjunto,
          sin repeticiones. Preguntar al usuario la cantidad
          de números que desea guardar, generarlos y luego mostrarlos en pantalla.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique la cantidad de numeros que desee generar");
        int cantidadDeNumeros = sc.nextInt();

        Set <Integer> numerosAleatoriosSinRepetir = new HashSet<>();

        Random random = new Random();

        while(numerosAleatoriosSinRepetir.size() < cantidadDeNumeros){
            numerosAleatoriosSinRepetir.add(random.nextInt(899)+100);

        }

        numerosAleatoriosSinRepetir.forEach(numero -> System.out.println(numero));


















    }
}
