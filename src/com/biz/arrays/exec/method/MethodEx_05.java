package com.biz.arrays.exec.method;

import com.biz.arrays.service.MethodService;

/*
 * method의 다형성
 * 
 * 객체지향의 특징 중 한 가지로
 * method의 매개변수의 type, 개수가 다를 경우
 * method의 이름을 같게 중복해서 선언 할 수 있는 특징
 * 
 * void add(int n1, int n2)와
 * void add(float f1, float f2)는
 * 같은 이름이지만 매개변수 type 이 다르므로
 * 다른 method로 인식을 한다.
 * 
 * 추상화, 캡슐화, 정보은닉과 더불어 다형성
 * 객체지향의 중요한 특징이다.
 */
public class MethodEx_05 {

	public static void main(String[] args) {
		
		MethodService ms = new MethodService();
		
		ms.add(); //매개변수가 없는 method ,,, void add() 가 호출
		ms.add(100); //매개변수 1개 : 100 ,,, void add(int num)가 호출
		ms.add(30, 40); //두개의 매개변수 합 : 70 ,,, void add(int num1, int num2)가 호출
		ms.add(30.f, 40.f); //두 실수의 합 : 70.000000 ,,, void add(float f1, float f2)가 호출

	}
}
