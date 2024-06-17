package com.tazering.gui.practice;

import javax.swing.*;
import java.awt.*;

public class SimpleWindowPractice extends JFrame {

    JLabel instructionLabel;
    JTextField textField;
    JLabel resultLabel;
    JButton actionButton;
    JPanel panel;

    public SimpleWindowPractice() {
        instructionLabel = new JLabel("This is the instruction label");
        textField = new JTextField(40);
        resultLabel = new JLabel("Result...");
        actionButton = new JButton("Action Button");
        panel = new JPanel(new FlowLayout(FlowLayout.LEADING));
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            SimpleWindowPractice.createAndShowGUI();
        });
    }

    public static void createAndShowGUI() {
        SimpleWindowPractice frame = new SimpleWindowPractice();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addComponentsToPane(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    public void addComponentsToPane(Container pane) {
        panel.add(instructionLabel);
        panel.add(textField);
        panel.add(resultLabel);
        panel.add(actionButton);

        pane.add(panel);
    }




}
