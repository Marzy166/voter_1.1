package com.ExampleCompany;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.JRadioButton;

/**
 * Created by mar08139317 on 04/01/2016.
 */
public class content {
    // Set all panels sizes as the same!
    public JPanel home(){
        JPanel content = new JPanel();
        content.setPreferredSize(new Dimension(400, 400));
        content.setBackground(Color.white);
        JLabel home_text = new JLabel("Welcome to your schools electronic ballot box! Please find");
        JLabel home_ln2 = new JLabel("all the necessary information in the other options in the app.");
        JLabel home_ln3 = new JLabel("Remember, every vote counts!");
        content.add(home_text);
        content.add(home_ln2);
        content.add(home_ln3);
        return content;
    }

    public JPanel login(){
        JPanel content = new JPanel();

        content.setPreferredSize(new Dimension(400, 400));
        content.setBackground(Color.white);
        JLabel home_text = new JLabel("Please Login below:");
        content.add(home_text);

        return content;
    }

    // vote panel
    public JPanel vote(){
        JPanel content = new JPanel();

        content.setPreferredSize(new Dimension(400, 400));
        content.setBackground(Color.white);
        JLabel home_text = new JLabel("Please vote for the preferred student below:");
        content.add(home_text);

        // Aidan - Added buttons below so they appear in a 2 x 2 grid with display of names next to each radio button.

        JRadioButton button1 = new JRadioButton("John Smith");
        JRadioButton button2 = new JRadioButton("Mary Pane");
        JRadioButton button3 = new JRadioButton("Jane Doe");
        JRadioButton button4 = new JRadioButton("Jack Crack");

        ButtonGroup buttongroup = new ButtonGroup();
        buttongroup.add(button1);
        buttongroup.add(button2);
        buttongroup.add(button3);
        buttongroup.add(button4);

        JPanel radioPanel = new JPanel();
        radioPanel.setLayout(new GridLayout(2,2));
        radioPanel.add(button1);
        radioPanel.add(button2);
        radioPanel.add(button3);
        radioPanel.add(button4);

        content.add(radioPanel);
        return content;
    }

    //reason panel
    public JPanel reason(){
        JPanel content = new JPanel();

        content.setPreferredSize(new Dimension(400, 400));
        content.setBackground(Color.white);
        JLabel home_text = new JLabel("Voting is a fair system that show popularity and a margin");
        JLabel home_ln2 = new JLabel("of which student will win the election for presidency");
        JLabel home_ln3 = new JLabel("in 2016. Every student who participates will decide");
        JLabel home_ln4 = new JLabel("who should win and the majority of the votes will");
        JLabel home_ln5 = new JLabel("be counted at the end of the 3 month period.");
        content.add(home_text);
        content.add(home_ln2);
        content.add(home_ln3);
        content.add(home_ln4);
        content.add(home_ln5);
        return content;
    }

    // help panel
    public JPanel help(){
        JPanel content = new JPanel();

        content.setPreferredSize(new Dimension(400, 400));
        content.setBackground(Color.white);
        JLabel home_text = new JLabel("For any help or advice, please contact us from our email addresses:");
        JLabel home_ln2 = new JLabel("aaron.mars@hotmail.co.uk or aidan-malone@hotmail.com");
        content.add(home_text);
        content.add(home_ln2);
        return content;
    }
}

