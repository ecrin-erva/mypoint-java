
package mypoint;

 
public class MyPoint {
    private double x;
    private double y;
    public MyPoint() {
        x = 0;
        y = 0;
    }
    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getter metotları
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // snesine uzaklıkBaşka bir MyPoint ne
    public double distance(MyPoint p) {
        return distance(p.x, p.y);
    }

  
    public double distance(double x, double y) {
        double dx = this.x - x;
        double dy = this.y - y;

        return Math.sqrt(dx * dx + dy * dy);
    }

   
    public static double distance(MyPoint p1, MyPoint p2) {
        return p1.distance(p2.x, p2.y);
    }

    
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(0, 0);
        MyPoint p2 = new MyPoint(10, 30.5);

        System.out.println("İki nokta arasındaki uzaklık: "
                + MyPoint.distance(p1, p2));
    }
}
 

