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
	
	//Uma outra solu��o seria usar um la�o de repeti��o, por�m essa � mais limpa e inteligente

}
