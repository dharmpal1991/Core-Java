import java.util.*;
import java.io.*;

class Program25{
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the Character:");
		String s = bf.readLine();
		String string = s.toLowerCase();
		System.out.println(string);
	}
}