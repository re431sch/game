package de.programmierenlernenhq.panzerhq;

public abstract class GameObject {

    private Coordinate objectPosition;
    private double width;
    private double height;
    private double movingAngle;
    private double movingDistance;
    
    public GameObject(Coordinate objectPosition, double width, double height) {
        this.objectPosition = objectPosition;
        this.width = width;
        this.height = height;
        this.movingAngle = 0;
        this.movingDistance = 0;
    }
    
    public Coordinate getObjectPosition() {
        return this.objectPosition;
    }
    
    public void setObjectPosition(Coordinate objectPosition) {
        this.objectPosition = objectPosition;
    }
    
    public double getWidth() {
        return this.width;
    }
    
    public void setWidth(double width) {
        this.width = width;
    }
    
    public double getHeight() {
        return this.height;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    
    public double getMovingAngle() {
        return this.movingAngle;
    }
    
    public void setMovingAngle(double movingAngle) {
        this.movingAngle = movingAngle;
    }
    
    public double getMovingDistance() {
        return movingDistance;
    }

    public void setMovingDistance(double movingDistance) {
        this.movingDistance = movingDistance;
    }
    
    public boolean isLeftOf(GameObject that) {
        return this.getObjectPosition().getX() + this.getWidth() < that.getObjectPosition().getX();
    }
    
    public boolean isAbove(GameObject that) {
        return this.getObjectPosition().getY() + this.getHeight() < that.getObjectPosition().getY();
    }
    
}
