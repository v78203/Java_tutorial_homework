package JavaHomework;
import java.util.Arrays;
import java.util.Scanner;

public class JavaHomework3_3 {
	public static void main(String[] args) {
		System.out.println("阿文，你今天不想要的數字是？");
		int option = 0;
		int numberAvalible[] = new int[49];
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();

		System.out.println("可選擇的數字有:");
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= 9; j++) {
				if ((i == number || j == number) || (i == 0 && j == 0)) {
				} else {
					System.out.print(i * 10 + j + " " + '\t');
					numberAvalible[option] = i * 10 + j;
					option = option + 1;
				}
			}
			if (i != number) {
				System.out.println();
			}
		}

		int choosen[] = new int[option];
		for (int i = 0; i < option; i++) {
			choosen[i] = (i + 1);
		}

		for (int i = 0; i < choosen.length; i++) {
			int random = (int) (Math.random() * option);
			int temp = choosen[random];
			choosen[random] = choosen[i];
			choosen[i] = temp;
		}
		int result[] = new int[6];
		int k;
		for (int i = 0; i < 6; i++) {
			k = choosen[i];
			result[i] = numberAvalible[k];
		}
		Arrays.sort(result);
		System.out.println("總共有" + option + "個");
		System.out.println("推薦你一組號碼：");
		for (int i = 0; i < 6; i++) {
			System.out.print(result[i] + " ");
		}
		System.out.println();
		input.close();
	}
}
