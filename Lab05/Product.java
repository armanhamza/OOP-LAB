public class Product{
	String name;
	private static String Id;
	double price;
	int qty;
	static double maxValue=0;
	static double minValue=0;
	private static int count=1;
Product(String name,double price,int qty){
	this.name=name;
	this.price=price;
	this.qty=qty;
	this.Id=String.format("P%03d",count++);
	if(maxValue < price){ maxValue=price;}
	if(minValue > price){ minValue=price;}
	else if(minValue == 0){ minValue=price;}


}

void Display(){
	System.out.println("Name :"+name);
	System.out.println("Id :"+Id);
	System.out.println("Quatity :"+qty);
	System.out.println("Price :"+price);
	System.out.println("Max :"+maxValue);
	System.out.println("Min :"+minValue);
}
}