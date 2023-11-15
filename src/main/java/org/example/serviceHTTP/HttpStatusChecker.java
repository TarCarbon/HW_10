package org.example.serviceHTTP;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

public class HttpStatusChecker {

    public static String getStatusImage(int code) {
        try {
            URI uri = new URI("https", "http.cat", ( "/".concat(String.valueOf(code)).concat(".jpg") ), null);
            URL url = uri.toURL();

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            int responseCode = connection.getResponseCode();
            if(responseCode != 404) {
                    return uri.getScheme().concat("://").concat(uri.getHost()).concat(uri.getPath());
                } else throw new Exception() ;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
