package com.biz.arrays.exec.method;

import com.biz.arrays.model.MemberVO;

public class MethodEx_02 {

	public static void main(String[] args) {
		
		MemberVO mVO = new MemberVO();
		mVO.strName = "홍길동";
		mVO.strTel = "010-1111-1234";
		
		
		System.out.println("이름 : " + mVO.strName); // 이름 : 홍길동
		System.out.println("전화번호 : " + mVO.strTel); // 전화번호 : 010-1111-1234
		mVO.setIntAge(-440);
		System.out.println("나이 : " + mVO.getIntAge()); // 나이 : 44

	}
}
