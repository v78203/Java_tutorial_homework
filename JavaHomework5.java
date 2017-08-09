package JavaHomework;

import java.util.Scanner;

public class JavaHomework5 {

	public static void main(String[] args) {
		// 第一題
		Scanner input = new Scanner(System.in);
		System.out.println("第一題：請輸入寬與高(以空白鍵隔開)");
		int width = input.nextInt();
		int height = input.nextInt();
		JavaHomework5.starSquare(width, height);
		input.close();

		// 第二題
		System.out.println("第二題");
		JavaHomework5.randAvg();

		// 第三題
		System.out.println("第三題");
		int[][] intArray = { { 1, 6, 3 }, { 9, 5, 2 } };
		double[][] doubleArray = { { 1.2, 3.5, 2.2 }, { 7.4, 2.1, 9.2 } };
		System.out.println(maxElement(intArray));
		System.out.println(maxElement(doubleArray));

		// 第四題請看其他檔案

		// 進階題
		genAuthCode();

	}

	// 第一題方法
	public static void starSquare(int width, int height) {
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// 第二題方法
	public static void randAvg() {
		int choosen[] = new int[100];
		for (int i = 0; i < 100; i++) {
			choosen[i] = (i + 1);
		}
		for (int i = 0; i < choosen.length; i++) {
			int random = (int) (Math.random() * 100);
			int temp = choosen[random];
			choosen[random] = choosen[i];
			choosen[i] = temp;
		}
		int sum = 0;
		System.out.println("本次亂數結果為:");
		for (int i = 0; i < 10; i++) {
			sum += choosen[i];
			System.out.print(choosen[i] + " ");
		}
		System.out.println();
		System.out.println("平均為:");
		int avg = sum / 10;
		System.out.println(avg);
	}

	// 第三題方法
	public static int maxElement(int x[][]) {
		int maximum = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (maximum < x[i][j]) {
					maximum = x[i][j];
				}
			}
		}
		return maximum;
	}

	public static double maxElement(double x[][]) {
		double maximum = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (maximum < x[i][j]) {
					maximum = x[i][j];
				}
			}
		}
		return maximum;
	}

	public static void genAuthCode() {
		int[] archive = new int[(26 + 26 + 10)];
		for (int i = 0; i < archive.length; i++) {
			if (i < 10) {
				archive[i] = i + 48;
			} else if ((i >= 10) && (i < 36)) {
				archive[i] = i + 55;
			} else {
				archive[i] = i + 61;
			}
		}
		int goal[] = new int[8];
		for (int i = 0; i < 8; i++) {
			int random = (int) (Math.random() * archive.length);
			goal[i] = archive[random];
		}
		System.out.println("本次隨機產生驗證碼為：");
		for (int i = 0; i < goal.length; i++)
			System.out.print((char) goal[i]);
	}
}
