package controller;

public class FibonacciControle {

	public FibonacciControle() {
		super();
	}

	public int Fibo(int N){
		//Condi��o de parada -> Quando N � menor ou igual a 2, pois os dois primeiros valores em Fibonacci s�o 1 
        if (N>2)
        {
        	//A fun��o � chamada em uma soma entre a �ltima posi��o na sequ�ncia e a pen�ltima
           int Fibo = Fibo(N-1)+Fibo(N-2); 
           return Fibo;
        }
        else 
        {
            return 1;
        }
    }
}
