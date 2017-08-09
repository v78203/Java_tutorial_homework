package JavaHomework;

public class myRectangle {
private double width;
private double depth;

public myRectangle(){}
public myRectangle(double width, double depth){
	this.width = width;
	this.depth = depth;
}
public double getWidth() {
	return width;
}
public void setWidth(double width) {
	this.width = width;
}
public double getDepth() {
	return depth;
}
public void setDepth(double depth) {
	this.depth = depth;
}

public double getArea(){
	return depth*width;
}


}
