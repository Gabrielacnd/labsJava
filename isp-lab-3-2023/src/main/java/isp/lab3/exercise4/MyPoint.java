package isp.lab3.exercise4;


public class MyPoint {
    private int x;
    private int y;
    private int z;

    MyPoint() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public int setX() {
        return x;
    }

    public int setY() {
        return y;
    }

    public int setZ() {
        return z;
    }

    public void setXYZ(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;

    }

    public String toString() {
        return "My point is: " + '(' + x + ',' + y + "," + z;
    }

    public double distance(int x, int y, int z) {
        int xd = x - this.x;
        int yd = y - this.y;
        int zd = z - this.z;
        return Math.sqrt(xd * xd + yd * yd + zd * zd);
    }

    public double distance(MyPoint p1) {
        int xd = p1.x - this.x;
        int yd = p1.y - this.y;
        int zd = p1.z - this.z;
        return Math.sqrt(xd * xd + yd * yd + zd * zd);
    }

    public static void main(String[] args) {
        MyPoint point1 = new MyPoint();
        MyPoint point2 = new MyPoint();
        point1.setXYZ(2, 2, 2);
        point2.setXYZ(1, -1, -3);
        System.out.println((int) point1.distance(point2));
        System.out.println((int) point1.distance(6, 7, 8));


    }

}
