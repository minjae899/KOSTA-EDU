package jdb.step1.test;
/*
 *step 1 :
 *디비와 연결하는 프로그램을 작성하려면 제일 먼저,
 *서버에 대한 정보를 담고 있는 드라이버가 프로그램이 실행되는 측의
 *메모리에 떠 있어야 한다.
 *이 정보를 바탕으로 클라이언트의 프로그램은 디비 서버와 연결될 수 있다.
 *이 과정이 드라이버 로딩 단계이다.
 */
public class DriverLoadingTest1{
	DriverLoadingTest1() {
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("loading Ok..");
		}catch(ClassNotFoundException e){
			System.out.println("loading fail..");
		}
	
	}
		public static void main(String[] args){
			new DriverLoadingTest1();
	}
}