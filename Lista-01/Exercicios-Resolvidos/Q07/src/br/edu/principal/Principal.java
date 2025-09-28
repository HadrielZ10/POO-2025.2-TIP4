package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner receba = new Scanner(System.in);

        System.out.println("Digite o valor do salario base: ");
        double salarioBase = receba.nextDouble();
        
        double valorImposto = salarioBase * 0.10;
        
        double salarioFinal = salarioBase + 50 - valorImposto;

        System.out.println("O salario a receber é: " + salarioFinal);
	}

}