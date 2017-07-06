import java.util.*;

class Program12{
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the age:");
		int num = sc.nextInt();
		if(num>=18){
			System.out.println("Eligible for voting");
		}
		else{
			System.out.println("Not Eligible for voting ");
		}
	}
}
