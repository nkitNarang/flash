package programming;

public class Encapsulation {

	public static void main(String[] args) {
		Employ emp=new Employ();
		//emp.EmpId=242;
		//emp.EmpName="ankit";
		emp.setEmpId(5);
		emp.setEmpName("Ankit");
		
		//System.out.println("Employ Id is : "+ emp.EmpId);
		//System.out.println("Employ Name is :" + emp.EmpName);

		System.out.println(emp.getEmpId());
		System.out.println(emp.getEmpName());
	}

}
class Employ{
	private int EmpId ;
	private String EmpName ;
	
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	
}