import java.util.*;

class  Program31{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number:");
		int sum = 0;
		int num = sc.nextInt();
		for(int i=1;i<=num;i++){
			sum =sum+i;
		}
		System.out.println(sum);
	}
}
