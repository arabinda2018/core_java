package javaBasic;

public class StringConcatination {
	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		char s ='d';
		
		String x = "hello";
		String y = "world";
		System.out.println(x + y);
		System.out.println(a + b + x + y);
		System.out.println(y+x+(b+a));
	}
}
