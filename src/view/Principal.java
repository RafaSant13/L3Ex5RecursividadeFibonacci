package view;
import javax.swing.JOptionPane;

import controller.FibonacciControle;

public class Principal {

	public static void main(String[] args) {
		FibonacciControle FC = new FibonacciControle();
		int N = 8;
		if (N > 20)
		{
			JOptionPane.showMessageDialog(null, "Variável estourou");
			System.exit(0);
		}
		
		System.out.println("O "+N+"º valor na sequência de Fibonacci é "+FC.Fibo(N));

	}

}
