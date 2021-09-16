import java.util.Scanner;

public class Person {
	int id =12;
	String name ;
	Vehical v ; 
	
	
	
	public Person(int id, String name, Vehical v) {
		super();
		this.id = id;
		this.name = name;
		this.v = v;
	}


	void display()
	{
		System.out.println(id+ ""+name +v );
		System.out.println(+v.vid  +v.vname) ;
	}
	
		
		
		
	
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Vehical getVehical() {
			return v;
		}
		public void setVehical(Vehical vehicle) {
			this.v = v;
		}
		


	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Vehical  v = new Vehical( 500 ,"Bike");
		Person per1 = new Person(4 , "Rita" , v);
		per1.display();
	
		//System.out.println();
	}

}



public class Vehical {
	int vid;
	String vname ;
	
	public Vehical(int vid, String vname) {
		super();
		this.vid = vid;
		this.vname = vname;
	}
	
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Person p = new Person();
	}

}

