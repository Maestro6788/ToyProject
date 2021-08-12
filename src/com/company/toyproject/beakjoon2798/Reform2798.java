package com.company.toyproject.beakjoon2798;

import java.util.ArrayList;
import java.util.Collections;

public class Reform2798 {
	/**
	 * 백준 2798에서 3장으로 한정하고 있다
	 * 3장 > 5장으로 하고  for3중을 제한하고 풀자!
	 * https://velog.io/@kha0318/Algorithm-%EB%B0%B1%EC%A4%80-2798-%EB%B8%94%EB%9E%99%EC%9E%AD
	 */


	static int cardSize = 10;
	static int MaxValue = 500;
	static int[] NumArray = new int[] {93, 181, 245, 214, 315, 36, 185, 138, 216, 295};

	//static int cardSize = 5;
	//static int MaxValue = 21;
	//static int[] NumArray = new int[] {5,6,7,8,9};

	static int ret = 0;
	static boolean result[];

	public static void main(String[] args) {
		// chk 배열생성
		result = new boolean[cardSize];
		// dfs
		dfs(0,0);
		// 결과 출력
		System.out.println(ret);

	}

	public static void dfs(int depth, int start){
		// 결과 비교 높은 숫자 선택
		if(depth==3){
			ret = Math.max(ret, check());
			return ;
		}
		// n중 for문
		for (int i=start; i < cardSize ; i++){
			result[i] = true;
			dfs(depth+1,i+1);
			result[i] = false;

		}
	}

	public static int check() {

		int sum = 0;
		for(int i = 0 ; i < cardSize ; i++){
			if(result[i]){
				sum += NumArray[i];
			}
		}

		if(sum > MaxValue){
			return -1 ;
		}
		else{
			return sum;
		}

	}
}
