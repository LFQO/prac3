package ru.mirea.inbo_05_19.Kuznetsov.Shape;
import java.math.*;

class Circle extends Shape {
    protected double radius;
    public Circle(){
        this.colour="undefined";
        this.filled=false;
        this.radius=1;
    }
    public Circle(double radius){
        this.colour="undefined";
        this.filled=false;
        this.radius=radius;
    }
    public Circle(double radius, String colour, boolean filled){
        this.radius=radius;
        this.colour=colour;
        this.filled=filled;
    }
    public double getRadius() {
        return this.radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return (Math.PI*radius*radius);
    }
    public double getPerimeter(){
        return(Math.PI*radius*2);
    }
    public String toString(){
        return ("shape: circle | colour: "+this.colour+" | filled: "+this.filled+" | radius: "+this.radius);
    }
}
