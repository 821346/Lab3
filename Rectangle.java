
public class Rectangle {
	//default constructor x, y, height, width
	//x and y coordinates correspond to top left corner
	//set/get methods for all four values
	//override toString method
	private double x;
	private double y;
	private double height;
	private double width;
	public double area;
	public Rectangle() {
	}
	public Rectangle(double x2, double y2, double h1, double w1) {
		setX(x2);
		setY(y2);
		setHeight(h1);
		setWidth(w1);
		area=h1*w1;
		
	}
	
	public boolean setX(double x1) {
		x=x1;
		return true;
	}
	public boolean setY(double y1) {
		y=y1;
		return true;
	}
	public boolean setHeight(double h) {
		if(h>=0) {
			height=h;
			return true;
		}
		else
			return false;
	}
	public boolean setWidth(double w) {
		if(w>=0) {
			width=w;
			return true;
		}
		else
			return false;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public double getWidth(){
		return width;
	}
	public double getHeight() {
		return height;
	}
	public String toString() {
		return "Rectangle [x=" + x +", y=" +y +", height=" +height +", width="+ width + "] Area is " +area;
	}
	}


