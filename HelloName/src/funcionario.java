import java.util.*;


public class funcionario {
	
	static Scanner userInput = new Scanner(System.in);
	static Scanner userInput1 = new Scanner(System.in);
	static Scanner userInput2 = new Scanner(System.in);
	static Scanner userInput3 = new Scanner(System.in);



	public static void main(String[] args) {
		
		int idfunc = userInput.nextInt();
		double salariobase = userInput1.nextDouble();
		double acrescimo = userInput2.nextDouble();
		double desconto = userInput2.nextDouble();
		
		double salarioliquido = (salariobase + acrescimo - desconto);

		
		
		System.out.println("\nNome do funcionário: " + idfunc);
		System.out.println("\nSalário base do funcionário: " + salariobase);
		System.out.println("\nDesconto do salário: " + desconto);
		System.out.println("\nAcrescimo do salário: " + acrescimo);
		System.out.println("\nSalário líquido: " + salarioliquido);
		

		

		

		
	}
	
	
}
