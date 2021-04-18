import static java.lang.Math.*;

public class Point3d {
    private double x;
    private double y;
    private double z;

    public Point3d(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Point3d() {
        x=0.0;
        y=0.0;
        z=0.0;
    }
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public boolean isEqual(Point3d t) {
        if ((this.x == t.getX()) && (this.y == t.getY())&&(this.z == t.getZ())) {
            return true;
        }
        return false;
    }
    public double distanceTo(Point3d t) {
        return round((sqrt(pow(t.getX() - this.x, 2) + pow(t.getY() - this.y, 2) + pow(t.getZ() - this.z, 2)))*100)/100;
    }
}
