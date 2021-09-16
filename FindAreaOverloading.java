package emp;

public class FindAreaOverloading {
	int resultA;
	float resultR;
	float resultC;
	void area(int length , int breadth)
	{
		resultA = length*breadth ;
		System.out.println("Area of square is - "+resultA);
	}
	void area(float length , float breadth)
	{
		resultR = 2 * (length +breadth) ;
		System.out.println("Area of rectangle is -"+resultR);
	}
	void area(int r)
	{
		resultC = (float) (3.14 *r*r); ;
		System.out.println("Area of circle is -"+resultC);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindAreaOverloading areas = new FindAreaOverloading();
		areas.area(400, 500);
		areas.area(45, 78);
		areas.area(6);
		
	}
	

}
