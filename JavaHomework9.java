package JavaHomework;

public class JavaHomework9 extends Thread {

	public static void main(String args[]) throws InterruptedException {
		// 第一題
		// 開啓 2 個執行緒模擬饅頭人與詹姆士參加快胃王比
		// 賽所做的競賽過程。 每個動作都以 Thread.sleep() 暫停一下 ,
		// 以達到顯示效果。 Sleep時間由亂數產生 500 ～ 3000 之間的毫秒數
		// 參考CounterRunnable.java

		System.out.println("大胃王快食比賽開始");

		Race rc[] = new Race[] { new Race("鰻頭人"), new Race("詹姆士") };
		for (int i = 0; i < rc.length; i++) {
			rc[i].start();
		}
		Race.ready = true;
		rc[0].join();
		rc[1].join();
		// 第二題
		// 熊大在念大學 , 生活費倚靠媽媽。媽媽怕熊大一天到晚領錢亂花 , 不
		// 好好唸書 , 所以只要看到熊大帳戶 的餘額在 2000 元以上 , 就會停止匯
		// 款給熊大 ; 但要是帳戶餘額在 1000 元以下 , 熊大就會要求媽媽匯款給
		// 他。如果帳戶餘額低於熊大要提款 的金額 , 熊大就會暫停提款 , 直到媽
		// 媽告知他錢已經入帳戶。假設媽媽 一次匯款 2000 元 , 熊大一次提款
		// 1000 元 , 寫一個 Java 程式模擬匯款 10 次與提款 10 次的情形。
		System.out.println();
		Account account = new Account();
		Mom mom = new Mom(account);
		Son son = new Son(account);
		mom.start();
		son.start();
	}
}

class Race extends Thread {
	int count = 1;
	public static boolean ready = false;

	public Race(String name) {
		super(name);
	}

	public void run() {
		while (!ready) {
		}
		System.out.println(getName() + "準備好了！");
		while (count <= 10) {
			System.out.println(getName() + "吃第" + count + "碗飯！");
			if (count == 10) {
				System.out.println(getName() + "吃完了！");
			}
			count++;
			try {
				int ran = (int) (Math.random() * 2500) + 500;
				Thread.sleep(ran);
			} catch (Exception e) {
			}
		}
	}
}

class Account {
	private int money = 0; // 帳戶餘額

	synchronized public void save(int save) {
		while (money > 2000) {
			System.out.println("媽媽看到餘額在2000以上，暫停匯款");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		money += save;
		System.out.println("媽媽存了" + save + "，帳戶共有：" + money);
		notify();
	}

	synchronized public void spend(int spend) {
		while (money < spend) {
			System.out.println("熊大領不出錢");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		money -= spend;
		System.out.println("熊大領了" + spend + "，帳戶共有：" + money);
		if (money < 1000) {
			System.out.println("熊大看到餘額在1000以下，要求匯款");
			notify();
		}
	}
}

class Mom extends Thread{
	Account account;
	public Mom(Account account){
		this.account = account;
	}
	public void run(){
		for(int i=1; i<=10; i++)
			account.save(2000);
	}
}

class Son extends Thread{
	Account account;
	public Son(Account account){
		this.account = account;
	}
	public void run(){
		for(int i=1; i<=10; i++)
			account.spend(1000);
	}
}