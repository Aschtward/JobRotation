package questao2;

public class Fibonacci {
	
	public static int fibonacci(int i) {
		if(i == 1) {
			return 1;
		}
		if(i == 0) {
			return 0;
		}
		return fibonacci(i-1) + fibonacci(i-2);
	}
	
	//Uma outra solução seria usar um laço de repetição, porém essa é mais limpa e inteligente

}
