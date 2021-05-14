package work5;

public class text1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Triangle triangle = new Triangle(1, 1.5, 1);
	    triangle.setColor("yellow");
	    triangle.setFilled(true);

	    //System.out.println(triangle);
	    System.out.println("The area is " + triangle.getArea());
	    System.out.println("The perimeter is "
	      + triangle.getPerior());
	    System.out.println(triangle);
		System.out.println(triangle.getClass());

		
	}

}
