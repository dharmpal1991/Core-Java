import java.util.*;

class Program26{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Year:");
		int year = sc.nextInt();
		if(year%400 == 0 || year%4 == 0){
			System.out.println("Its a leap year");
		}
		else{
			System.out.println("Not a leap year");
		}
	}
}
