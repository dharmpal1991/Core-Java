class Program57{
	public static void main(String[] args){
		int count =1;
		for(int i =1;i<=5;i++){
			for(int j=1;j<=5-i;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=count;k++){
				System.out.print("*");
			}
			System.out.println();
			count+= 2;
		}
	}
}
