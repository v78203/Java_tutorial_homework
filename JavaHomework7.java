package JavaHomework;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;

public class JavaHomework7 {
	public static void main(String args[]) throws Exception {
		// 第一題 ：請寫一個程式，可以在讀入一個檔案後，顯示有多少個位元組
		System.out.println("第一題：讀入檔案");
		File inportFile1 = new File("Sample.txt"); // 設定檔案位置

		int countbyte = 0, countchar = 0, countrow = 0; // 設定要求的計算參數
		FileInputStream in1 = new FileInputStream(inportFile1); // 使用byte輸出
		while ((in1.read()) != -1) {
			countbyte++; // 迴圈每跑一次計算一次byte
			// System.out.print((char)i);
		}
		in1.close();

		FileReader in2 = new FileReader(inportFile1); // 使用字元輸出
		while ((in2.read()) != -1) {
			countchar++;
			// System.out.print((char)j);
		}
		in2.close();

		FileReader in3 = new FileReader(inportFile1);
		BufferedReader in4 = new BufferedReader(in3);
		while (((in4.readLine()) != null)) { // 使用行輸出
			countrow++;
			// System.out.println(k);
		}
		in3.close();
		in3.close();
		System.out.println();
		System.out.println("共有" + countbyte + "個位元組");
		System.out.println("共有" + countchar + "個字元");
		System.out.println("共有" + countrow + "列資料");

		// 第二題：請寫一隻程式，能夠亂數產生 10 個 1 ～ 1000 的整數，並寫入一個名為 Data.txt
		// 的檔案裡 ( 請參考本章講義第 23 頁，使用 append 方式觀察效果 )
		File outputFile2 = new File("Data.txt");
		int rand[] = RandAvg(1000); // 以RandAvg方法輸出1000個亂數的陣列
		try {
			for (int ii = 0; ii < 10; ii++) { // 要求輸出10個數值到檔案
				FileOutputStream fos = new FileOutputStream(outputFile2, true); // 輸出串接
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				PrintStream ps = new PrintStream(bos);
				ps.println(rand[ii]);
				ps.close();
				bos.close();
				fos.close();
			}
		} catch (IOException e) {
		}

		// 第四題(第三題在檔案下方的方法區)
		// 請寫一支程式，利用老師提供的 Dog 與 Cat 類別分別產生兩個物件，寫到
		// C:\data\Object.dat 裡。注意物件寫入需注意的事項，若 C:\ 內沒有 data 資料夾，
		// 請用程式新增這個資料夾

		File dir4 = new File("C:\\data");
		if (!dir4.isDirectory()) {
			dir4.mkdir();
		}
		Pet pet[] = new Pet[4];
		pet[0] = new Cat("C1");
		pet[1] = new Cat("C2");
		pet[2] = new Dog("D1");
		pet[3] = new Dog("D2");

		File file45 = new File("C:\\data\\Object.dat");
		FileOutputStream fos = new FileOutputStream(file45);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		for (int jj = 0; jj < pet.length; jj++) {
			oos.writeObject(pet[jj]);
		}

		oos.close();
		fos.close();

		// 第五題
		FileInputStream fis = new FileInputStream(file45);
		@SuppressWarnings("resource")
		ObjectInputStream ois = new ObjectInputStream(fis);
		try {
			while (true) {
				Object oo = ois.readObject();
				if (oo instanceof Pet) {
					((Pet) oo).speak();
					System.out.println("--------------------");
				}
			}
		} catch (EOFException e) {
			System.out.println("over");
		}

	}

	public static int[] RandAvg(int number) {
		int choosen[] = new int[number];
		for (int i = 0; i < number; i++) {
			choosen[i] = (i + 1);
		}
		for (int i = 0; i < choosen.length; i++) {
			int random = (int) (Math.random() * number);
			int temp = choosen[random];
			choosen[random] = choosen[i];
			choosen[i] = temp;
		}
		return choosen;
	}

	// 第三題：請設計一個方法名為 copyFile ，這個方法有兩個參數。呼叫此方法時，第一個
	// 參數所代表的檔案會複製到第二個參數代表的檔案
	public static void copyFile(String file1, String file2) throws Exception {
		File inputFile = new File(file1);
		File outputFile = new File(file2);
		FileReader in = new FileReader(inputFile);
		FileWriter out = new FileWriter(outputFile);
		int c;
		try {
			while ((c = in.read()) != -1) { // 讀到檔案的尾端時,read()會回傳-1
				out.write(c);
			}
		} catch (IOException e) {
		}
		in.close();
		out.close();
	}
}
