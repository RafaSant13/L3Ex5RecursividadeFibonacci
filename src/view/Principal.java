package view;
import javax.swing.JOptionPane;

import controller.FibonacciControle;

public class Principal {

	public static void main(String[] args) {
		FibonacciControle FC = new FibonacciControle();
		int N = 8;
		if (N > 20)
		{
			JOptionPane.showMessageDialog(null, "Vari�vel estourou");
			System.exit(0);
		}
		
		System.out.println("O "+N+"� valor na sequ�ncia de Fibonacci � "+FC.Fibo(N));

	}

}
