import kr.bit.Book;

public class TCP03 {

	public static void main(String[] args) {
		// 관계를 이해하라 
		
		// PDT VS UDDT
		
		// 정수 1개를 저장하기 위한 변수를 선언하시오.
		int number; // 선언
		number = 10; // 할당
		
		// 책 1권을 저장하기 위한 변수를 선언하시오.
		Book book = new Book();
		book.title = "자바책";
		book.price = 10000;
		book.company = "자바출판사";
		book.pages = 200;
		
		System.out.println(book); // kr.bit.Book@2a139a55, 주소를 출력
		
		
		
	}

}
