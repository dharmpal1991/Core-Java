import java.util.*;
import java.io.*;

class Program19{
	public static void main(String[] args)throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Character:");
		char c = (char) bf.read();
		if(c>=65 && c<=90){
			System.out.println("Character is Uppercase");
		}
		else{
			System.out.println("Character is not uppercase");
		}
	}
}