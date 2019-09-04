
import java.util.Scanner;

public class Inverte {

	public static void main(String[] args) {
       final int numeros = 10;
       Scanner sc = new Scanner(System.in);
       int[] numerosIn = new int[numeros];
       
       for(int i = 0;i < numerosIn.length; i++) {
    	   
    	   System.out.println("Entre com o proximo inteiro");
    	   numerosIn[i] = sc.nextInt();
    	   
       }
       
       for(int i = numerosIn.length - 1; i >= 0; i--) {
    	   
    	   System.out.println(numerosIn[i]);
       }
	}

}
