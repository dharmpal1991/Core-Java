class Program67{
	public static void main(String[] args){
		int mult;
		for(int i= 1;i<=10;i++){
			if(i<10)
				System.out.print(" ");
			for(int j=2;j<=10;j++){
				mult = i*j;
			if(mult<10)
				System.out.print(" ");
			else if(mult<100)
				System.out.print(" ");
				System.out.print(mult+"\t ");
			}
			System.out.println();
		}
		
	}
}
