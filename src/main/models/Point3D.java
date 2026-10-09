package models;

import java.util.Objects;

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
  
    @Override 
    public int hashCode(){
        return Objects.hash(super.getX(), super.getY(), z);
    }

    @Override
    public boolean equals(Object obj){
        if (obj == this) return true;
        if (obj == null || obj.getClass() != getClass()) return false;
        Point3D point = (Point3D) obj;
        if (point.getX() != super.getX() || point.getY() != super.getY() || point.getZ() != z) return false;
        return true;
    }

    @Override
    public Point3D clone() throws CloneNotSupportedException{
        return (Point3D) super.clone();
    }
}
