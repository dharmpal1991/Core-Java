import java.util.*;
import java.io.*;

class Program21{
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Character:");
		char c = (char)bf.read();
		if(c>=48 && c<=57 || c>=65 && c<=90 || c>=97 && c<=122){
			System.out.println("Not a special character");
		}
		else{
			System.out.println("Special character");
		}
	}
}