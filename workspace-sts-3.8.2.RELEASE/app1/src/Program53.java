import java.util.*;

class Program53{
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first Number:");
		int a = sc.nextInt();
		System.out.print("Enter the  second Number:");
		int b = sc.nextInt();
		boolean flag = true;
		while(a<=b){
			for(int k = 2;k<=(a/2);k++){
				if(a%k == 0){
					flag = false;
					break;
				}
			}
			if(flag){
				System.out.println(a+" ");
			}
			else{
				flag = true;
			}
			a++;
		}
	}
}