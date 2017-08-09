package JavaHomework;
//姓名：曾紀綱 , Java回家作業第一回, 定數、變數、運算子

public class JavaHomework1 {
	  public static void main(String[] args){
		  //請設計一隻Java程式，計算12，6這兩個數值的和與積
		  System.out.println("1.請設計一隻Java程式，計算12，6這兩個數值的和與積");
		  int q1i1 = 12, q1i2 = 6;
		  int sum = q1i1 + q1i2;
		  int product = q1i1 * q1i2;
		  System.out.println("ANS:");
		  System.out.println("和為"+sum);
		  System.out.println("積為"+product);
		  
		  //請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆)
		  System.out.println("2.請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆)");
		  int q2i1 = 200;
		  int dozen = q2i1/12 ;
		  int rest = q2i1%12 ;
		  System.out.println("ANS:");
		  System.out.println("總共為"+dozen+"打"+rest+"顆");

		  //請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		  System.out.println("3.請由程式算出256559秒為多少天、多少小時、多少分與多少秒");
		  int q3i1 = 256559 ; 
		  int min = q3i1/60 , secrest = q3i1%60 ;
		  int hour = min/60 , minrest = min%60 ;
		  int day = hour%24 , hourrest = hour%24 ;
		  System.out.println("ANS:");
		  System.out.println("總共為" + day + "天" + hourrest + "小時" + minrest + "分鐘" + secrest + "秒");
		  
		  //請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
		  System.out.println("4.請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長");
		  final float pi = 3.1415f, r=5 ;
		  float diameter = 2*pi*r ;
		  float area = pi*r*r ;
		  System.out.println("ANS:");
		  System.out.println("直徑為"+diameter);
		  System.out.println("面積為"+area);
		  
		  //某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，
		  //請用程式計算10年後，本金加利息共有多少錢
		  System.out.println("5.某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本金加利息共有多少錢");
		  int initial = 1500000 , year = 10;
		  float interest = 0.02f ;
		  double q5d1 = Math.pow((1+interest),year);
		  double finalProperty = initial * q5d1;
		  System.out.println("ANS:");
		  System.out.println("最後共有"+finalProperty+"元");
		  
		  //請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
		  //5 + 5
		  //5 + „5‟
		  //5 + “5”
		  System.out.println("6.請寫一隻程式，利用System.out.println()印出以下三個運算式結果：");
		  System.out.println("5 + 5");
		  System.out.println("5 + '5'");
		  System.out.println("5 + ''5''");
		  System.out.println("ANS:");
		  System.out.println(5 + 5);
		  System.out.println(5 + '5');
		  System.out.println(5 + "5");
		  //5+5為"整數+整數"，故會計算其數學上的值
		  //5+'5'為"整數+字元"對照unicode 5編碼為53，故其計算結果為58
		  //5+"5"為"整數+字串"依格式其顯示會把數字與字串併排，故為55
	  }
}
