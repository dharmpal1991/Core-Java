import java.util.*;
import java.io.*;

class  Program27{
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the Character:");
		char c = (char) bf.read();
		if(c == 'A'|| c =='a' ||c == 'E'|| c =='e' ||c == 'I'|| c =='i' ||c == 'O'|| c =='o' ||c == 'U'|| c =='u'){
			System.out.println("Character is vowel:"+c);
			}
			else
				System.out.println("Character is not vowel:"+c);
	}
}