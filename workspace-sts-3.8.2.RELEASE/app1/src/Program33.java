import java.util.*;

class Program33{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number from 1-19:");
		String [] numName={"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","foueteen",
							"fifteen","sixteen","seventeen","eighteen","ninteen"};
		int i = sc.nextInt();
		String word = numName[i];
		System.out.println(word);
	}
}
