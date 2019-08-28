import java.util.Scanner;

public class MaiorMenor {

	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
		int num = 3;
		int vetor[] = new int[num];
		int maior = 0;
		int menor = 1000;
		
		for(int i = 0; i < vetor.length; i++) {
			
			
			System.out.println("Digite o " + (i+1)+ "° inteiro do vetor:");
			vetor[i] = input.nextInt();
			if(vetor[i] < menor) {
			     menor = vetor[i];
			}if(vetor[i] > maior){
				maior = vetor[i];
				
			}
			
		}
		
		System.out.println("Maior inteiro->" + maior);
		System.out.println("Menor inteiro->" + menor);

		
		
		
	}

}
