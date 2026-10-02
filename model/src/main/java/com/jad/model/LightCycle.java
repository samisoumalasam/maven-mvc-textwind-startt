package com.jad.model;

import java.awt.*;

public class LightCycle {
    private Point position;
    private Direction direction;
    private final Grid grid;


    public Point getPosition() {
        return position;
    }

    public Direction getDirection(){
        return this.direction;
    }

    public void turnRight(){
        this.direction= Direction.turnRight(this.direction);
    }

    public void turnLeft(){
        this.direction = Direction.turnLeft(this.direction);
    }

    public void moveForward(){
        return; //TODO
    }

    public LightCycle(Point posi, Direction direc, Grid grid){
        this.position = posi;
        this.direction = direc;
        this.grid = grid;
    }
}
