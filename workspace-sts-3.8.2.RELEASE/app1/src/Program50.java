import java.util.*;

class Program50{
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number:");
		int num = sc.nextInt();
	//	for(int i=num;i>0;i--){
	//		System.out.print(i+" ");
			int j=num;
			int k=0;
			while(j!=0){
				k = (k*10)+j%10;
				j = j/10;
			}
			System.out.println("Reverse of:"+ num + "is:"+k);
	}
}