import java.util.*;

class Program56{
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no. of rows:");
		int row = sc.nextInt();
		for(int i =1;i<=row;i++){
			for(int j =1;j<=(row+1-i);j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}