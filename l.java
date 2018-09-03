import java.util.Scanner;

class LargestOfThreeNumbers{
	public static void main(String args[]){
		int num1,num2,num3;
		System.out.println("Enter any 3 integers ");
		Scanner in = new Scanner(System.in);
		num1 = in.nextInt();
		num2 = in.nextInt();
		num3 = in.nextInt();
		if ( num1 > num2 && num1 > num3 ){
			System.out.println("num1 is largest.");
		}
		else if ( num2 > num1 && num2 > num3 ){
			System.out.println("num2 is largest.");
		}
		else if ( num3 > num1 && num3 > num2 ){
			System.out.println("num3 is largest.");
		}
		else{
         System.out.println("Entered numbers are not distinct.");
		}
	}
}
