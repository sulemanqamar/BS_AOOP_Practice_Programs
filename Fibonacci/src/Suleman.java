import java.util.Scanner;
public class Suleman {
	@SuppressWarnings("resource")
	public static void main(String[] args){
	
		System.out.print("Enter Number of Fibonacci series numbers to be found: ");
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int num1,num2,result;
		num1 =0;
		num2 =1;
		System.out.print("Fibonacci Series : " + 0 + " ");
		for(int i=1;i<n;i++){
			result =num1 + num2;
		System.out.print(result + " ");
		num1 = num2;
		num2 = result;
		}
		
	}

}
