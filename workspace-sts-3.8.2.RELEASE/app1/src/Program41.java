import java.util.*;
import java.io.*;

class Program41{
	public static void main(String[] args)throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the Number");
		int n = Integer.parseInt(bf.readLine());
		int sum = 0;
		for(int i=1;i<n;i++){
			if(n%i ==0){
				sum = sum+i;
			}
		}
		if(sum == n){
			System.out.println("Number is perfect");
		}
		else{
			System.out.println("Number is not perfect");
		}
	}
}
