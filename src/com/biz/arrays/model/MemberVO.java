package com.biz.arrays.model;

public class MemberVO {

	public String strName;
	public String strTel;
	
	/*
	 * MemberVO의 멤버 변수 중 intAge는
	 * 나이를 보관하는 변수이다.
	 * 만약 실수로 데이터를 저장(보관)할 때
	 * 실제 나이 범위를 벗어나게 저장하면
	 * 나중에 연산을 수행할 때
	 * 문제를 일으킬 수도 있다.
	 * 이럴때
	 * 멤버변수를 private으로 선언하고
	 * 값을 저장할 때 method를 통해서 저장하는 방법이 있다.
	 */
	private int intAge;

	// 외부에서 intAge 값을 읽을 때 사용할 method
	public int getIntAge() {
		return intAge;
	}
	
	// 외부에서 intAge 변수에 값을 저장(할당)할 때 사용할 method
	// 외부에서 setIntAge()를 호출할때
	// () 안에 int형 값을 포함해서 호출을 하면
	// 아래 int intAge로 선언된 변수가 그 값을 수신한다.
	
	// 수신하여 intAge 변수에 저장된 값은
	// this.intAge 멤버변수에 다시 저장된다.
	
	// 이 method는 사용자에 의해
	// 나이 멤버변수에 값을 저장하려고 할 때
	// 유효한 범위의 값인지 미리 검사하고
	// 그렇지 않으면 저장을 거부한다.
	// 나중에 값을 조회 했을 때 해당 값이 0으로 나타나면
	// 다른 값일 때보다 구분이 쉬워서 오류확률을 낮출 수 있다.
	
	// 이런 코드를 유효성 검사코드라고 한다.
	
	// 주 목적은 intAge에 잘못된 데이터가 저장되는 것을
	// 미리 막는데 있다.
	public void setIntAge(int intAge) {
		
		if(intAge < 0) { //intAge를 보호하기 위한 값을 지정, 유효성 검사
			System.out.println("나이는 0세 이상이어야 한다.");
			return ; // setIntAge를 호출하면서 intAge가 -1이면 여기만 실행되고 종료됨.,,, break와 비슷,, 값을 저장하지 말고 끝내라
		}
			
		if(intAge > 120) {
			System.out.println("나이는 120세 이하이어야 한다.");
			return ;
		}
		this.intAge = intAge; // 하늘색 변수는 멤버변수
	}
}
