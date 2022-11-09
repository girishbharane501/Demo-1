
public class Factorial {
	public int factorial(int no) {
		int fact=1;
		for(int i=1;i<=no;i++) {
			fact=fact*i;
			
		}
		return fact;
	}

	public static void main(String[] args) {
		Factorial factorial=new Factorial();
		int x= factorial.factorial(5);
		System.out.println("Factorial is.."+x);
		
		
	}

}
