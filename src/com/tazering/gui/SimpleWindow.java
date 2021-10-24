package com.tazering.gui;

import javax.swing.*;
import java.awt.*;

public class SimpleWindow extends JFrame {

    JPanel jPanel0;
    JPanel jPanel1;
    JLabel jLabel0;
    JLabel jLabel1;

    public static void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater(() -> {
            SimpleWindow.createAndShowGui();
        });

    }

    public SimpleWindow() {
        jPanel0 = new JPanel(new BorderLayout());
        jLabel0 = new JLabel("This is for jLabel0");


        jPanel1 = new JPanel();

        jLabel1 = new JLabel("This is for jLabel1");
    }

    public static void createAndShowGui() {
        //create a new instance of this class
        SimpleWindow simpleWindow = new SimpleWindow();

        //what happens when you press the x
        simpleWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //add the components to the pane/canvas
        simpleWindow.addComponentToPane(simpleWindow.getContentPane());

        //pack/make everything together
        simpleWindow.pack();
        simpleWindow.setVisible(true);

    }

    public void addComponentToPane(Container pane) {
        jPanel0.add(jLabel0, BorderLayout.SOUTH);

        pane.add(jPanel0);



    }


}
