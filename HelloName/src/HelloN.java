import java.util.Scanner;



public class HelloN{
	static Scanner userInput = new Scanner(System.in);
	static Scanner bool = new Scanner(System.in);
	static Scanner bool2 = new Scanner(System.in);

	
	
	public static void main(String[] args) {
		
		System.out.println("\nYour favorite number:");
		
		if(userInput.hasNextInt()) {
			
			int number1 = userInput.nextInt();
			
			System.out.println("\nYour entered:" + number1);
			System.out.println("\nDow you want enter a number again?(y/n)" );

			
			if(bool.hasNext("y")) {
				
				System.out.println("\nEnter again:" );


				
				int number2 = userInput.nextInt();

				
				
				System.out.println("\nYour entered again:" + number2);
				
				
				System.out.print("\nDo you want test the calculator?(y/n)");
				
				if(bool2.hasNext("y")) {
					
					int soma = number1 + number2;
					int divisao = number1/number2;
					int subtracao = number1 -number2;
					int mult = number1*number2;
					int remainder1 = number1%2;
					int remainder2 = number2%2;
					
				    
					System.out.println("\nResultados:\n Soma:\n" + soma +  "\nDivisao:\n" + divisao + "\nsubtracao:\n" + subtracao + "\nmult\n" + mult + "\nRemainder1:\n" + remainder1);

					
					
					
				}

				
			}
			
		}else {
			
			System.out.println("Wrong type. Entern again:");
			
			return;
		}
		
		
	}
	
			
	
	
}
