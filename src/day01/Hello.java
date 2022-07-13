public class Hello //클래스명과 파일명이 동일해야 함.
{
		//단문 주석: 한 줄짜리 주석
		/* 복문 주석: 여러 줄을
			주석처리 합니다
		*/
		/**문서화 주석: javadoc라는 유틸을 이용해 api문서를
			만들 때 이용
			(): 소괄호
			{}: 중괄호
			[]: 대괄호
			: 콜론
			; 세미콜론
			. 마침표
		*/
		//main() 메소드 구성 
		public static void main(String[] args)
	{
			System.out.println("Hello world~");
			System.out.print("안녕하세요?");
			System.out.print("반갑습니다. \n 저는 멀티캠퍼스의 손하은입니다.");
			/*특수제어문자 (Escape문자)
			\n: 줄바꿈
			\t: 탭끼 설정한 만큼 띄어쓰기를 한다
			\\: 역슬래시(\)를 출력하고자 할 때
			\": 쌍따옴표(")를 출력하고자 할 때
			\': 홑따옴표(')를 출력하고자 할 때
			*/
			System.out.print("\n국어\t영어\t수학");
			System.out.print("\n----------------------");
			System.out.println("\n99\t88\t88");
	
			System.out.println("역슬래시(\\)");
			System.out.println("김소월님의 \"진달래꽃\"");
	}



}