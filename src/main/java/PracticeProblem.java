public class PracticeProblem {

	public static void main(String args[]) {
		


	}
	public static int sum(int num1, int num2){
		int num = num1 + num2;
		return num;
	}
	public static int difference(int num1, int num2){
		int num = num1 - num2;
		return num;
	}
	public static double product(double  num1, double num2){
		double num = num1*num2;
		return num;
	}
	public static String removeFirst(String word){
		return word.substring(1, word.length());
	}
	public static int combinedLength(String word, String word1){
		int length= word.length()+ word1.length();
		return length;
	}
	public static boolean isEven(int num){
		boolean even = num%2==0;
		return even;
	}
	public static boolean isOdd(int num){
		boolean odd = num%2!=0;
		return odd;
	}
	public static boolean isPositive(int num){
		boolean positive= num>0;
		return positive;
	}
	public static boolean isNegative(int num){
		boolean negative= num<0;
		return negative;
	}
	


}
