import java.util.Scanner;
public class fizz {

	public static void main(String[] args) {
			System.out.println("Enter Number");	
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			int num = input.nextInt();
			
			if(num%3==0 && num%5==0){
				System.out.println("Number is FizWiz");	
				}
			
			else if(num%3==0){
				System.out.println("Number is Fiz");
				
			}
			else if(num%5==0){
				System.out.println("Number is Wiz");	
			}	
			
			else {
				System.out.print("Number is Not 'Fizz' neither 'Wizz' nor 'FizzWizz'");
			}

	}

}
