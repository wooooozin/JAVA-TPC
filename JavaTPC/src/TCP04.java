
public class TCP04 {

	public static void main(String[] args) {
		
		// 4. 데이터를 이동하라 , 변수와 배열 
		
		// 정수 3개를 저장하기
		int a, b, c;
		a = 10;
		b = 20;
		c = 30;

		// a + b + c -> 메서드 처리 sum()
		sum(a, b, c);
		
		// 여러개의 수를 더해야 한다면? 매개변수가 늘어나서 불편함
		// 하나의 구조로 묶어서 이동 -> 배열(동일한 타입)
		int[] arr = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		sum1(arr);
		
	}
	
	public static void sum(int a, int b, int c) {
		System.out.println(a + b + c);
	}
	
	public static void sum1(int[] arr) {
		int sum = 0;
		for (int n : arr) {
			sum += n;
		}
		
		System.out.println(sum);
		
	}

}
