package com.biz.arrays.exec.method;

import com.biz.arrays.service.MethodService;

public class MethodEx_01 {

	public static void main(String[] args) {
		
		// MethodSerivce 클래스에 정의된
		// method()를 호출하기 위해서
		// ms라는 객체를 선언하고, 초기화(생성)한다.
		//					생성자 메서드
		//					  객체를 초기화, 생성하는데
		//					  사용되는 method
		MethodService ms = new MethodService(); // ms까지가 선언문, 뒷부분이 초기화 부분,
		
		// 이 method()는 호출만 할 수 있는 method이다
		// 즉, void 형 method는 호출만 할 수 있다.
		ms.consoleView(); // 나는 콘솔에 표시하는 method()
		
		// 이 method()는 int형 return method이다
		// return 문에 의해서 값, 변수 등을
		// 호출한 곳으로 되돌려줄 수 있다.
		// 호출한 곳에서는 되돌려 받은 값을 변수에 저장할 수 있다.
		int num = ms.numRet();
		// 변수에 저장된 값은 자유롭게 가공하여
		// 사용할 수 있다.
		System.out.println("numRet가 return 한 값 : " + num); //numRet가 return 한 값 : 600
		
		// method가 return 한 값은
		// 임의의 기억장소에 저장된 값을 읽는 것과 같다.
		// 기억장소에 저장된 값과 200을 덧셈하여 num1에 저장
		int num1 = ms.numRet() + 200;
		System.out.println(num1);
		
		// method가 return 하는 값을 변수에 받으려면(저장하려면)
		// 반드시 같은 type의 변수를 선언하고
		// 값을 받아야 한다.
		// strRet() 메서드의 return type이 String 이므로
		// 반드시 String형 변수에 받아야 한다.
		String strRet = ms.strRet();
		
		// numRet() method의 return type이 int 형인데
		// String형 변수에 받으려고 하면
		// 		type missmatch 오류가 난다.
		// 이 때는 값을 문자열로 바꾸어주면 된다.
		String strRet1 = ms.numRet() + "";
		
		// String = int return형 method() 
		//				+ String return형 method()
		String strRet2 = ms.numRet() + ms.strRet();
		
		
		
	}
}
