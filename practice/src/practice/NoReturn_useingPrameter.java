package practice;

public class NoReturn_useingPrameter {

	public static void main(String[] args) {
		NoReturn_useingPrameter r = new NoReturn_useingPrameter();
		
		int result = r.add(3,5);
		System.out.println(result);
		
		int[] result2 = {0};
		r.add(3,5,result2);
		System.out.println(result2[0]);
		
		

	}
	
	int add(int a,int b) { 
		return a+b;
	}
	void add(int a, int b, int[] result ) {
		result [0] = a+ b; //�Ű������� �Ѱܹ��� �迭�� �������� ����
	}

}

//��ȯ���� �ִ� �޼��带 ��ȯ���� ���� �޼���� �ٲٴ� ���.
//�޼���� �� �ϳ��� ������ ��ȯ�� �� ������ �̰��� �����ϸ� ���� ���� ���� ��ȯ�޴� �Ͱ� ���� ȿ���� ���� �� �ִ�.