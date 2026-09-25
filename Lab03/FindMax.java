public class FindMax{
	int max(int num1, int num2){
		int result=0;
		if(num1 > num2)
			result=num1;
		else if(num2 > num1)
			result=num2;
		return result;}

	double Doublemax(double num1, double num2){
		double result=0;
		if(num1 > num2)
			result=num1;
		else if(num2 > num1)
			result=num2;
		return result;		}

	String maxString(String num1, String num2){
		String result="";
		if(num2.compareTo(num1) < num1.compareTo(num2))
			result=num1;
		else
			result=num2;
		return result;	
	}
}