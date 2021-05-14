package work5;

public class GeometricObject {
    public String color;
    public boolean filled;
	public GeometricObject(String color, boolean filled) {
		super();
		this.color = color;
		this.filled = filled;
	}
	public GeometricObject() {
		super();
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public String toString() {
		return "GeometricObject [color=" + color + ", filled=" + filled + "]";
	}
    
}
