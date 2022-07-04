package questao4;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int escolha = 1;
		Scanner sc = new Scanner(System.in);
		String estado;
		Double faturamento,faturamentoTotal = 0.0;
		ArrayList<FaturamentoEstado> lista = new ArrayList<FaturamentoEstado>();
		
		while(escolha == 1) {
			System.out.println("Digite o estado");
			estado = sc.next();
			System.out.println("Digite o faturamento");
			faturamento = sc.nextDouble();
			
			faturamentoTotal += faturamento;
			FaturamentoEstado fatEst = new FaturamentoEstado(estado,faturamento);
			lista.add(fatEst);
			
			System.out.println("Deseja continuar 1<Sim> 0<Nao>");
			escolha = sc.nextInt();
		}
		
		for(FaturamentoEstado e : lista){
			Double porcentual = (e.getFaturação()*100)/faturamentoTotal;
			System.out.println("O estado: " + e.getEstado() + " Teve uma representacao de  " + porcentual + "%");
		}

	}

}
