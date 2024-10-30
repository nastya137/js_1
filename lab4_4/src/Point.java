public class Point {
    private int x;
    private int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Point() {
        this.x = 0;
        this.y = 0;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
    public int distanceFromOrigin() {
        return (int) Math.sqrt((double)(Math.abs((double)Math.pow(this.x, 2) + (double)Math.pow(this.y, 2))));
    }
    public boolean isInRectangle(Point top_left, Point bottom_right) {
        return (top_left.getX() <= this.x) && (this.x <= bottom_right.getX()) && (top_left.getY() <= this.y) && (this.y <= bottom_right.getY());
    }
    public boolean isInCircle(Point center, int radius) {
        return Math.pow(radius, 2) <= (Math.abs((double) Math.pow((this.x - center.x), 2) + (double) Math.pow((this.y - center.y), 2)));
    }
    public int vectorLength() {
        return (int) Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }
}
