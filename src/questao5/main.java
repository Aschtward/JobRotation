package questao5;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma string");
		String stringNormal = sc.next();
		
		char[] charactersNomarl = stringNormal.toCharArray();
		char[] charactersInvertidos = new char[stringNormal.length()];
		
		int index = stringNormal.length() - 1;
		for(int i = 0; i < stringNormal.length(); i++) {
			charactersInvertidos[index] = charactersNomarl[i];
			index--;
		}
		
		String stringInvertida = String.valueOf( charactersInvertidos);
		
		System.out.println(stringInvertida);

	}

}
