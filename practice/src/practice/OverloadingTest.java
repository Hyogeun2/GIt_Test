package practice;

import java.util.*; //scanner Ŭ������ ����ϱ� ���� �߰�

import practice.MyMath3.array;

public class OverloadingTest {

	public static void main(String[] args) {
		MyMath3 mm = new MyMath3();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���ڸ� ������ �ϳ� �Է����ּ���.>");
		int num = scanner.nextInt();
		System.out.println("mm.add(3,3) ���:" + mm.add(3,3));
		System.out.println("mm.add(3L,3) ���:" + mm.add(3L,3));
		System.out.println("mm.add(3,3L) ���:" + mm.add(3,3L));
		System.out.println("mm.add(3L,3L) ��� :" + mm.add(3L,3L));
		System.out.println("mm.add(k) ���:" + mm.add(array.k)); //static Ŭ���� �����
		int [] k = {200,400,500};
		System.out.println("mm.add(k) ���:" + mm.add(k));
		System.out.println("scanner �޼����� ���" + mm.add(num,num));

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
	
	int add(int[] a) {                                //�迭�� ��� ����� ���� ����� �����ش�.
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
