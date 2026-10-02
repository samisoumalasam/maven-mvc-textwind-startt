package com.jad.model;

import javax.swing.text.Position;
import java.awt.*;

public final class Grid {
    private final Dimension dimension;
    private Tile[][] tiles;

    public boolean isObstacle(Point pos){
        return getTileAt(pos).getObstacle();
    }

    public Tile getTileAt(Point pos){
        final Point wrapPos = this.wrapPosition(pos);
        return tiles[wrapPos.y][wrapPos.x];
    }

    public Grid(Dimension dimension) {
        this.dimension = dimension;
        this.tiles = new Tile[dimension.height][dimension.width];
        for(int row = 0;row < dimension.height;row++){
            for(int column = 0; column<dimension.width; column++){
                this.tiles[row][column] = Tile.EMPTY;
            }
        }
    }


    public Point wrapPosition(Point pos){
        return new Point(pos.x % this.dimension.width, pos.y% this.dimension.height);
    }

    public void setTileAt(Tile tile, Point pos){
        final Point wrapPos = this.wrapPosition(pos);
        tiles[wrapPos.y][wrapPos.x] = tile;
    }
}
