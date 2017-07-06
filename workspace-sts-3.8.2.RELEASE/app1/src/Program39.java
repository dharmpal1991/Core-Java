import java.util.*;

class  Program39{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number:");
		int fact = 1;
		int num = sc.nextInt();
		for(int i=1;i<=num;i++){
			fact = fact*i;
		}
		System.out.println(fact);
	}
}
