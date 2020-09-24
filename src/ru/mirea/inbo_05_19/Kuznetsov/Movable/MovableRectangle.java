package ru.mirea.inbo_05_19.Kuznetsov.Movable;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;
    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight =new MovablePoint(x2, y2, xSpeed, ySpeed);
    }
    public String toString(){
        return ("topLeft | x: "+topLeft.x+" | y: "+topLeft.y+" | xSpeed: "+topLeft.xSpeed+" | ySpeed: "+topLeft.ySpeed+"\n"+
                "bottomRight | x: "+bottomRight.x+" | y: "+bottomRight.y+" | xSpeed: "+bottomRight.xSpeed+" | ySpeed: "+bottomRight.ySpeed);
    }
    public boolean checkSpeed(){
        if (topLeft.xSpeed==bottomRight.xSpeed&topLeft.ySpeed== bottomRight.ySpeed) return true;
        else return false;
    }
    public void moveUp(){
        if(this.checkSpeed()==true) {
            topLeft.y+=topLeft.ySpeed;
            bottomRight.y+= bottomRight.ySpeed;
        }
        else System.out.println("ySpeed is different");
    }
    public void moveDown(){
        if(this.checkSpeed()==true) {
            topLeft.y-=topLeft.ySpeed;
            bottomRight.y-= bottomRight.ySpeed;
        }
        else System.out.println("ySpeed is different");
    }
    public void moveLeft(){
        if(this.checkSpeed()==true) {
            topLeft.x-=topLeft.xSpeed;
            bottomRight.x-= bottomRight.xSpeed;
        }
        else System.out.println("xSpeed is different");
    }
    public void moveRight(){
        if(this.checkSpeed()==true) {
            topLeft.x+=topLeft.xSpeed;
            bottomRight.x+= bottomRight.xSpeed;
        }
        else System.out.println("xSpeed is different");
    }
    public static void main(String args[]){
        MovableRectangle ob = new MovableRectangle(0,3,2,0,4,2);
        System.out.println(ob.toString());
        ob.moveRight();
        ob.moveUp();
        System.out.println(ob.toString());
    }
}
