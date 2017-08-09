package JavaHomework;
import java.util.Scanner;

public class JavaHomework4 {
	// 第一題：有個一維陣列如下：
	// {29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
	// 請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素

	public static void main(String[] args) {
		// 第一題：有個一維陣列如下：
		// {29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
		// 請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
		System.out.println("第一題");
		int matrixNumber1[] = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		int sum = 0;
		System.out.print("陣列為{");
		for (int i = 0; i < matrixNumber1.length; i++) {
			sum = sum + matrixNumber1[i];
			System.out.print(" " + matrixNumber1[i] + " ");
		}
		double avg = sum / matrixNumber1.length;
		System.out.println("}");
		System.out.println("平均為:" + avg);
		System.out.print("高於平均的為{");
		for (int i = 0; i < matrixNumber1.length; i++) {
			if (matrixNumber1[i] > avg) {
				System.out.print(" " + matrixNumber1[i] + " ");
			}
		}
		System.out.println("}");

		// 第二題：請建立一個字串，經過程式執行後，輸入結果是反過來的
		// 例如String s = “Hello World”，執行結果即為 dlroW olleH
		// ( 提示： String 方法，陣列 )

		System.out.println("第二題");
		System.out.println("輸入字串為:Hello World");
		String helloWorld = "Hello World";
		char split[] = helloWorld.toCharArray();
//		String split[] = helloWorld.split("");
		System.out.println("輸出為：");

		for (int i = (split.length - 1); i >= 0; i--) {
			System.out.print(split[i]);
		}
		System.out.println();

		// 第三題：有個字串陣列如下 ( 八大行星 ) ：
		// {“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”,
		// “uranus”,
		// “neptune”}
		// 請用程式計算出這陣列裡面共有多少個母音 (a, e, i, o, u)

		System.out.println("第三題");
		System.out.println("輸入字串為:{“mercury”, “venus”, “earth”, “mars”,“jupiter”, “saturn”, “uranus”,“neptune”}");
		String number3String[] = { "mercury", "“venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		int count3 = 0;
		for (int i = 0; i < number3String.length; i++) {
			String ss = number3String[i];
			String kk[] = ss.split("");
			for (int j = 0; j < kk.length; j++) {
				if ((kk[j].equals("a")) || (kk[j].equals("e")) || (kk[j].equals("i")) || (kk[j].equals("o"))
						|| (kk[j].equals("u"))) {
					count3++;
				}
			}
		}
		System.out.println("共有 " + count3 + "個母音");

		// 第四題：阿文上班時忘了帶錢包 , 想要向同事借錢 , 和他交情比較好的同事共有 5 個 , 其
		// 員工編號與身上現金列表如下：
		// 員工編號 25 32 8 19 27
		// 身上現金 2500 800 500 1000 1200
		// 請設計一個程式 , 可以讓小華輸入欲借的金額後 , 便會顯示哪些員工編號的同事
		// 有錢可借他 ; 並且統計有錢可借的總人數 : 例如輸入 1000 就顯示「有錢可借的
		// 員工編號 : 25 19 27 共 3 人 ! 」

		System.out.println("第四題");
		int colleague[][] = { { 25, 32, 8, 19, 27 }, { 2500, 800, 500, 1000, 1200 } };
		Scanner input = new Scanner(System.in);
		System.out.println("請輸入阿文想借多少錢：");
		int aVanWant = input.nextInt();
		int count4 = 0;
		System.out.print("有錢可借的員工編號 :");

		for (int i = 0; i < colleague[1].length; i++) {
			if (colleague[1][i] >= aVanWant) {
				System.out.print(colleague[0][i] + " ");
				count4++;
			}
		}
		System.out.println("共" + count4 + "人！");

		// 請設計一隻程式由鍵盤輸入三個整數，分別代表西元 yyyy 年， mm 月，
		// dd 日，它會顯示是該年的第幾天

		System.out.println("第五題");
		System.out.println("請輸入西元：年/月/日(以空白鍵隔開)");
		int countDay[] = new int[3];
		for (int i = 0; i < countDay.length; i++) {
			countDay[i] = input.nextInt();
		}
		int daySum = 0;
		int monthnormal[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int monthleap[] = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		if ((((countDay[0] % 4) == 0) && (countDay[0] % 100) != 0) || (countDay[0] % 400 == 0)) {
			for (int i = 0; i < (countDay[1] - 1); i++) {
				daySum = daySum + monthleap[i];
			}
		} else {
			for (int i = 0; i < (countDay[1] - 1); i++) {
				daySum = daySum + monthnormal[i];
			}
		}
		daySum = daySum + countDay[2];
		System.out.println("當天為該年份的第" + daySum + "天");

		// 班上有 8 位同學，他們進行了 6 次考試結果如下：
		// 請算出每位同學考最高分的次數
		//
		// 1號 2號 3號 4號 5號 6號 7號 8號
		// 1考 10 35 40 100 90 85 75 70
		// 2考 37 75 77 89 64 75 70 95
		// 3考 100 70 79 90 75 70 79 90
		// 4考 77 95 70 89 60 75 85 89
		// 5考 98 70 89 90 75 90 89 90
		// 6考 90 80 100 75 50 20 99 75
		System.out.println("第六題");
		int score[][] = { { 10, 35, 40, 100, 90, 85, 75, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, { 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, { 90, 80, 100, 75, 50, 20, 99, 75 } };
		int highest[] = new int[8];
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				for (int k = 0; k < score[i].length; k++) {
					if (score[i][j] >= score[i][k]) {
					} else {
						break;
					}
					if ((k == (score[i].length - 1)) && (score[i][j] >= score[i][k])) {
						highest[j]++;
					}
				}
			}
		}
		System.out.println("最高分次數為：");
		for (int i = 0; i < highest.length; i++) {
			System.out.print((i + 1) + "號：");
			System.out.print(highest[i] + "次, ");
		}
		input.close();
	}
}
