package practice;

import java.util.*; //scanner 클래스를 사용하기 위해 추가

import practice.MyMath3.array;

class Scannerin{
	Scanner scanner = new Scanner(System.in);

	
	while(true) {
		String input = scanner.nextLine(); //화면입력받은 내용을 input에 저장
	    
		if(input.length()==2) { // 두 글자를 입력한 경우
			int a = input.charAt(0) - '0'; //문자를 숫자로 변환
			int b = input.charAt(1) - '0';
			
			if(a==0 && b==0)
				break;
	}

  }
}


public class OverloadingTest {

	public static void main(String[] args) {
		MyMath3 mm = new MyMath3();
		Scannerin in = new Scannerin();
		System.out.println(in.a);
		System.out.println(in.b);
		
		System.out.println("두자리 정수를 하나 입력해주세요.>");
		
		System.out.println("mm.add(3,3) 결과:" + mm.add(3,3));
		System.out.println("mm.add(3L,3) 결과:" + mm.add(3L,3));
		System.out.println("mm.add(3,3L) 결과:" + mm.add(3,3L));
		System.out.println("mm.add(3L,3L) 결과 :" + mm.add(3L,3L));
		System.out.println("mm.add(k) 결과:" + mm.add(array.k)); //static 클래스 만들기
	    int [] k = {3,3,3,3};
		System.out.println("mm.add(k) 결과:" + mm.add(k));
        System.out.println(mm.add(in.a,in.b));		
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
}
