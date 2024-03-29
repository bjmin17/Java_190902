package com.biz.arrays;

import java.util.Random;

public class Array_03 {
/*
 * 배열 요소의 정렬, 41526을 12456 이면 오름차순,ASC(낮은 수에서 높은 수)
 * 65421이면 내림차순, DESC(높은 수에서 낮은 수),,,,,정렬 알고리즘, 서치 알고리즘
 * 쉽게는 주로 버블정렬, insert정렬, select정렬 3가지
 */
	public static void main(String[] args) {

		int[] nums = new int[10];
		Random rnd = new Random();
		
		for(int i = 0 ; i < nums.length ; i++) {
			nums[i] = rnd.nextInt(100) + 1;
		}
		
		for(int i = 0 ; i < nums.length ; i++) {
			System.out.print(nums[i] + ", ");
		}
		System.out.println("\n============오름차순 정렬==============");
		
		// 정렬하기 위해서
		// 1. 배열의 개수만큼 반복문을 시작
		for(int i = 0 ; i < nums.length; i++) {
			
			// 2. 배열요소 i 번째와 i+1 번째부터
			//		length - 1번째까지 비교를 해서
			// 3. 큰 값을 오른쪽에 위치하도록 자리 바꿈
			for(int j = i+1 ; j < nums.length ; j++) { 		// i가 0이면 j는 1~9,, i가 1이면 j는 2~9
				// i 가 왼쪽, j 가 오른쪽 위치를 나타내며
				// nums[i]가 nums[j] 보다 크다는 것은
				// 왼쪽 값이 더 크다는 것이므로
				// i번째의 값과 j번째의 값을 서로
				// 바꾸어준다.
				if(nums[i] > nums[j]) {
					
					int _temp = nums[i]; // 한번만 쓰고 버릴 변수를 앞에 _ 붙여주기도 함.
					nums[i] = nums[j];
					nums[j] = _temp;
				}
				
			}
			
		}
		for(int i = 0 ; i < nums.length ; i++) {
			System.out.print(nums[i] + ", ");
		}

		
	}

}
