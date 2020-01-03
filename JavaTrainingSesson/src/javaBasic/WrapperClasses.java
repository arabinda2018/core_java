package javaBasic;

strictfp class WrapperClasses {
public static void main(String[] args) {
	String s ="100";
	System.out.println(s+20);
	//data conversion to string to int
	int a =Integer.parseInt(s);
System.out.println(a+40);

//String to double conversion.
String y ="12.33";
double b =Double.parseDouble(y);
System.out.println(b+20);

//string to boolean conversion
String x ="true";
boolean f =Boolean.parseBoolean(x);
System.out.println(f);

//int to string conversion
int  no =923;
System.out.println(no+20);
String ss=String.valueOf(no);
System.out.println(ss+2);

//number format exception
String u="100A";
Integer.parseInt(u);
String s9 =String.valueOf(u);
System.out.println(s9);
}

}
