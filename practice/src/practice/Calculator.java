package practice;

class Calculator {
   int a = 1;
   int b = 2;
   int result ;
   
   String c = "+";
   
   void plus(int a,int b) {result = a+b;}
   void minuse(int a,int b) {result = a-b;}
   
}
class CalculatorTest {
	public static void main(String[] args) {
		Calculator t;
		t = new Calculator();
		 if ("+".equals(t.c)) {
	    	   t.plus(t.a, t.b);
	       } else if("-".equals(t.c)) {
	    	   t.minuse(t.a, t.b);
	       } else {System.out.println("non");}
	       
		
      System.out.println(t.result);
		

	}
}


