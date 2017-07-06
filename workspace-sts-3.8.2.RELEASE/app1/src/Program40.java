import java.util.*;

class  Program40{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Number:");
		int n = sc.nextInt();
		int i ,m=0,flag=0;
		m = n/2;
		for(i=2;i<=m;i++){
			if(n%i ==0){
				System.out.println("Not Prime Number");
				flag = 1;
				break;
			}
		}
		if(flag == 0){
			System.out.println("Prime Number");
		}
	}
}
