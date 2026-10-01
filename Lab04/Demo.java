public class Demo{
	public static void main(String args[]){
	
		//Person p1= new Person();          error:arguments not passed.
		//Person p1=new Person("Arman","SP26-BAI-034@gmail.com",null,"Lahore");
		
		Person p1=new Person("Arman","SP26-BAI-034@gmail.com",new Date(16,9,06),"Lahore");
		p1.Display();


}
}