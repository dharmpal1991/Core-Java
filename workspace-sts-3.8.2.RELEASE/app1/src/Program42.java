import java.util.*;

class Program42{
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First Number:");
		int a = sc.nextInt();
		System.out.print("Enter the Second Number:");
		int b = sc.nextInt();
		for(int i =a;i<=b;i++){
			boolean isPrime = true;
			for(int j =2;j<a;j++){
				if(i%j ==0){
					isPrime =false;
					break;
				}
			}
			if(isPrime){
				System.out.println(i+" ");
			}
		}
	}
}
