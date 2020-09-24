package ru.mirea.inbo_05_19.Kuznetsov.Shape;

class Square extends Rectangle{
    public Square(){
        this.width=1;
        this.length=1;
        this.colour="undefined";
        this.filled=false;
    }
    public Square(double side){
        this.width=side;
        this.length=side;
        this.colour="undefined";
        this.filled=false;
    }
    Square(double side, String colour, boolean filled){
        this.width=side;
        this.length=side;
        this.colour=colour;
        this.filled=filled;
    }
    public double getSide(){
        return this.width;
    }
    public void setSide(double side){
        this.width=side;
        this.length=side;
    }
    public void setWidth(double width) {
        this.width=width;
    }
    public void setLength(double length) {
        this.length=length;
    }
    public String toString(){
        return("shape: square | colour: "+this.colour+" | filled: "+this.filled+" | side: "+this.width);
    }
}
