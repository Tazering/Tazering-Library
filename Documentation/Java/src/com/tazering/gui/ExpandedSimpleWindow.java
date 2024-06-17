package com.tazering.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExpandedSimpleWindow extends JFrame {

    private JLabel infoLabel;
    private JButton actionButton;
    private JTextField textField;
    private JTextArea textArea;
    private JPanel mainPanel;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JRadioButton yesButton;
    private JRadioButton noButton;
    private JButton lightningButton;

    private FlowLayout flowLayout;

    public ExpandedSimpleWindow() {
        infoLabel = new JLabel("Hello, World!");
        actionButton = new JButton("Action Button");
        textField = new JTextField(40);
        textArea = new JTextArea();
        yesButton = new JRadioButton("Yes");
        noButton = new JRadioButton("No");
        flowLayout = new FlowLayout(FlowLayout.LEADING);
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        mainPanel = new JPanel();
        lightningButton = new JButton("Lightning Button");

    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    public static void createAndShowGUI() {
        ExpandedSimpleWindow frame = new ExpandedSimpleWindow();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addComponentsToPane(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    public void addComponentsToPane(Container pane) {
        panel1.setLayout(flowLayout);
        panel1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        panel1.add(infoLabel);

        class ButtonListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(actionEvent.getActionCommand().equals("action")) {
                    infoLabel.setText("Clicked!");
                    pack();
                } else if(actionEvent.getActionCommand().equals("lightningClick")) {
                    infoLabel.setText("Lightning Strike");
                    pack();
                }

            }
        }
        actionButton.setActionCommand("action");
        actionButton.addActionListener(new ButtonListener());

        lightningButton.setActionCommand("lightningClick");
        lightningButton.addActionListener(new ButtonListener());
        panel1.add(actionButton);
        panel1.add(lightningButton);

        textField.setColumns(40);
        panel2.add(textField);

        panel2.add(textArea);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(yesButton);
        buttonGroup.add(noButton);
        panel3.add(new JLabel("Do you like pineapple on your pizza?"));
        panel3.add(yesButton);
        panel3.add(noButton);

        mainPanel.add(panel1);
        mainPanel.add(panel2);
        mainPanel.add(panel3);

        pane.add(mainPanel);

    }
}
