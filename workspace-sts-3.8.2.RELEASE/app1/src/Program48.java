import java.util.*;

class Program48{
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number:");
		int num = sc.nextInt();
		int sum=0;
		while(num>0){
			sum = sum+num%10;
			num = num/10;
		}
		System.out.println("sum of digits: "+sum);
	}
}