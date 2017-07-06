class Program17{
	public static void main(String[] args){
		int a = 10;
		int b = 20;
		int c = 30;
		int d = (a<b)?(a<c)?a:c:((b>c)?b:c);
		System.out.println("min value is:"+d);
	}
}
