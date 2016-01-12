package com.ExampleCompany;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;



/**
 * Created by mar08139317 on 03/11/2015.
 */
public class jframe{



    public static void main(String[] args) {


        JFrame myFirstFrame = new JFrame("Voting Application");
        myFirstFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        myFirstFrame.setSize(600, 400);
        myFirstFrame.setVisible(true);

        JPanel menu = new JPanel();
        menu.setBackground(Color.decode("#80beff"));
        menu.setAlignmentX(Component.LEFT_ALIGNMENT);
        JPanel content = new JPanel();
        JPanel in_content = new JPanel();
        content.setAlignmentX(Component.LEFT_ALIGNMENT);
        content.setSize(200, 200);

        content.add(in_content);
        content.setBackground(Color.white);

        JButton home =  new JButton("Home");
        JButton login = new JButton("Login");
        JButton vote =  new JButton("Vote");
        JButton reason =  new JButton("Why Vote?");
        JButton help = new JButton("Help/Contact");


        menu.add(home);
        menu.add(login);
        menu.add(vote);
        menu.add(reason);
        menu.add(help);
        //Aidan - Added taskbar and buttons for app.

        BoxLayout boxlayout = new BoxLayout (myFirstFrame.getContentPane(), BoxLayout.Y_AXIS);
        myFirstFrame.setLayout(boxlayout);

        myFirstFrame.add(menu);
        myFirstFrame.add(content);

        // Run home as first
        content new_panel = new content();
        content.removeAll();
        in_content.add(new_panel.home());
        in_content.setBackground(Color.white);
        content.add(in_content);
        myFirstFrame.pack();


        myFirstFrame.setVisible(true);

        // home button event
        home.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                content new_panel = new content();
                content.removeAll();
                JPanel in_content = new JPanel();
                in_content.setBackground(Color.white);
                in_content.add(new_panel.home());
                content.add(in_content);
                myFirstFrame.pack();

            }
        });


        login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                content new_panel = new content();
                content.removeAll();
                JPanel in_content = new JPanel();
                in_content.setBackground(Color.white);
                in_content.add(new_panel.login());
                content.add(in_content);
                myFirstFrame.pack();

            }
        });

        // vote button event
        vote.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                content new_panel = new content();
                content.removeAll();
                JPanel in_content = new JPanel();
                in_content.setBackground(Color.white);
                in_content.add(new_panel.vote());
                content.add(in_content);
                myFirstFrame.pack();


            }
        });

        // reason button event
        reason.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                content new_panel = new content();
                content.removeAll();
                JPanel in_content = new JPanel();
                in_content.setBackground(Color.white);
                in_content.add(new_panel.reason());
                content.add(in_content);
                myFirstFrame.pack();

            }
        });

        // help button event
        help.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                content new_panel = new content();
                content.removeAll();
                JPanel in_content = new JPanel();
                in_content.setBackground(Color.white);
                in_content.add(new_panel.help());
                content.add(in_content);
                myFirstFrame.pack();

            }
        });
    }


}