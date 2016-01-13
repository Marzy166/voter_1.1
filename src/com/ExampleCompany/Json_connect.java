package com.ExampleCompany;

import java.io.*;
import java.net.URL;
import java.nio.charset.Charset;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by MAL09150555 on 13/01/2016.
 */
public class Json_connect {
    public String username;
    //public String

    public String login(String usr, String pass) throws Exception {
        String return1;
        String url = "http://impresserve.co.uk/oop/election.php?method=get&username=" + usr;
        JSONObject json = readJsonFromUrl(url);
        String real_user = (json.getJSONObject("1")).get("user").toString();
        String real_name = (json.getJSONObject("1")).get("firstname").toString();
        String real_pass = (json.getJSONObject("1")).get("pass").toString();
        String has_voted = (json.getJSONObject("1")).get("voted").toString();

        if (pass.equals(real_pass)) {
            if(has_voted.equals("0")) {
                return1 = "1";
            }else {
                return1 = "2";
            }
        } else {

            return1 = "0";
        }

        return return1;
    }

    public String placeVote(String url) throws Exception {
        JSONObject json = readJsonFromUrl(url);
        String response1 = json.get("result").toString();
        return response1;
    }

    private static String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }

    public static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
        InputStream is = new URL(url).openStream();
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
            String jsonText = readAll(rd);
            JSONObject json = new JSONObject(jsonText);
            return json;
        } finally {
            is.close();
        }
    }
}
