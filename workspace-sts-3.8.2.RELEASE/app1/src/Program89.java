class Program89{
	public static void main(String[] args){
		int [] x = {10,20,30,40,50,34,110,40,100};
		int largetst = x[0];
		for(int i=1;i<x.length;i++){
			if(x[i]>largetst)
				largetst = x[i];
		}
		System.out.println(largetst);
	}
}