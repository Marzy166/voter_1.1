package com.ExampleCompany;

import javax.swing.*;
import java.awt.*;

/**
 * Created by mar08139317 on 04/01/2016.
 */
public class content {
    // Set all panels sizes as the same!
    public JPanel home(){
        JPanel content = new JPanel();
        content.setPreferredSize(new Dimension(400, 400));
        content.setBackground(Color.white);
        JLabel home_text = new JLabel("This is home");
        content.add(home_text);
        return content;
    }

    // vote panel
    public JPanel vote(){
        JPanel content = new JPanel();

        content.setPreferredSize(new Dimension(400, 400));
        content.setBackground(Color.white);
        JLabel home_text = new JLabel("This is a vote box");
        content.add(home_text);
        return content;
    }

    //reason panel
    public JPanel reason(){
        JPanel content = new JPanel();

        content.setPreferredSize(new Dimension(400, 400));
        content.setBackground(Color.white);
        JLabel home_text = new JLabel("This is reason");
        content.add(home_text);
        return content;
    }

    // help panel
    public JPanel help(){
        JPanel content = new JPanel();

        content.setPreferredSize(new Dimension(400, 400));
        content.setBackground(Color.white);
        JLabel home_text = new JLabel("This is help");
        content.add(home_text);
        return content;
    }
}
