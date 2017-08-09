package JavaHomework;

import java.util.Arrays;
import java.util.Scanner;

public class JavaHomework3_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int triangle[] = new int[3];
		System.out.println("請輸入三個整數(以空白隔開)：");
		for (int i = 0; i <= 2; i++) {
			triangle[i] = input.nextInt();
		}
		Arrays.sort(triangle);
		if (triangle[0] + triangle[1] <= triangle[2]) {
			System.out.println("不是三角形");
		} else {
			if (triangle[0] != triangle[1] && triangle[1] != triangle[2]) {
				System.out.println("其他三角形");
			} else {
				if (triangle[0] * triangle[0] + triangle[1] * triangle[1] == triangle[2] * triangle[2]) {
					System.out.println("直角三角形");
				} else {
					if (triangle[0] == triangle[1] && triangle[1] != triangle[2]) {
						System.out.println("等腰三角形");
					} else {
						System.out.println("正三角形");
					}
				}
			}
		}
		input.close();
	}

}
