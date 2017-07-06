import java.util.*;

class Program36{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Divident Value:");
		int divident = sc.nextInt();
		System.out.print("Enter the Divisor value:");
		int divisor = sc.nextInt();
		int quotient = 0;
		while(divident>=divisor){
			divident = divident-divisor;
			quotient++;
		}
		System.out.println("Quotient is:"+quotient);
		System.out.println("Remainder is:"+divident);
	}
}
