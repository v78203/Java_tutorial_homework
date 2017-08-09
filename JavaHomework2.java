package JavaHomework;
//姓名：曾紀綱 , Java回家作業第二回, 迴圈

public class JavaHomework2 {
	  public static void main(String[] args){
		//請設計一隻Java程式，計算1～1000的偶數和 (2+4+6+8+…+1000)
		  int sum=0;
		  for(int i=1; i<=1000; i++){
			  if (i %2==1){
				  sum = sum + i;
			  }
		  }
		  System.out.println("1.請設計一隻Java程式，計算1～1000的偶數和 (2+4+6+8+…+1000)");
		  System.out.println("ans: " + sum);
          
        //請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用for迴圈)
          int product=1;
          for (int i=1; i<=10; i++){
        	  product = product * i;
          }
          System.out.println("2.請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用for迴圈)");
          System.out.println("ans: " + product);
          
        //請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用while迴圈)
          product=1;
          int runningTime=1;
          while (runningTime<=10){
        	  product = product * runningTime;
        	  runningTime++;
          }
          System.out.println("3.請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用while迴圈)");
          System.out.println("ans: " + product);
          
        //請設計一隻Java程式，輸出結果為以下： 1 4 9 16 25 36 49 64 81 100
          System.out.println("4.請設計一隻Java程式，輸出結果為以下： 1 4 9 16 25 36 49 64 81 100");
          for (int i=1; i<=10; i++){
        	  System.out.print( i*i + "\t");
          }
          System.out.println();
          System.out.println();

        
        //阿文很熱衷大樂透 (1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，輸出結果為阿文可以選擇的數字有哪些？總共有幾個？
          int option=0;
          System.out.println("進階:阿文很熱衷大樂透 (1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，輸出結果為阿文可以選擇的數字有哪些？總共有幾個？");
          System.out.println("ANS: 可選擇的數字有:");
          for (int i=1; i<=4; i++){
        	for (int j=0; j<=9; j++){
        		if(i!=4 && j!=4){
        			System.out.print( i*10+j + " ");
        		option = option + 1;
        		}
        	}        	
        	System.out.println();
          }
          System.out.println("總共有"+ option + "個");
          System.out.println();
          
        //請設計一隻Java程式，輸出結果為以下：
          System.out.println("進階:請設計一隻Java程式，輸出結果為以下：");
          for (int i=10; i>=1; i--){
        	  for (int j=1; j<=i; j++){
        		  System.out.print( j+" " );
        	  }
        	  System.out.println();
          }
          System.out.println();
        
        //請設計一隻Java程式，輸出結果為以下：
          System.out.println("進階:請設計一隻Java程式，輸出結果為以下：");
          char letter = 'A';
          int change = (int)letter;
          for (int i =1; i<=6; i++){
        	  letter = (char)change;
        	  for (int j=1; j<=i; j++){
        		  System.out.print(letter);
        	  }
        	  change++;
        	  System.out.println();
          }
	  }
}
