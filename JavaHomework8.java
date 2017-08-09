package JavaHomework;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class JavaHomework8 {
	public static void main(String args[]) {
		// 第一題
		// 請建立一個 Collection 物件並將以下資料加入：
		// - new Integer(100)
		// - new Double(3.14)
		// - new Long(21L)
		// - new Short(“100”)
		// - new Double(5.1)
		// - “Kitty”
		// - new Integer(100)
		// - new Object()
		// - “Snoopy”
		// - new BigInteger(“1000”)
		// 印出這個物件裡的所有元素 ( 使用 Iterator, 傳統 for 與增強 for)
		// 移除不是 java.lang.Number 家族的物件
		// 再次印出這個集合物件的所有元素，觀察是否已將非 Number 家族的物件移除成功
		//
		List<Object> list1 = new ArrayList<Object>();
		list1.add(new Integer(100));
		list1.add(new Double(3.14));
		list1.add(new Long(21L));
		list1.add(new Short("100"));
		list1.add(new Double(5.1));
		list1.add("Kitty");
		list1.add(new Integer(100));
		list1.add(new Object());
		list1.add("Snoopy");
		list1.add(new BigInteger("1000"));

		System.out.println("Iterator方法取值");
		Iterator<Object> obj1 = list1.iterator();
		while (obj1.hasNext())
			System.out.println(obj1.next());

		System.out.println();
		System.out.println("傳統for迴圈方法取值");
		for (int i = 0; i < list1.size(); i++) {
			Object obj2 = list1.get(i);
			System.out.println(obj2);
		}
		System.out.println();
		System.out.println("增強型for迴圈取值");
		for (Object obj3 : list1)
			System.out.println(obj3);

		System.out.println();

		System.out.println();
		for (int i = 0; i < list1.size(); i++) {
			if (list1.get(i) instanceof Number) {
			} else {
				list1.remove(list1.get(i));
				i--;
			}
		}
		System.out.println("移除非Number家族後顯示於螢幕");
		for (Object obj4 : list1)
			System.out.println(obj4);

		System.out.println();

		// 第二題
		// 請設計一個 Train 類別，並包含以下屬性 (在此檔案下方)
		// 設計對應的 getter/setter 方法，
		// 並透過建構子產生以下 7 個 Train 的物件，放到每小題需使用的集合裡
		List<Train> list2 = new ArrayList<Train>();
		list2.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		list2.add(new Train(1254, "區間", "屏東", "基隆", 700));
		list2.add(new Train(118, "自強", "高雄", "台北", 500));
		list2.add(new Train(1288, "區間", "新竹", "基隆", 400));
		list2.add(new Train(122, "自強", "台中", "花蓮", 600));
		list2.add(new Train(1222, "區間", "樹林", "七堵", 300));
		list2.add(new Train(1254, "區間", "屏東", "基隆", 700));

		// 第三題/第四題
		// 請寫一隻程式，能讓台鐵安排車次的人員取得不會重覆的 Train 物件
		// ( 請分別用 Iterator 與 for 迴圈取值 )
		// 承上， Train 物件不會重覆之外，還能讓班次編號由大排到小列出

		getTrain(list2, "useTreeSet"); // 可選擇用useHashSet(不排序)迴圈或是useTreeSet(排序)

		// 第五題
		// 因為因應年假人潮，台鐵想要再加開一個車次(116, “自強”, “高雄”, “台北”,
		// 500) 在原本 7 個車次的後面，請問該如何設計程式碼

		list2.add(new Train(116, "自強", "高雄", "台北", 500));

		// 第六題: 可以以for/Iterator取值都可
		getTrain(list2, "useTreeSet");

	}

	public static void getTrain(List<Train> list, String way) {
		if (way.equals("useHashSet")) {
			Set<Train> set = new HashSet<Train>();
			for (int i = 0; i < list.size(); i++) {
				set.add(list.get(i));
			}
			Iterator<Train> objs = set.iterator();
			while (objs.hasNext()) {
				Train ooo = objs.next();
				System.out.println(ooo.getNumber() + "," + ooo.getType() + "," + ooo.getStart() + "," + ooo.getDest()
						+ "," + ooo.getPrice());
			}
			// System.out.println();
			// for (Object kkk: set){
			// Train ooo = (Train) kkk;
			// System.out.println(ooo.getNumber() + "," + ooo.getType() + "," +
			// ooo.getStart() + "," + ooo.getDest()
			// + "," + ooo.getPrice());
			// }
			System.out.println();
		} else if (way.endsWith("useTreeSet")) {
			Set<Train> set = new TreeSet<Train>();
			for (int i = 0; i < list.size(); i++) {
				set.add(list.get(i));
			}
			Iterator<Train> objs = set.iterator();
			while (objs.hasNext()) {
				Train ooo = objs.next();
				System.out.println(ooo.getNumber() + "," + ooo.getType() + "," + ooo.getStart() + "," + ooo.getDest()
						+ "," + ooo.getPrice());
			}

			// System.out.println();
			// for (Object kkk: set){
			// Train ooo = (Train) kkk;
			// System.out.println(ooo.getNumber() + "," + ooo.getType() + "," +
			// ooo.getStart() + "," + ooo.getDest()
			// + "," + ooo.getPrice());
			// }
			System.out.println();
		}
	}
}

class Train implements Comparable<Train> {
	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;

	public Train(int number, String type, String start, String dest, double price) {
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getDest() {
		return dest;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	// HashSet改寫
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + number;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		if (number != other.number)
			return false;
		return true;
	}

	// TreeSet 改寫
	@Override
	public int compareTo(Train o) {
		if (this.number > o.number) {
			return -1;
		} else if (this.number == o.number) {
			return 0;
		} else {
			return 1;
		}

	}
}
