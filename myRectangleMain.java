package JavaHomework;

public class myRectangleMain {
public static void main(String args[]){
	myRectangle myRectangle1 = new myRectangle();
	myRectangle1.setWidth(10);
	myRectangle1.setDepth(20);
	System.out.println(myRectangle1.getArea());
	myRectangle myRectangle2 = new myRectangle(10,20);
	System.out.println(myRectangle2.getArea());
}
}
