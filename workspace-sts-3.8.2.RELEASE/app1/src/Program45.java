import java.util.*;

class Program45{
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number:");
		int num = sc.nextInt();
		int count = 0;
		while(num>0){
			num = num/10;
			count = count+1;
		}
		System.out.println("Number digits is:"+count);
		
	}
}
