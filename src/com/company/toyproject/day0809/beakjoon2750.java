package com.company.toyproject.day0809;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class beakjoon2750 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());

		ArrayList<Integer> set1 = new ArrayList<>();

		for (int index = 0; index < N; index++) {
			set1.add(Integer.parseInt(br.readLine()));
		}

		Collections.sort(set1);

		for (int index = 0; index < N; index++) {
			System.out.println(set1.get(index));
		}

	}

}

//https://st-lab.tistory.com/105