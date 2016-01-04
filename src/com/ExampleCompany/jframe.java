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
            menu.setAlignmentX(Component.LEFT_ALIGNMENT);
            menu.setSize(200, 200);

            JButton home =  new JButton("Home");
            JButton vote =  new JButton("Vote");
            JButton reason =  new JButton("Why Vote?");
            JButton help = new JButton("Help/Contact");
            menu.add(home);
            menu.add(vote);
            menu.add(reason);
            menu.add(help);

            //Aidan - Added taskbar and buttons for app.

            BoxLayout boxlayout = new BoxLayout (myFirstFrame.getContentPane(), BoxLayout.Y_AXIS);
            myFirstFrame.setLayout(boxlayout);

            myFirstFrame.add(menu);

            JTextField firstName = new JTextField(100);
            myFirstFrame.add(firstName);

            JButton process = new JButton("Process");
               // myFirstFrame.add(home);
                myFirstFrame.add(process);
                myFirstFrame.setVisible(true);


        }


}