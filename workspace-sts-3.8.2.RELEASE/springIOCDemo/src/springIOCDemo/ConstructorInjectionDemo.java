package springIOCDemo;

public class ConstructorInjectionDemo {
	private String message;

	public ConstructorInjectionDemo(String message) {
		super();
		this.message = message;
	}
	
	public void show(){
		System.out.println(message);
	}

}
