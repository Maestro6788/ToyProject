package com.company.toyproject.beakjoon2023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class beakjoon2023 {
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		dfs(0, "", n);
		System.out.println(sb.toString());
	}

	public static void dfs(int idx, String num, int n) {
		if (idx == n) {
			sb.append(num + "\n");
			return;
		}

		for (int i = 1; i <= 9; i++) {
			if (isPrime(Integer.valueOf(num + i)))
				dfs(idx + 1, num + i, n);
		}
	}

	//에라토스테네스의 소수 판별 방식 사용.
	public static boolean isPrime(int num) {
		if (num == 1)
			return false;

		int sqrt = (int)Math.sqrt(num);
		for (int i = 2; i <= sqrt; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

}
