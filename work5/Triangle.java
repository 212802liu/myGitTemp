package work5;

public class Triangle extends GeometricObject {

	double side1;
    double side2;
    double side3;
    

	public Triangle(double side1, double side2, double side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	public Triangle(){

		this.side1=1.0;
		this.side2=1.0;
		this.side3=1.0;



	}
	public double getPerior(){
    	return side1+side2+side3;
    }
    public double getArea(){
		double p=this.getPerior()/2;
    	return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
    }
	public String toString() {
		return super.toString()+"\nTriangle [side1=" + side1 + ", side2=" + side2 + ", side3="
		+ side3 +"]";
		/*return "Triangle [side1=" + side1 + ", side2=" + side2 + ", side3="
				+ side3 + ", color=" + color + ", filled=" + filled+"]"
				;*/
	}
   
}
