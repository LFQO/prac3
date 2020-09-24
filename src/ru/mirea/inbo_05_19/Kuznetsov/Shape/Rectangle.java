package ru.mirea.inbo_05_19.Kuznetsov.Shape;

class Rectangle extends Shape {
    protected double width;
    protected double length;
    public Rectangle(){
        this.colour="undefined";
        this.filled=false;
        this.length=1;
        this.width=1;
    }
    public Rectangle(double width, double length){
        this.width=width;
        this.length=length;
        this.colour="undefined";
        this.filled=false;
    }
    public Rectangle(double width, double length, String colour, boolean filled){
        this.width=width;
        this.length=length;
        this.colour=colour;
        this.filled=filled;
    }
    public double getLength(){
        return length;
    }
    public double getWidth() {
        return width;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea(){
        return (length*width);
    }
    public double getPerimeter(){
        return((width+length)*2);
    }
    public String toString(){
        return("shape: rectangle | colour: "+this.colour+" | filled: "+this.filled+" | width: "+this.width+" | length: "+this.length);
    }
}
