class Program90{
	public static void main(String[] args){
		int [] x = {10,20,30,40,50,34,110,40,100,4};
		int smallest = x[0];
		for(int i=1;i<x.length;i++){
			if(x[i]<smallest)
				smallest = x[i];
		}
		System.out.println(smallest);
	}
}