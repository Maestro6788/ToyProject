package com.company.toyproject.beakjoon1012;

public class beakjoon1012 {

	/**
	 * 백준 1012문제
	 * https://www.acmicpc.net/problem/1012
	 *
	 * 리팩토링 규칙
	 * 1. else 사용금지
	 * 2. indent 2번이상 금지
	 * 3. 매개변수 인자 3개이상 금지
	 * 4. 메소드 15줄 이상 금지
	 *
	 * 테스트 코드 작성
	 */

	private static int[] dx = {-1, 0, 1, 0};
	private static int[] dy = {0, -1, 0, 1};

	private static int[][] miro =
		{
			{1, 1, 0, 1, 1},
			{0, 0, 1, 0, 1},
			{1, 0, 1, 0, 1},
			{1, 0, 1, 1, 1},
		};
	private static boolean[][] miroVisite = new boolean[miro.length][miro[1].length]; //[y][x]

	public static void main(String[] args) {
		int count = 0;

		for (int rowCycle = 0; rowCycle < miro.length; rowCycle++) {
			for (int columCycle = 0; columCycle < miro[1].length; columCycle++) {
				if (!miroVisite[rowCycle][columCycle] && miro[rowCycle][columCycle] == 1) {
					count++;
					dfs(rowCycle, columCycle);
				}
			}
		}

		System.out.println("정답 : " + count);
	}

	public static void dfs(int x, int y) {
		miroVisite[x][y] = true; //방문처리

		for (int i = 0; i < 4; i++) {
			int nextX = x + dx[i];
			int nextY = y + dy[i];

			if (nextX >= 0 && nextY >= 0 && nextX < miro.length && nextY < miro[1].length) {
				if (miro[nextX][nextY] == 1 && !miroVisite[nextX][nextY]) {
					dfs(nextX, nextY);
				}
			}
		}

	}

}
