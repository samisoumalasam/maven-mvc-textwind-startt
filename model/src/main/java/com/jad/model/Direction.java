package com.jad.model;

public enum Direction {
    NORTH,
    EAST,
    SOUTH,
    WEST;

    static public Direction turnLeft(final Direction direc){
        return Direction.values()[(direc.ordinal() - 1 + Direction.values().length) % Direction.values().length];
    }

    static public Direction turnRight(final Direction direc){
        return Direction.values()[(direc.ordinal() + 1 + Direction.values().length) % Direction.values().length];
    }


}
