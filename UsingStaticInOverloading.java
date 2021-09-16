
public class UsingStaticInOverloading {

	static int add(int a, int b)
	   {
		return a+b;
		}  
	static double add(double a, double b)
	   {
		return a+b;
		}  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
			System.out.println(UsingStaticInOverloading.add(78,18));  
			System.out.println(UsingStaticInOverloading.add(18.8,67.6));  
	}

}
