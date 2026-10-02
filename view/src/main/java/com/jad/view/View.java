package com.jad.view;

import com.jad.controller.IController;
import com.jad.model.IModel;
import com.jad.textwindow.TextWindow;
import com.jad.textwindow.TextWindowSettings;

import java.awt.*;

public class View implements IView {
    private final IModel model;
    private IController controller;
    private TextWindow textWindow;

    public View(final IModel model) {
        this.model = model;
        TextWindowSettings textWindowSettings = new TextWindowSettings();
        textWindowSettings.setScreenHeight(40);
        textWindowSettings.setScreenWidth(80);
        textWindowSettings.setTitle("tron");
        textWindowSettings.setFontSize(12f);
        textWindowSettings.setBackgroundColor(Color.BLACK);

        this.textWindow = new TextWindow(textWindowSettings);
        textWindow.setForeground(Color.WHITE);
        this.textWindow.setVisible(true);

    }

    @Override
    public void setController(final IController controller) {
        this.controller = controller;
    }

    @Override
    public void displayMessage(String message){
        this.textWindow.display(message);
    }


    @Override
    public void displayScreen(){
        StringBuilder screenStr = new StringBuilder();
        final Screen screen = this.model.getScreen();
        for(int row = 0;row < screen.dimension().height;row++){
            for(int column = 0; column<screen.dimension().width; column++){
                screenStr.append(screen.sprite()[row][column].ASCII());
            }
            screenStr.append("\n");
        }
        this.textWindow.display(screenStr.toString());
    }
}
