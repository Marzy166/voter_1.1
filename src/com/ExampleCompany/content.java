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
        JLabel home_text = new JLabel("Our online Ballot Box provides quick and easy voting for any user");
        JLabel home_ln2 = new JLabel("also make sure that the security of each user voter is kept safe.");
        JLabel home_ln3 = new JLabel("With most transactions taking place online, it is useful to be");
        JLabel home_ln4 = new JLabel("able to vote online too");
        JLabel home_ln5 = new JLabel("It's faster, easier and more convenient.");
        content.add(home_text);
        content.add(home_ln2);
        content.add(home_ln3);
        content.add(home_ln4);
        content.add(home_ln5);
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
        JLabel home_text = new JLabel("Not many people are a fan of paper ballots, the Administer ");
        JLabel home_ln2 = new JLabel("has to create the ballots from scratch and manage the responses.");
        JLabel home_ln3 = new JLabel("They also have to track every ballot cast without revealing");
        JLabel home_ln4 = new JLabel("who cast them and manage the disposal of the ballots");
        JLabel home_ln5 = new JLabel("They do this all while calculating results.");
        JLabel home_ln6 = new JLabel("There is also the costs of printing the ballots and postage");
        content.add(home_text);
        content.add(home_ln2);
        content.add(home_ln3);
        content.add(home_ln4);
        content.add(home_ln5);
        content.add(home_ln6);
        return content;
    }

    // help panel
    public JPanel help(){
        JPanel content = new JPanel();

        content.setPreferredSize(new Dimension(400, 400));
        content.setBackground(Color.white);
        JLabel home_text = new JLabel("For any help or advise, please contact us from our email addresses:");
        JLabel home_ln2 = new JLabel("Aaron.mars@hotmail.co.uk");
        JLabel home_ln3 = new JLabel("");
        content.add(home_text);
        content.add(home_ln2);
        content.add(home_ln3);
        return content;
    }
}
