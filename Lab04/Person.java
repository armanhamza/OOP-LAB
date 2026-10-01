public class Person{
	private String name;
	private String Id;
	private String Email;
	//private String DateOfBirth;
	private Date DateOfBirth;
	private String City; 

	public Person(String name,String Email){
		System.out.println("Constructor 01 Called.");
		this(name,Email,null);

		
}
	//Method Overloading Concepts.
	public Person(String name,String Email,Date DateOfBirth){
		System.out.println("Constructor 02 Called.");
		this(name,Email,DateOfBirth,"Default City.");

}
	public Person(String name,String Email,Date DateOfBirth,String City){
		System.out.println("Constructor 03 Called.");
		this.name=name;
		this.Email=Email;
		this.DateOfBirth=DateOfBirth;
		this.City=City;
}
	public void Display(){
		System.out.println("Name: "+name);
		//System.out.println("ID: "+Id);
		System.out.println("Email: "+Email);
		System.out.println("DOB: "+DateOfBirth);
		System.out.println("City: "+City);

}
}