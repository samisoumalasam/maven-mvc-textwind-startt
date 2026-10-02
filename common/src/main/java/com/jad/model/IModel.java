package com.jad.model;

import com.jad.view.Screen;

import java.awt.*;

public interface IModel {

    void moveAll();

    void turnLeft();

    void turnRight();

    Screen getScreen();
}
