package com.mycompany.exerciciossequenciais;

import java.util.Scanner;

public class ExerciciosSequenciais {

    public static void main(String[] args) {
      //CalcularMediaPonderada();
//      ExercioDesconto();
       CalcularOValorDoCofre();
    } 
    
    static void CalcularMediaPonderada(){
      float numero1 = 0;
      float numero2 = 0;
      float numero3 = 0;
      float numero4 = 0;
    
       Scanner scanner = new Scanner(System.in);
       System.out.print("Informe o 1o. numero: ");
       numero1 = scanner.nextFloat();
       System.out.print("Informe o 2o. numero: ");
       numero2 = scanner.nextFloat();
       System.out.print("Informe o 3o. numero: ");
       numero3 = scanner.nextFloat();
       System.out.print("Informe o 4o. numero: ");
       numero4 = scanner.nextFloat();
       
       float somaPonderada = (numero1 * 1) + (numero2 * 2) + (numero3 * 3) + (numero4 * 4);
       float somaPeso = 1 + 2 + 3 + 4;
       
       float mediaPonderada = somaPonderada / somaPeso;
       
        System.out.println("A media ponderada é" + mediaPonderada);

    }
    static void ExercioDesconto() {
        float valorDoProduto;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é o valor do produto: ");
        valorDoProduto = scanner.nextFloat();
        float formulaDesconto = (9f/100f)* valorDoProduto;
        float valorFinal = valorDoProduto - formulaDesconto;
        System.out.println("O valor final ficou: " + valorFinal + "R$");
                
    }

        static void CalcularOValorDoCofre(){
//            definicao de variavel
            double qtdDolares = 0.0d;
            double cotacaoDolar = 0.0d;
            double valorReais = 0.0d;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a quantidade de U$$ no cofre: ");
       qtdDolares = scanner.nextDouble();
            System.out.println("Informe a contacao U$$ do dia: ");
            cotacaoDolar = scanner.nextDouble();
            valorReais = qtdDolares * cotacaoDolar;
            System.out.println("O cofre guarda R$:" + valorReais);
            
        }
}



    
