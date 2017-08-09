package JavaHomework;
import java.util.Scanner;
public class JavaHomework3_2 {
		public static void main(String[] args){
		
		Scanner Guess1 = new Scanner(System.in);
		int number = (int)(Math.random()*10);
		System.out.println("開始猜數字吧！");
		int guess1 = Guess1.nextInt();

		while (guess1 != number){
			System.out.println("猜錯囉");
			guess1 = Guess1.nextInt();
		}System.out.println("猜對了！答案就是"+ number);
		

		Scanner Guess2 = new Scanner(System.in);
		int numberPlus = (int)(Math.random()*100);
		System.out.println("開始猜數字吧！(進階版)");
		int guess2 = Guess2.nextInt();
				
		while (guess2 != numberPlus){
			if (guess2 > numberPlus)
				System.out.println("猜錯囉，答案比你猜的小");
			else
				System.out.println("猜錯囉，答案比你猜的大");
			guess2 = Guess2.nextInt();
		}
			
		System.out.println("猜對了！答案就是"+ numberPlus);
		Guess1.close();
		Guess2.close();
	}
	
}