package programming;

public class ToString {

	public static void main(String[] args) {
		Student s=new Student("ankit" , 13);
				//System.out.println(s.name);
				//System.out.println(s.rollno);
		
		System.out.println(s);

	}

}
class Student 
{
	String name;
	int rollno;
	
	public Student(String name , int rollno) {
		
		this.name=name;
		this.rollno=rollno;
		
		
	}
	public String toString() 
	{
		return "name - "+name+ " : " +"rollno-"+rollno ;
		
	
	
}
}