import java.util.*;
import java.io.*;

class Program22{
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader( new InputStreamReader(System.in));
		System.out.println("Enter a Character");
		char c = (char) bf.read();
		if(c>=48 && c<=57){
			System.out.println("Character is Digits");
		}
		else if(c>=65 && c<=90){
			System.out.println("Character is Uppercase");
		}
		else if(c>=97 && c<=122){
			System.out.println("Character is Lowercase");
		}
		else{
			System.out.println("Character is Special Symble");
		}
	}
}
