package com.ExampleCompany;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

/**
 * Created by mar08139317 on 03/11/2015.
 */
public class jframe{

    // yhjgfhkjkhkjhjkhjkhjkhjklhk

        public static void main(String[] args){


            JFrame myFirstFrame = new JFrame("Hello World");
            myFirstFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            myFirstFrame.setSize(400, 400);
            myFirstFrame.setVisible(true);


            JMenuBar menuBar = new JMenuBar();
            JMenu file = new JMenu("File");
            file.setMnemonic(KeyEvent.VK_F);

            JMenuItem exit = new JMenuItem("Exit");
            exit.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            });

            file.add(exit);
            menuBar.add(file);

            myFirstFrame.add(menuBar);

            BoxLayout boxlayout = new BoxLayout (myFirstFrame.getContentPane(), BoxLayout.Y_AXIS);
            myFirstFrame.setLayout(boxlayout);

            JLabel title = new JLabel("Type your First Name");
            myFirstFrame.add(title);

            JTextField firstName = new JTextField(100);
            myFirstFrame.add(firstName);

            JButton process = new JButton("Process");

                myFirstFrame.add(process);
                myFirstFrame.setVisible(true);
        }


}