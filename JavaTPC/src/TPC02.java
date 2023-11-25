
public class TPC02 {

	public static void main(String[] args) {
		// 프로그래밍의 3대 요소 : 변수, 자료형, 할당
		
		// 1 + 1 = 2 (메모리에서 계산)
		// 메모리에 계산할 수를 저장할 수 있는 기억공간이 필요함
		// 이 기억공간에 이름을 지어주는 것을 변수라고 함(Symbol name)
		
		// 기억공간의 크기와 어떤 종류를 저장할 것인가 
		// 변수가 만들어지기 위해서는 크기와 종류를 결정해줘야 한다.
		// 종류 -> 데이터 타입
		
		// * 자료형 - 정수 int 실수 double, float 문자 char 참/거짓 boolean
		
		// 1 + 1 = 2 
		int a, b, c; // a, b, c 라는 기억공간을 만듬 (int는 4byte의 크기)
		a = 1;
		b = 1;
		c = a + b;
		System.out.println(c); // 2 
		
		// = 은 할당 연산자임
		
		// 자료형은 기본 자료형(PDT) 과 사용자 정의 자료형 (UDDT)
		
		float f;
		double d;
		
		f = 13.3f;
		d = 13.3;
		
		char ch;
		ch = 'A';
		
		boolean isTrue;
		isTrue = true;
		System.out.println(isTrue);


		// 만약 책이라는 데이터타입을 담을려면 BOOK이라는 클래스를 만들어 제공하면 된다
		
		// 변수를 생성하면 변수를 관리하기 위한 변수 테이블(심볼테이블)를 만들어 관리하고
		// 변수이름과 번지를 키 밸류 값으로 가지고 있어 할당하게 되면 메모리 번지에 해당 값을 할당한다.
	}

}
