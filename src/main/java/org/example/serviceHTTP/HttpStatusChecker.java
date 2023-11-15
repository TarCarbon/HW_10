package org.example.serviceHTTP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class HttpStatusChecker {

    public String getStatusImage(int code) throws IOException {

        String str = "https://http.cat/" + code + ".jpg";
        URL url = new URL(str);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();

        if (httpURLConnection.getResponseCode() == 200) {
            return httpURLConnection.getURL().toString();
        } else {
            throw new IOException("Non-existent code");
        }
    }
}
