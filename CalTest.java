package JavaHomework;
import java.util.Scanner;

public class CalTest {
	public static void main(String args[]) throws Exception {
		Scanner input = new Scanner(System.in);
		double x, y;
		try {
			System.out.println("請輸入x的值：");
			x = input.nextFloat();
			System.out.println("請輸入y的值：");
			y = input.nextFloat();
			Cal vari = new Cal(x, y);
			double result = Math.pow(vari.getX(), vari.getY());
			System.out.println(x + "的" + y + "次方等於" + result);
		} catch (CalException ce) {
			System.out.println(ce.getMessage());
		} catch (java.util.InputMismatchException i) {
			System.out.println("輸入格式不正確");
		}
		input.close();
	}
}
