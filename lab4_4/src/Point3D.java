public class Point3D extends Point{
    private int z;
    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
    public Point3D() {
        super();
        this.z = 0;
    }
    public int getZ() {
        return z;
    }
    public void setLocation(int x, int y, int z) {
        super.setLocation(x, y);
        this.z = z;
    }
    public void setLocation(int x, int y) {
        super.setLocation(x, y);
        this.z = 0;
    }
    public String toString() {
        return "("+super.getX()+", "+super.getY()+", "+z+")";
    }
    public int distanceFromOrigin() {
        return (int) Math.sqrt((double)(Math.abs((double)Math.pow(super.getX(), 2) + (double)Math.pow(super.getY(), 2))+ (double)Math.pow(this.z, 2)));
    }
    public boolean isInBox(Point3D corner1, Point3D corner2) {
        return (corner1.getX() <= super.getX()) && (super.getX() <= corner2.getX()) && (corner1.getY() <= super.getY()) && (super.getY() <= corner2.getY())&&(corner1.getZ() <= this.z)&&(corner2.getZ() >= this.z);
    }
    public boolean isInSphere(Point3D center, int radius) {
        return Math.pow(radius, 2) <= (Math.abs((double) Math.pow((super.getX() - center.getX()), 2) + (double) Math.pow((super.getY() - center.getY()), 2)+(double) Math.pow((this.z - center.getZ()), 2)));
    }
    public int vectorLength() {
        return (int) Math.sqrt(Math.pow(super.getX(), 2) + Math.pow(super.getY(), 2) + Math.pow(this.z, 2));
    }
}
