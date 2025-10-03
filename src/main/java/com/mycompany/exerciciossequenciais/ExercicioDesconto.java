package com.mycompany.exerciciossequenciais;

import java.awt.BorderLayout;
import java.util.Scanner;

public class ExercicioDesconto {


    static void main(String[] args) {
        float valorDoProduto;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é o valor do produto: ");
        valorDoProduto = scanner.nextFloat();
        float formulaDesconto = (9f/100f)* valorDoProduto;
        float valorFinal = valorDoProduto - formulaDesconto;
        System.out.println("O valor final ficou: " + valorFinal + "R$");
               
                      
    }
    
}
