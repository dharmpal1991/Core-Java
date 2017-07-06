class Program86{
	public static  String reverseString(String str){
		char[] arr = str.toCharArray();
		char temp;
		int i = 0;
		int j = str.length()-1;
		while(i>j){
			while(Character.isWhitespace(arr[i]))
				i++;
			while(Character.isWhitespace(arr[j]))
				j--;
			temp = arr[i];
			arr[j] = arr[i];
			arr[i] = temp;
			j--;
			i++;
		}
		return new String (arr); 
	}
	public static void main(String[]as){
		String s ="dharmpal kansujia bodi wala pitha";
		System.out.print(reverseString(s));
		
	}
	
}
