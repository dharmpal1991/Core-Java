import java.util.*;
import java.io.*;

class Program20{
	public static void main(String[] args)throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Character:");
		char c = (char) bf.read();
		if(c>=97 && c<=122){
			System.out.println("Character is lowercase");
		}
		else{
			System.out.println("Character is not lowercase");
		}
	}
}

