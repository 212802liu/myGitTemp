package work4;

public class Circle2D {
    double x,y;
    double radius;
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getRadius() {
        return radius;
    }

    public Circle2D() {     //无参构造
        x=0;
        y=0;
        radius=1;
    }

    public Circle2D(double x, double y, double r) {
        this.x = x;
        this.y=y;
        this.radius=r;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public  double getPerimeter(){
        return 2*Math.PI*radius;
    }
    public boolean contains(double x, double y){
        if(( (x-this.x)*(x-this.x)+(y-this.y)*(y-this.y))<radius*radius){
            return true;
        }
        else return false;
    }
    public boolean overlaps(Circle2D circle){
        if(Math.sqrt(Math.pow((this.x-circle.x), 2)+Math.pow((this.y-y), 2))>this.radius+circle.radius)
            return false;
        else return true;
    }
    public boolean contains(Circle2D circle) {
        // TODO Auto-generated method stub
        if(this.radius>circle.radius){
            if(Math.sqrt(Math.abs(Math.pow((this.x-circle.x), 2)+Math.pow((this.y-y), 2)))<this.radius-circle.radius)
                return true;
            else return false;
        }
        else{
            if(Math.sqrt(Math.abs(Math.pow((this.x-circle.x), 2)+Math.pow((this.y-y), 2)))<-this.radius+circle.radius)
                return true;
            else return false;
        }

    }
}

