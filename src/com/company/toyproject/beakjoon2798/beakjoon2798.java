package com.company.toyproject.beakjoon2798;

import java.util.ArrayList;
import java.util.Collections;

public class beakjoon2798 {

	public static void main(String[] args) {

		int cardSize = 10;
		int MaxValue = 500;
		int[] NumArray = new int[] {93, 181, 245, 214, 315, 36, 185, 138, 216, 295};


		// 배열 -> list
		ArrayList<Integer> NumList = new ArrayList<>();
		for(int i : NumArray){
			NumList.add(i);
		}
		Collections.sort(NumList);

		// 3개합 검사 메소드 호출
		int result = MaxValueCheck(NumList, cardSize , MaxValue);

		// 정답 반환
		System.out.println("result : " +result);

	}

	public static int MaxValueCheck(ArrayList NumList, int cardSize, int MaxValue){

		int sum =0;
		ArrayList<Integer> solution = new ArrayList<>();

		// 카드 3개 합  M값 확인 로직
		for (int firstCard = 0 ; firstCard< cardSize-2 ; firstCard++ ){
			for(int secondCard = firstCard +1 ; secondCard < cardSize -1 ; secondCard++){
				for(int thirdCard = firstCard + 2 ; thirdCard < cardSize ; thirdCard++){

					sum = (int)NumList.get(firstCard) + (int)NumList.get(secondCard) +(int)NumList.get(thirdCard);

					if(sum == MaxValue){
						return sum;
					}
					else if(sum < MaxValue){
						solution.add(sum);
					}
				}
			}
		}

		// M값에 정확히 딱 떨어지지 않는다면 M보다 작은 값 중 제일 큰 값 출력
		Collections.sort(solution);
		return solution.get(solution.size()-1);
	}

}
