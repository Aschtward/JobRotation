package questao2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int valorDesejado, resultado;
		
		System.out.println("Digite o numero que deseja descobrir");
		
		valorDesejado = sc.nextInt();
		resultado = Fibonacci.fibonacci(valorDesejado);
		
		System.out.println("O resultado e: " + resultado);

	}

}
