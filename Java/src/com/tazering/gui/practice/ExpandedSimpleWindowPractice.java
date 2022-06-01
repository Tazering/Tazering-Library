package com.tazering.gui.practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExpandedSimpleWindowPractice extends JFrame {

    private JPanel mainPanel;
    private JLabel instructionLabel;
    private JLabel resultLabel;
    private JButton actionButton;
    private JTextField textField;
    private FlowLayout flowLayout;
    private JPanel panel0;
    private JPanel panel1;


    public ExpandedSimpleWindowPractice() {
        flowLayout = new FlowLayout(FlowLayout.LEADING);
        mainPanel = new JPanel();
        panel0 = new JPanel();
        panel1 = new JPanel();
        instructionLabel = new JLabel("Type your Value in the Text Field:");
        resultLabel = new JLabel("Your results will show here");
        actionButton = new JButton();
        textField = new JTextField();
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    public static void createAndShowGUI() {
        ExpandedSimpleWindowPractice frame = new ExpandedSimpleWindowPractice();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addComponentsToPane(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);

    }

    public void addComponentsToPane(Container pane) {
        textField.setColumns(20);
        actionButton.setText("Compute");

        panel0.setLayout(flowLayout);
        panel0.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

        actionButton.setActionCommand("compute");

        actionButton.addActionListener((ActionEvent e) -> {
            if(e.getActionCommand().equals("compute")) {
                resultLabel.setText(String.valueOf(Double.parseDouble(textField.getText()) / 1.609344));
            }
            pack();
        });

        panel0.add(instructionLabel);
        panel0.add(actionButton);
        panel1.add(textField);
        panel1.add(resultLabel);

        mainPanel.add(panel0);
        mainPanel.add(panel1);

        pane.add(mainPanel);
    }

}
