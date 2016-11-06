package string.test;

import java.util.StringTokenizer;

public class StringTest44 {
	public static void main(String[] args) {
		String s1 = "제임스고슬링";
		String s2 = " 제임스 고슬링";
		String s3 = "제임스 고슬링 ";
		
		System.out.println("\n ===== charAt(), indexOf() =====");
		
		System.out.println("s2의 문자열에서 '고'에 해당하는 문자를 받아 리턴");
		System.out.println("charAt() : " + s2.charAt(5));
		System.out.println("indexOf(n) : " + s2.indexOf("고"));
		System.out.println("indexOf(n) : " + s2.indexOf("하")); //-1
		System.out.println("");
		System.out.println("");
		System.out.println("\n ===== split() =====");
		
		String sp = " 쓰레기, 빙그레, 삼천포, 나정이, 윤진이, 칠봉이";
		
		String[] st = sp.split(",");
		for(String str : st){
		System.out.println(str);
		}
		
		System.out.println("\n ===== StringTokenizer =====");
		StringTokenizer stk = new StringTokenizer(sp, ",");
		while(stk.hasMoreTokens()){
			
		System.out.println(stk.nextToken());
		}
		
		System.out.println("\n ===== startsWith(), endsWith() =====");
		
		String str = "오늘 저녁에 약속 있으신가요?";

		String str2 = "JAMES GOSLING";
		String str3 = "james gosling";

		// true가 나올수 있는 방법 2가지 있음.. 철자를 고치지 말고 ..
		
		System.out.println(str2.equalsIgnoreCase(str3));
		System.out.println(str2.equals(str3.toUpperCase()));
		System.out.println(str2.toLowerCase().equals(str3));
		System.out.println(str3.concat(" is java language Creature.."));
	}
}
