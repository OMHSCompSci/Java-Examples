package examples.intro;

public class MySecondClass {

	public static void main(String[] args) {
		int a = 5;
		int b = 3;
		int finalAnswer = add(a,b);
		//Extra line
		System.out.println(finalAnswer);
	}
	
	public static int add(int x, int y) {
		int result =  x + y;
		return result;
	}
	
}
