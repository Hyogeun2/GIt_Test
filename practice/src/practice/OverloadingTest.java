package practice;

import java.util.*; //scanner 클래스를 사용하기 위해 추가

import practice.MyMath3.array;

public class OverloadingTest {

	public static void main(String[] args) {
		MyMath3 mm = new MyMath3();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("두자리 정수를 하나 입력해주세요.>");
		int num = scanner.nextInt();
		System.out.println("mm.add(3,3) 결과:" + mm.add(3,3));
		System.out.println("mm.add(3L,3) 결과:" + mm.add(3L,3));
		System.out.println("mm.add(3,3L) 결과:" + mm.add(3,3L));
		System.out.println("mm.add(3L,3L) 결과 :" + mm.add(3L,3L));
		System.out.println("mm.add(k) 결과:" + mm.add(array.k)); //static 클래스 만들기
		int [] k = {200,400,500};
		System.out.println("mm.add(k) 결과:" + mm.add(k));
		System.out.println("scanner 메서드의 결과" + mm.add(num,num));

	}
	

}

class MyMath3 {
	int add(int a, int b) {
		System.out.println("int add(int a, int b) -");
		return a+b;
	}
	long add(int a, long b) {
		System.out.println("long add(int a, long b -" );
	    return a+b;
	}
	long add(long a, int b) {
		System.out.println("long add(long a, int b -");
		return a+b;
	}
	long add(long a, long b) {
		System.out.println("long add(long a, long b -");
	   return a+b;
	}
	
	int add(int[] a) {                                //배열의 모든 요소의 합을 결과로 돌려준다.
		System.out.println("int add(int[] a - "  );
		int result = 0;
		for(int i =0; i < a.length ; i++) {
			result += a[i];
		}
		return result;
	}
	                  
static class array{
	
	static int [] k = {3,2,1};
	
}
}
