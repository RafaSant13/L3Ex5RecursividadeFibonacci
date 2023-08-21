package controller;

public class FibonacciControle {

	public FibonacciControle() {
		super();
	}

	public int Fibo(int N){
		//Condição de parada -> Quando N é menor ou igual a 2, pois os dois primeiros valores em Fibonacci são 1 
        if (N>2)
        {
        	//A função é chamada em uma soma entre a última posição na sequência e a penúltima
           int Fibo = Fibo(N-1)+Fibo(N-2); 
           return Fibo;
        }
        else 
        {
            return 1;
        }
    }
}
