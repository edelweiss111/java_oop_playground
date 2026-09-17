package models;

public final class Point3D extends Point2D{
    
    private int z;

    public Point3D(int x, int y, int z){
        super(x, y);
        this.z = z;
    }

    public int getZ() { return this.z; }

    public void setZ(int z) { this.z = z; }

    @Override
    public String toString() {
        return "{%d;%d;%d}".formatted(super.getX(), super.getY(), z);
    }
}
