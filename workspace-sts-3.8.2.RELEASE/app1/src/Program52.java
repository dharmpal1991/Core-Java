import java.util.*;

class Program52{
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number:");
		int num = sc.nextInt();
		int	temp = num;
		int c =0,a;
		while(num>0){
			a = num%10;
			num = num/10;
			c = c+(a*a*a);
		}
		if(temp == c)
			System.out.println("Armstrong number");
		else
			System.out.println("Not Armstring number");
	}
}