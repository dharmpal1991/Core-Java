import java.util.*;
import java.io.*;

class Program18{
	public static void main(String[] args) throws IOException{
		BufferedReader bf =new BufferedReader( new InputStreamReader(System.in));
		System.out.println("Enter a character:");
		char c = (char) bf.read();
		if(c>=65 && c<=90 ||c>=97 && c<=122){
			System.out.println("character not digit");
		}
		else{
			System.out.println("character is digit");
		}
	}
}
