package com.tazering.gui;

import javax.swing.*;
import java.awt.*;

public class SimpleWindow extends JFrame {

    JLabel helloLabel;
    JButton actionButton;
    JLabel infoLabel;
    FlowLayout layout;
    JPanel panel;

    public SimpleWindow() {
        helloLabel = new JLabel("Hello");
        actionButton = new JButton("action button");
        infoLabel = new JLabel("information");
        FlowLayout layout = new FlowLayout();
        panel = new JPanel(layout);
    }

    public static void main(String[] args) {
        // something to start the window
        WindowRunnable windowRunner = new WindowRunnable();
        javax.swing.SwingUtilities.invokeLater(windowRunner);
    }

    public static void createAndShowGUI() {
        SimpleWindow myWindow = new SimpleWindow();
        //tell swing to exit the program when the window is closed
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //add all our form elements to the window
        myWindow.addComponentsToPane(myWindow.getContentPane());

        //organize what will appear
        myWindow.pack();
        myWindow.setVisible(true);
    }

    public void addComponentsToPane(Container pane) {
        panel.add(infoLabel);
        panel.add(helloLabel);
        panel.add(actionButton);

        pane.add(panel);
    }

}

class WindowRunnable implements Runnable {

    @Override
    public void run() {
        SimpleWindow.createAndShowGUI();
    }
}
