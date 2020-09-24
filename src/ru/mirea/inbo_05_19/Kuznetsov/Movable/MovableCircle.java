package ru.mirea.inbo_05_19.Kuznetsov.Movable;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;
    public MovableCircle(int x,int y, int xSpeed, int ySpeed, int radius){
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius=radius;
    }
    public String toString(){
        return ("MovablePoint | x: "+center.x+" | y: "+center.y+" | xSpeed: "+center.xSpeed+" | ySpeed: "+center.ySpeed+" | radius: "+this.radius);
    }
    public void moveUp(){
        center.y+=center.ySpeed;
    }
    public void moveDown(){
        center.y-=center.ySpeed;
    }
    public void moveLeft(){
        center.x-=center.xSpeed;
    }
    public void moveRight(){
        center.x+=center.xSpeed;
    }
    public static void main(String args[]){
        MovableCircle ob = new MovableCircle(0,0,2,3,4);
        System.out.println(ob.toString());
        ob.moveRight();
        ob.moveUp();
        System.out.println(ob.toString());
    }
}
