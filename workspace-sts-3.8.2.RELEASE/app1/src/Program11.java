import java.util.*;

class Program11{
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		if(num>0){
			System.out.println("Number is Positive");
		}
		else{
			System.out.println("Number is negative");
		}
	}
}
