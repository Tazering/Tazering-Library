package com.tazering.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExpandedSimpleWindow extends JFrame {

    JPanel jPanel;
    JLabel jLabel0;
    JTextField inputTextField;
    JButton actionButton;
    JButton secondActionButton;
    JLabel outputLabel;
    JTextArea inputTextArea;

    public static void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater(() -> {
            ExpandedSimpleWindow window = new ExpandedSimpleWindow();
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            window.addComponentsToPane(window.getContentPane());

            window.pack();
            window.setVisible(true);
        });

    }

    public ExpandedSimpleWindow() {
        jPanel = new JPanel(new BorderLayout());
        jLabel0 = new JLabel("Test Label");
        inputTextField = new JTextField( 40);
        actionButton = new JButton("Action Button");
        outputLabel = new JLabel(" ");
        inputTextArea = new JTextArea("This is an Area");
        secondActionButton = new JButton("Don't you dare click me!");
    }

    public void addComponentsToPane(Container pane) {
        jPanel.setLayout(new FlowLayout(FlowLayout.LEADING));
        jPanel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

        class ButtonListener implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equals("actionOne")) {
                    outputLabel.setText("Action has been Done");
                } else if(e.getActionCommand().equals("actionTwo")) {
                    outputLabel.setText("I will annihilate your " + inputTextField.getText());
                }

                pack();
            }

        }

        actionButton.setActionCommand("actionOne");
        actionButton.addActionListener(new ButtonListener());
        secondActionButton.setActionCommand("actionTwo");
        secondActionButton.addActionListener((ActionEvent e) -> {
            if(e.getActionCommand().equals("actionOne")) {
                outputLabel.setText("Action has been Done");
            } else if(e.getActionCommand().equals("actionTwo")) {
                outputLabel.setText("I will annihilate your " + inputTextField.getText());
            }

            pack();
        });

        jPanel.add(outputLabel);
        jPanel.add(actionButton);
        jPanel.add(secondActionButton);
        jPanel.add(inputTextField);
        jPanel.add(inputTextArea);

        pane.add(jPanel);

    }




}
