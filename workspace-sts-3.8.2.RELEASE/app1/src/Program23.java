import java.util.*;

class Program23{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First Subject Number:");
		int a = sc.nextInt();
		System.out.print("Enter the Second Subject Number:");
		int b = sc.nextInt();
		System.out.print("Enter the Third Subject Number:");
		int c = sc.nextInt();
		int sum = a+b+c;
		System.out.println("Total Marks Scored:"+sum);
		int avg = sum/3;
		System.out.println("Average Marks Scored:"+avg);
		if(sum>=80){
			System.out.println("Excellent");
		}
		else if(sum>=70){
			System.out.println("Very Good");
		}
		else if(sum>=60){
			System.out.println("Good");
		}
		else if(sum>=50){
				System.out.println("Satisfication");
		}
		else{
			System.out.println("Failure ,Try Again");
		}
	}
}
