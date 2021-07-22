package com.company.toyproject.beakjoon2468;

public class beakjoon2468 {

	/**
	 * 백준 2468문제
	 * https://www.acmicpc.net/problem/2468
	 *
	 * 리팩토링 규칙
	 * 1. else 사용금지
	 * 2. indent 2번이상 금지
	 * 3. 매개변수 인자 3개이상 금지
	 * 4. 메소드 15줄 이상 금지
	 *
	 * 테스트 코드 작성
	 */

	private static final int depth = 4;

	private static int[] dx = {-1, 0, 1, 0};
	private static int[] dy = {0, -1, 0, 1};

	private static int[][] miro =
		{
			{6, 8, 2, 6, 2},
			{3, 2, 3, 4, 6},
			{6, 7, 3, 3, 2},
			{7, 2, 5, 3, 6},
			{8, 9, 5, 2, 7}
		};
	private static boolean[][] miroVisite = new boolean[miro.length][miro[1].length]; //[y][x]

	public static void main(String[] args) {
		int count = 0;

		for (int rowCycle = 0; rowCycle < miro.length; rowCycle++) {
			for (int columCycle = 0; columCycle < miro[1].length; columCycle++) {
				if (!miroVisite[rowCycle][columCycle] && miro[rowCycle][columCycle] > depth) {
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
				if (miro[nextX][nextY] > depth && !miroVisite[nextX][nextY]) {
					dfs(nextX, nextY);
				}
			}
		}

	}

}
