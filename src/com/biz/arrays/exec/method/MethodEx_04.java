package com.biz.arrays.exec.method;

import com.biz.arrays.service.MethodService;

/*
 * 1. main() method에서 MethodService 클래스를 ms 객체로 선언하고
 * 2. 다음 코드를 실행하여 30*40의 결과가 console에 나타나도록 코드를 완성하시오.
 * int retNum = ms.getSum(30,40);
 */

/*
 * 선생님꺼
 * \\ MethodService 클래스를 사용해서
 * \\ ms 객체를 생성한다.
 * \\ MethodService 클래스에 포함된
 * \\ 		멤버변수, method를 사용하기 위한 준비
 * MethodService ms = new MethodService();
 */
public class MethodEx_04 {

	public static void main(String[] args) {
		MethodService ms = new MethodService();
		int retNum = ms.getSum(30, 40);
		System.out.println(retNum); // 1200
		
		
	}
}
