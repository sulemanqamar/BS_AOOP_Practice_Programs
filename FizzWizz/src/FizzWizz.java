import java.util.Scanner;
public class FizzWizz {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
	System.out.println("Enter Number");	
	Scanner input = new Scanner(System.in);
	int num = input.nextInt();
	if(num%3==0){
		System.out.println("Number is Fiz");
		
	}
	if(num%5==0){
		System.out.println("Number is Wiz");	
	}	
	if(num%3==0 && num%5==0){
	System.out.println("Number is FizWiz");	
	}
	
	else {
		System.out.print("Number is Not 'Fizz' neither'Wizz' nor 'FizzWizz'");
	}

	}

}
