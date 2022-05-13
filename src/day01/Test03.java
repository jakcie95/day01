package day01;

public class Test03 {
	public static void main(String[] args) {
		System.out.println(100);
		System.out.println(100.123);
		System.out.println(100 + 1.123);
		System.out.println("안녕" + "하세요");
		System.out.println("안녕" + 100);
		System.out.println("안녕" + (100 + 200));
		System.out.println(1+""+2);
		//내 풀이
		System.out.println("이름" + "\t" + "나이" + "\t" + "전화번호" +"\t" + "\t" +"회비");
		System.out.println("홍길동" +"\t" + "\"15\"" + "\t" +3672 + "-" + 1234 + "\t" +"\\20000");
		System.out.println("고길동" +"\t" + "\"15\"" + "\t" +2238 + "-" + 1234 + "\t" +"\\30000");
		System.out.println("김말이" +"\t" + "\"15\""+ "\t" + 1234 + "-" + 1234 + "\t" + "\\50000");
		System.out.println("총합계" + "\t" +"\t" + "\t" + " \t" + "\\100000");
		//풀이식
		System.out.println("이름\t나이\t전화번호\t\t 회비");
		System.out.println("홍길동\t\""+15+"\"\t"+3672+"-"+1234+"\t\\" +20000);
		System.out.println("고길동\t\""+15+"\"\t"+2238+"-"+1234+"\t\\" +30000);
		System.out.println("김말이\t\""+15+"\"\t"+1234+"-"+1234+"\t\\" +50000);
		System.out.println("총합계\t\t\t\t\\"+100000);
	}
}
