package JavaHomework;

public class RandAvg {
	public int[] RandAvg(int number) {
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
}
