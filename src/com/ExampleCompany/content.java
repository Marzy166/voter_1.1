package com.ExampleCompany;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import javax.swing.JRadioButton;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Objects;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


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
        JLabel home_text = new JLabel("Login:");
        JTextField username = new JTextField("def987654",20);
        JTextField password = new JPasswordField("",20);
        content.add(home_text);
        content.add(username);
        content.add(password);

        JButton loginB = new JButton("login");
        content.add(loginB);

        loginB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String usr;
                Json_connect connect = new Json_connect();
                try {
                    String login = connect.login(username.getText(), password.getText());
                    if (login.equals("2")) {
                        usr = username.getText();
                        JFrame newer = new JFrame("vote | " + usr);
                        newer.setSize(600, 400);
                        newer.setVisible(true);

                        JPanel content = new JPanel();

                        content.setPreferredSize(new Dimension(400, 400));
                        content.setBackground(Color.white);
                        JLabel home_text = new JLabel("Please vote for the preferred student below:");

                        content.add(home_text);

                        // mAidan - Added buttons below so they appear in a 2 x 2 grid with display of names next to each radio button.

                        JRadioButton button1 = new JRadioButton("John Smith");
                        JRadioButton button2 = new JRadioButton("Mary Pane");
                        JRadioButton button3 = new JRadioButton("Jane Doe");

                        ButtonGroup buttongroup = new ButtonGroup();
                        buttongroup.add(button1);
                        buttongroup.add(button2);
                        buttongroup.add(button3);

                        JPanel radioPanel = new JPanel();
                        radioPanel.setLayout(new GridLayout(1, 3));
                        radioPanel.add(button1);
                        radioPanel.add(button2);
                        radioPanel.add(button3);
                        JButton cast_vote = new JButton("Cast Vote");
                        cast_vote.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                String url = "unset";
                                Json_connect connect = new Json_connect();
                                if (button1.isSelected()) {
                                    url = "http://impresserve.co.uk/oop/election.php?method=set&username=" + usr + "&vote=1";
                                } else if (button2.isSelected()) {
                                    url = "http://impresserve.co.uk/oop/election.php?method=set&username=" + usr + "&vote=2";
                                } else if (button3.isSelected()) {
                                    url = "http://impresserve.co.uk/oop/election.php?method=set&username=" + usr + "&vote=3";
                                } else {
                                    JOptionPane.showMessageDialog(null, "Please select a candidate");
                                }
                                if (!url.equals("unset")) {
                                    Json_connect place = new Json_connect();
                                    try {
                                        String Vote_response = place.placeVote(url);
                                        JOptionPane.showMessageDialog(null, Vote_response);
                                        newer.setVisible(false);
                                        newer.dispose();
                                    } catch (Exception ex) {
                                        JOptionPane.showMessageDialog(null, "Error with voting");
                                    }
                                }
                                // http://impresserve.co.uk/oop/election.php?method=set&username=abc123456&vote=1
                            }
                        });

                        content.add(radioPanel);
                        content.add(cast_vote);


                        JLabel ln1 = new JLabel("Voting is quick and easy, simply go to the voting section ");
                        JLabel ln2 = new JLabel("and click the name if the person you wish to vote for.");
                        JLabel ln3 = new JLabel("Then proceed to vote");
                        content.add(ln1);
                        content.add(ln2);
                        content.add(ln3);

                        newer.add(content);
                        newer.pack();
                    } else if (login.equals("2")) {
                        JOptionPane.showMessageDialog(null, "You have already voted");
                    } else {
                        JOptionPane.showMessageDialog(null, "Wrong login information");
                    }

                } catch (Exception ex) {
                    System.out.println("Could not run");
                }

            }
        });

        return content;
    }

    // vote panel

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


    public static void sendGet(String username) throws Exception {

        String url = "http://impresserve.co.uk/oop/election.php?method=get&username=" + username;

        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        // optional default is GET
        con.setRequestMethod("GET");

        //add request header

        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        //print result

        System.out.println(response.toString());
        parseJson(response.toString());

    }

    public static void parseJson(String rawjson)throws JSONException {


        //JSONObject obj = new JSONObject(rawjson);


    }




}
