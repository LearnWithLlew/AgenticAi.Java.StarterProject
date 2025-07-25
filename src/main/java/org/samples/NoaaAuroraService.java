package org.samples;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NoaaAuroraService {
    public static String getAuroraAlert(String city, double latitude, double longitude) throws Exception {
        // Auroras.live current endpoint
        String url = "https://api.auroras.live/v1/?type=all&lat=" + latitude + "&long=" + longitude + "&forecast=false";
        HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
        conn.setInstanceFollowRedirects(true);
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Accept", "application/json");
        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), StandardCharsets.UTF_8));
        StringBuilder response = new StringBuilder();
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        conn.disconnect();
        String auroraJson = response.toString();
        return auroraJson;
    }
}

