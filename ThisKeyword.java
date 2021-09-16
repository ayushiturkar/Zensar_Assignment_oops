package emp;

public class ThisKeyword {
       int id; 
       String name;
       String city;
       
       
        ThisKeyword(int id, String name, String city)
       {
    	   this.id = id;
    	   this.name= name;
    	   this.city = city;
    	   System.out.println(+id +name +city  );
       }
	public static void main(String[] args) {
          ThisKeyword obj = new ThisKeyword(40 , "Ayushi", "Pune");
          
	}

}
