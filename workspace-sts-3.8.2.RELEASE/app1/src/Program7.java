class Program7{
	static void Swap(int a,int b){
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[]as){
		int a = 10,b = 20;
		Swap(a,b);
	}
}
