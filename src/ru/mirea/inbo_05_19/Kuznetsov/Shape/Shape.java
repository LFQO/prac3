package ru.mirea.inbo_05_19.Kuznetsov.Shape;

public abstract class Shape {
    protected String colour;
    protected boolean filled;
    public Shape(){
        this.colour="undefined";
        this.filled=false;
    }
    public Shape(String colour,boolean filled){
        this.colour=colour;
        this.filled=filled;
    }
    public String getColour(){
        return this.colour;
    }
    public void setColour(String colour){
        this.colour=colour;
    }
    public boolean isFilled(){
        return this.filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    abstract double getArea();
    abstract double getPerimeter();
    public String toString(){
        return ("shape: undefined | colour: "+this.colour+" | filled: "+this.filled);
    }
}
