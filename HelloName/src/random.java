
public class random {
	
	public static void main(String[] args) {
		
		int randomNumber = (int)(Math.random()*50);
		
		
		if(randomNumber < 25) {
			
			System.out.println("Random number is less than 25");
			
		}if(randomNumber < 30) {
			
			System.out.println("Random number is less than 30");

			
			
		}if(randomNumber < 40) {
			
			System.out.println("Random number is less than 40");

			
			
		}if(randomNumber < 45) {
			
			System.out.println("Random number is less than 45");

			
			
		}
		
		
		
		System.out.println("Random number is:" + randomNumber);
	}
}
