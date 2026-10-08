public class Demo{
	public static void main(String args[]){

	Product p1= new Product("Arman Hamza",5000,10);
	p1.Display();
	Product p2= new Product("Abdul Rehman Awan",4000,11);
	p2.Display();
	Product p3= new Product("Awais Awan",3000,12);
	p3.Display();
	Product p4= new Product("Abdullah",7000,13);
	p4.Display();
	Product p5= new Product("Abdullah",7000,13,new Date(1,9,6));
	p5.Display();

}
}