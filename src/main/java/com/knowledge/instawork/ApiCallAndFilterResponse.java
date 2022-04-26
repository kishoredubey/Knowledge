package com.knowledge.instawork;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Call the external API
// filter if title and story title both are null
// return limited record
// sort based on title and story title
public class ApiCallAndFilterResponse {
    public static void main(String[] args) {
        System.out.println(callAndReturn("epaga", 2));
    }

    //https://jsonmock.hackerrank.com/api/articles?author=<username>&page=<pageNumber>
    private static List<String> callAndReturn(String epaga, int limit) {
        int pages = 1;
        Gson gson = new Gson();
        List<Datum> dataList = new ArrayList<>();
        for (int i = 0; i < pages; i++) {
            Root root = gson.fromJson(callApi(epaga, i), Root.class);
            pages = root.getTotalPages() == null ? pages : root.getTotalPages();
            dataList.addAll(root.getData());
        }
        return dataList.stream()
                .filter(
                        t -> !(t.getTitle() == null && t.getStoryTitle() == null)
                )
                .sorted()
                .limit(limit)
                .map(
                        d -> {
                            if (d.getTitle() != null) return d.getTitle();
                            else return d.getStoryTitle();
                        })
                .collect(Collectors.toList());
    }

    private static String callApi(String epaga, int page) {
        StringBuilder sb = new StringBuilder();
        try {
            URL url = new URL("https://jsonmock.hackerrank.com/api/articles?author=" + epaga + "&page=" + page);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");
            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }
            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
            String output;
            System.out.println("Output from Server .... \n");
            while ((output = br.readLine()) != null) {
                sb.append(output);
            }
            conn.disconnect();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
