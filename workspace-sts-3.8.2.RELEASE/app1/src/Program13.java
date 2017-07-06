import java.util.*;

class Program13{
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num = sc.nextInt();
		if(num %2 == 0){
			System.out.println("Even");
		}
		else{
			System.out.println("odd");
		}
	}
}
