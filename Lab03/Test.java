public class Test{
	public static void main(String args[]){
		System.out.println("Application to find maximum number.");
		FindMax ob1 = new FindMax();

		System.out.println("Maximum number is :" + ob1.max(3,9));
		System.out.println("Maximum number is :" + ob1.Doublemax(30.0,93.5));
		System.out.println("Maximum String is :" + ob1.maxString("Arman","Rehman"));

}
}