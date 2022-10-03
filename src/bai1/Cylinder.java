package bai1;

import bai1.Circle;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
     return super.getRadius()*this.height;
    }

    @Override
    public String toString() {
        return super.toString() + ", height is :"+getHeight()+ ", Volume: "+getVolume();
    }
}
