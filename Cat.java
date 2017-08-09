package JavaHomework;
import java.io.Serializable;

public class Cat implements Serializable, Pet  {
	private static final long serialVersionUID = 123456789L;
	private String name;
	
	public Cat(String name) {
		this.name = name;
	}
	
	public void speak() {
		System.out.println("This is Cat " + name + " speaking!");
	}
	
}

