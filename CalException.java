package JavaHomework;

public class CalException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CalException() {

	}

	public CalException(String msg) {
		super(msg);
	}
}

class Cal {
	private double x;
	private double y;

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public Cal(double x, double y) throws CalException {
		if (x == 0 && y == 0) {
			throw new CalException("0的0次方沒有意義!");
		} else if (y < 0) {
			throw new CalException("次方為負值，結果回傳不為整數！");
		} else {
			this.x = x;
			this.y = y;
		}
	}

}
