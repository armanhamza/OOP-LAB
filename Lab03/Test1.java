public class Test1{
	public static void main(String args[]){
		System.out.println("Application to find maximum number.");
		FindMaxPro ob1 = new FindMaxPro();
		
		System.out.println("Maximum number is :" + ob1.max(3,9));
		System.out.println("Maximum number is :" + ob1.max(3,9.0));//will cal double max function. 
		System.out.println("Maximum number is :" + ob1.max(3,'c'));//intergar will be compared to ASCII value.
		System.out.println("Maximum number is :" + ob1.max(30.0,93.5));
		System.out.println("Maximum number is :" + ob1.max(30.0,93));//It will still call double function.
		System.out.println("Maximum number is :" + ob1.max(30.0f,93.0f));//It will now call float function.
		System.out.println("Maximum String is :" + ob1.max("Arman","Rehman"));

}
}