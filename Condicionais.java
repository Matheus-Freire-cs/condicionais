package condicionais;

import java.util.Scanner;

public class Condicionais {

    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);

        // System.out.println("escreva sua idade: ");
        //int idade = scann.nextInt();
        //if (idade >=18) {
        //     System.out.println("é maior de idade");
        // }
        // else {
        //    System.out.println("Não é maior de idade");
        // }    
//        System.out.println("Vreifique o triangulo");
//
//        System.out.println("escreva um numero: ");
//        int n1 = scann.nextInt();
//        System.out.println("escreva outro numero: ");
//        int n2 = scann.nextInt();
//        System.out.println("escreva outro numero: ");
//        int n3 = scann.nextInt();
//
//        if (n1 + n2 > n3) {
//            System.out.println("É um triangulo");
//        } else {
//            System.out.println("Não é um triangulo");
//        }

//        System.out.println("Descubra a media");
//
//        System.out.println("escreva a primeira nota: ");
//        double nota1 = scann.nextDouble();
//
//        System.out.println("escreva a segunda nota: ");
//        double nota2 = scann.nextDouble();
//
//        System.out.println("escreva a terceira nota: ");
//        double nota3 = scann.nextDouble();
//
//        double nota_final = nota1 + nota2 + nota3 / 3;
//
//        if (nota_final >= 6) {
//            System.out.println("O aluno foi aprovado!");
//        } else {
//            System.out.println("O aluno não foi aprovado");
//        }

        System.out.println("Descubra o salario final");
        
        System.out.println("Insira o salario:");
        double salario = scann.nextDouble();
        
       double salario_aumentado = salario + (salario * 0.15);
       
       double salario_final = salario_aumentado - (salario_aumentado * 0.08);
       
        System.out.println("O salario inicial após o aumento de 15% e o desconto de impostos é: " + salario_final);
       
       



    }

}
