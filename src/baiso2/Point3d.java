package baiso2;

public class Point3d extends Point2D{
    private float z;

    public Point3d() {
    }

    public Point3d(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        super.setXY(x,y);
        this.z=z;
    }
    public float[] getXYZ(){
        float[] arr2={super.getX(),super.getY(),z};
        return arr2;
    }

    @Override
    public String toString() {
        return "Point3d{" +
                "x=" + super.getX() +
                ", y=" + super.getY() +
                "z=" + z +
                '}';
    }
}

