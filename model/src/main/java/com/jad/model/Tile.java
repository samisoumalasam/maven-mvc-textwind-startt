package com.jad.model;

import com.jad.view.Sprite;

public enum Tile {
    WALL(true, new Sprite('X')),
    EMPTY(false, new Sprite('•'))
    ;
    private final boolean obstacle;
    private final Sprite sprite;


    public boolean getObstacle(){
        return this.obstacle;
    }

    Tile(boolean obstacle, Sprite sprite) {
        this.obstacle = obstacle;
        this.sprite = sprite;
    }

    public Sprite getSprite() {
        return sprite;
    }
}
