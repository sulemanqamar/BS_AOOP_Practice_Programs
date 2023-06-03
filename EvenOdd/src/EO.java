import java.util.Scanner;
public class EO {

	public static void main(String[] args) {
		boolean ch;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		do{System.out.print("Enter Number to find out if it is 'Even' or 'Odd': ");
		int num = input.nextInt();
		if(num%2==0){
			System.out.println("Number is Even");
		}
		else if(num%2==1){
			System.out.println("Number is Odd");
		}
	
		System.out.print("If you want to do another write 'true' else write  'false')");
		ch =input.nextBoolean();
		}while( ch=true);	
	}

}
