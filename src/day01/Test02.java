package day01;

public class Test02 {
	public static void main(String [] args) {
		System.out.println("이름 : 홍길동");
		System.out.println("나이 : 20살");
		System.out.println("주소 : 산골짜기");
		String name ="홍길동";
		int age = 20;
		String str = "산골짜기";
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age + "살");
		System.out.println("주소 : " + str);
		
		// \n : 엔터와 비슷, \t : 탭크기만큼(스페이스바 8칸) 왼쪽으로 이동
		// \"(큰따옴표 표현), \\ : (역슬러시 하나표현)
		System.out.println("안\n녕\n하\n세\n요");
		System.out.println("12345678\t12\t12");
		System.out.println("\"안녕하세요\"");
		System.out.println("안\\녕");
		System.out.println("I:\\안 녕\"");
	}
}
