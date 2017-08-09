package JavaHomework;

import java.io.Serializable;

public class Dog implements Serializable, Pet {
	private static final long serialVersionUID = 234567890L;
	private String name;
	
	public Dog(String name) {
		this.name = name;
	}
	
	public void speak() {
		System.out.println("This is Dog " + name + " speaking.");
	}
}
