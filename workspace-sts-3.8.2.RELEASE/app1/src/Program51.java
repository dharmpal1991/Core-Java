import java.util.*;

class Program51{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number:");
		int num = sc.nextInt();
		int sum=0,r;
		 int temp = num;
		while(num>0){
			r = num%10;
			sum =(sum*10)+r;
			num = num/10;
		}
		if(temp == sum)
			System.out.println("Palindrom");
		else
			System.out.println("Not Palindrom");
			
	}
}