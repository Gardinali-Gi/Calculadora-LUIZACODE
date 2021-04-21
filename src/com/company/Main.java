package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero1;
        int numero2;
        int operador;

        System.out.println("Entre com o primeiro número: ");

        numero1 = input.nextInt();

        if (numero1 >= 1 && numero1 <=500000){

            System.out.println("Entre com um novo número: ");
            numero2 = input.nextInt();

            if (numero2 >=1 && numero2 <=500000){
                System.out.println("Qual operação você deseja realizar? Soma = 1 " +
                        "Subtração = 2 Multiplicação = 3 Divisão = 4 e TODOS = 0");
                operador = input.nextInt();
                if (operador == 1){
                    System.out.println("A soma dos números digitados é: " +(numero1+numero2));
                } else if (operador ==2){
                    System.out.println("A subtração dos números digitados é: "+(numero1-numero2));
                } else if (operador == 3){
                    System.out.println("A multiplicação dos números digitados é: "+(numero1 * numero2));
                } else if (operador == 4){
                    System.out.println("A divisão dos números digitados é: "+(numero1/numero2));
                    System.out.println("O resto da divisão entre os números digitados é: "+(numero1%numero2));
                } else if (operador == 0){
                    System.out.println("A soma dos números digitados é: "+(numero1+numero2));
                    System.out.println("A subtração dos números digitados é: "+(numero1-numero2));
                    System.out.println("A multiplicação dos números digitados é: "+(numero1 * numero2));
                    System.out.println("A divisão dos números digitados é: "+(numero1/numero2));
                    System.out.println("O resto da divisão entre os números digitados é: "+(numero1%numero2));
                } else{
                    System.out.println("Tipo de operador não aceito!");
                }
            } else {
                System.out.println("Tipo de número não aceito!");
            }
        } else{
            System.out.println("Tipo de número não aceito!");
        }





    }
}