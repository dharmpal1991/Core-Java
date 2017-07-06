import java.util.*;

class Program46{
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number:");
		int num = sc.nextInt();
		if(num%2 == 0){
			System.out.println("Number is Even");
		}
		else{
			System.out.println("Number is odd");
		}
	}
}