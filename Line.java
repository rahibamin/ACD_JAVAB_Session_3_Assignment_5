package Session3.assignment5.Line;

public class Line {
	public Line(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	private Point p1, p2;

	public Point getP1() {
		return p1;
	}

	public void setP1(Point p1) {
		this.p1 = p1;
	}

	public Point getP2() {
		return p2;
	}

	public void setP2(Point p2) {
		this.p2 = p2;
	}
	
	public void display(){
		System.out.println("A line from Point " + p1.display() + " to " + p2.display());
	}
}
